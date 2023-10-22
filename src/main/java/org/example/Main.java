package org.example;

import org.example.modelos.Seguro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Seguro seguro = new Seguro();
        seguro.setNombreAsegurado("felipe");
        seguro.calcularPrima();
        System.out.println(seguro.calcularPrima());
    }
}