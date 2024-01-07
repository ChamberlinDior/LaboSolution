package com.medi.LaboSolution.repository;

import com.medi.LaboSolution.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
