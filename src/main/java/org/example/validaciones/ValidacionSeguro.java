package org.example.validaciones;

import org.example.validaciones.utilidades.Mensaje;
import org.example.validaciones.utilidades.Utilidadad;

import java.time.LocalDate;

public class ValidacionSeguro {

    Utilidadad utilidad = new Utilidadad();

    public ValidacionSeguro() {
    }

    public boolean validarNombre(String nombre) throws Exception {
        if (nombre.length() > 20) {
            throw new Exception(Mensaje.LONGITUD_N0MBRE.getMensaje());
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception(Mensaje.FORMATO_NOMBRE.getMensaje());
        }
        return true;
    }

    public boolean validarEdad(int edad) throws Exception {
        if (edad > 90) {
            throw new Exception(Mensaje.FORMATO_EDAD.getMensaje());
        }
        return true;
    }

    public boolean validarMontoCobertura(Integer montoCobertura) throws Exception {
        if (montoCobertura < 0 || montoCobertura > 1500) {
            throw new Exception(Mensaje.LONGITUD_COBERTURA.getMensaje());
        }
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, String.valueOf(montoCobertura))) {
            throw new Exception(Mensaje.FORMATO_COBERTURA.getMensaje());
        }
        return true;
    }

    public boolean validarBeneficiario(String beneficiario) throws Exception {
        if (beneficiario.length() > 50) {
            throw new Exception(Mensaje.LONGITUD_BENEFICIARIO.getMensaje());
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, beneficiario)) {
            throw new Exception(Mensaje.FORMATO_BENEFICIARO.getMensaje());
        }
        return true;
    }

    public boolean validarFecha(String fecha) throws Exception {

        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,fecha)){
            throw new Exception(Mensaje.FORMATO_FECHA.getMensaje());
        }
        return true;
    }

}

