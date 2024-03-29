package com.medi.LaboSolution;

import com.medi.LaboSolution.entity.Patient;
import com.medi.LaboSolution.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LaboSolutionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LaboSolutionApplication.class, args);
	}

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void run(String... args) throws Exception {


	}
}
