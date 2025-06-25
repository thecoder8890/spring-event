package com.onurdesk.event.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onurdesk.event.dto.Patient;
import com.onurdesk.event.handler.CheckOutHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DischargeControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @SpyBean
    private CheckOutHandler checkOutHandler;

    @Test
    void dischargePatient_shouldReturnSuccessMessageAndTriggerEventHandler() throws Exception {
        // Given
        Patient patient = new Patient();
        patient.setPatientId("integrationTestPatientId");
        patient.setPatientName("Jane Doe");

        String expectedResponse = "Patient Jane Doe with ID integrationTestPatientId discharged successfully!";

        // When & Then
        mockMvc.perform(post("/discharge/process")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(patient)))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));

        // Verify that the CheckOutHandler.processBill method was called
        // Using timeout to handle asynchronous event processing
        verify(checkOutHandler, timeout(1000).times(1)).processBill(any());
    }
}
