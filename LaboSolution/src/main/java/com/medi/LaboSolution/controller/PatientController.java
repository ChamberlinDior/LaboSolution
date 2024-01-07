package com.medi.LaboSolution.controller;

import com.medi.LaboSolution.entity.Patient;
import com.medi.LaboSolution.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public String showPatientList(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "patients";
    }

    @GetMapping("/new")
    public String showCreatePatientForm(Model model) {
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        return "create_patient";
    }

    @PostMapping
    public String savePatient(@Valid @ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients";
    }

    @GetMapping("/edit/{id}")
    public String showEditPatientForm(@PathVariable Long id, Model model) {
        model.addAttribute("patient", patientService.getPatientById(id));
        return "edit_patient";
    }

    @PostMapping("/{id}")
    public String updatePatient(@PathVariable Long id, @Valid @ModelAttribute("patient") Patient patient) {
        Patient existingPatient = patientService.getPatientById(id);
        existingPatient.setId(id);
        existingPatient.setFirstName(patient.getFirstName());
        existingPatient.setLastName(patient.getLastName());
        existingPatient.setEmail(patient.getEmail());
        existingPatient.setAddress(patient.getAddress());
        existingPatient.setDateOfBirth(patient.getDateOfBirth());
        patientService.updatePatient(existingPatient);
        return "redirect:/patients";
    }

    @GetMapping("/{id}/delete")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatientById(id);
        return "redirect:/patients";
    }

    // Add exception handling if needed
    // @ExceptionHandler(ExceptionType.class)
    // public String handleException(ExceptionType ex, Model model) {
    //     // Handle the exception
    //     return "errorPage";
    // }
}
