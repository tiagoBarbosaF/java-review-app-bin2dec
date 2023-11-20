package com.tiago.bin2dec;

import com.tiago.bin2dec.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bin2decApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Bin2decApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Main.start();
    }
}
