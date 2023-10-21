package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades
{
    public Boolean buscarCoincidencia(String expresionRegular, String cadenaTexto){
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher coincidencia=pattern.matcher(cadenaTexto);
        if(coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }
}