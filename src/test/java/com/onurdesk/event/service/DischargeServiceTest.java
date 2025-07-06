package com.onurdesk.event.service;

import com.onurdesk.event.events.PatientDischargeEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class DischargeServiceTest {

    @Mock
    private ApplicationEventPublisher eventPublisher;

    @InjectMocks
    private DischargeService dischargeService;

    @Test
    void dischargePatient_shouldPublishPatientDischargeEvent() {
        // Given
        String patientId = "testPatientId123";
        String patientName = "John Doe";

        // When
        dischargeService.dischargePatient(patientId, patientName);

        // Then
        ArgumentCaptor<PatientDischargeEvent> eventCaptor = ArgumentCaptor.forClass(PatientDischargeEvent.class);
        verify(eventPublisher).publishEvent(eventCaptor.capture());

        PatientDischargeEvent publishedEvent = eventCaptor.getValue();
        assertEquals(patientId, publishedEvent.getPatientId());
        assertEquals(patientName, publishedEvent.getPatientName());
    }
}
