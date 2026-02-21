package com.github.alon01.mislibrosher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MisLibrosHerApplication implements Runnable {

	public static void main(String[] args) {
		SpringApplication.run(MisLibrosHerApplication.class, args);

	}


	@Override
	public void run() {
		System.out.println("Iniciando run...");
	}
}
