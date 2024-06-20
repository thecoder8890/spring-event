package com.onurdesk.event.handler;

import com.onurdesk.event.events.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CheckOutHandler {

    @EventListener
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("CheckOutHandler : Finalizing bill for patient "
                + patientDischargeEvent.getPatientId() + " : " + Thread.currentThread().getName());
    }
}
