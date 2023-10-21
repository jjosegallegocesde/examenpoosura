package org.example;

import org.example.modelos.Seguro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seguro Seguro = new Seguro();
        Seguro.calcularPrima();
        System.out.println("DIGITA EL ID DEL USUARIO");
        Seguro.setNombreAsegurado(scanner.next());

    }
}