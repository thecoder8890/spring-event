package com.onurdesk.event.service;

import com.onurdesk.event.events.PatientDischargeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DischargeService {
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    public String dischargePatient(String patientId, String patientName){
        log.info("patient discharge process started {} ", patientName);
        eventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));

        log.info("patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";

    }
}
