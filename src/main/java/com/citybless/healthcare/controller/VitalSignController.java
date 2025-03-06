package com.citybless.healthcare.controller;

import com.citybless.healthcare.model.VitalSign;
import com.citybless.healthcare.service.VitalSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class VitalSignController {
    @Autowired
    private VitalSignService vitalSignService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("vitalSigns", vitalSignService.getAllVitalSigns());
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam String patientName, Model model) {
        List<VitalSign> vitalSigns = vitalSignService.getVitalSignsByPatientName(patientName);
        model.addAttribute("vitalSigns", vitalSigns);
        return "home";
    }

    @PostMapping("/add")
    public String addVitalSign(VitalSign vitalSign) {
        vitalSignService.addVitalSign(vitalSign);
        return "redirect:/home";
    }
}