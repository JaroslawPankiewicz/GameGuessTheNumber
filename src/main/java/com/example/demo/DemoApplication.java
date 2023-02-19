package com.example.demo;

import com.sun.source.util.SourcePositions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){

        /*{SpringApplication.run(DemoApplication.class, args);} */

        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(100)+1;

        Scanner scanner = new Scanner(in);
        System.out.println("Komputer wylosuje liczbę od 0-100. Spróbuj zgadnąć jaką. Powodzenia!");
        do{
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();
            i++;
            if (los > odp){
                System.out.println("Moja liczba jest większa");
            } else if (los < odp){
                System.out.println("Moja liczba jest mniejsza");
            }
        }

        while(odp != los);{
            System.out.println("Gratulacje! Zgadłeś za " + i + "  razem.");
        }

    }


}
