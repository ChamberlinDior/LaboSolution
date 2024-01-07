package com.medi.LaboSolution.service.impl;

import com.medi.LaboSolution.entity.Patient;
import com.medi.LaboSolution.repository.PatientRepository;
import com.medi.LaboSolution.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        super();
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);

    }
}
