package com.citybless.healthcare.service;

import com.citybless.healthcare.model.VitalSign;
import com.citybless.healthcare.repository.VitalSignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VitalSignService {
    @Autowired
    private VitalSignRepository vitalSignRepository;

    public List<VitalSign> getAllVitalSigns() {
        return vitalSignRepository.findAll();
    }

    public List<VitalSign> getVitalSignsByPatientName(String patientName) {
        return vitalSignRepository.findByPatientNameOrderByTimestampDesc(patientName);
    }

    public void addVitalSign(VitalSign vitalSign) {
        vitalSignRepository.save(vitalSign);
    }
}