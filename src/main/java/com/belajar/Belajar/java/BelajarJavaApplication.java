package com.belajar.Belajar.java;

import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BelajarJavaApplication {

	@Autowired
	private MahasiswaRepository mahasiswaRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarJavaApplication.class, args);
	}
}