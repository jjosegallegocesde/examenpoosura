package org.example.validaciones.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Utilidadad {
    public boolean buscarCoincidencia(String expresionRegular,String cadenaDeTexto){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadenaDeTexto);

        if (coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
    public LocalDate convertDate(String inputDate) {
        // Definir el formato de entrada
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertir la cadena a un objeto LocalDate
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);

        // Formatear la fecha en el formato deseado (yyyy-MM-dd)
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(outputFormatter);

        return LocalDate.parse(formattedDate);
    }
}
