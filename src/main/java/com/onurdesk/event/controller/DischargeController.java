package com.onurdesk.event.controller;

import com.onurdesk.event.dto.Patient;
import com.onurdesk.event.service.DischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge")
public class DischargeController {
    @Autowired
    private DischargeService dischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody Patient request) {
        return dischargeService.dischargePatient(request.getPatientId(), request.getPatientName());
    }
}
