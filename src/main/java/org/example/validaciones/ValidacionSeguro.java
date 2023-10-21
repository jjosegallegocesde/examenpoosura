package org.example.validaciones;

import org.example.utilidades.CambiarFechas;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.time.LocalDate;

public class ValidacionSeguro {
    Utilidad utilidad = new Utilidad();


    public ValidacionSeguro(){

    }
    public Boolean validarNombreAsegurado(String nombreAsegurado) throws Exception{

        if (nombreAsegurado.length()>20){
            throw new Exception(Mensajes.nombreAsegurado_maximo.getMensaje());

        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombreAsegurado)){
            throw new Exception(Mensajes.nombreAsegurado_distinto.getMensaje());


        }
        return true;
    }
    public Boolean ValidaredadAsegurado(Integer edadAsegurado)throws Exception{
        if (edadAsegurado<0){
            throw new Exception(Mensajes.edadAsegurado_negativo.getMensaje());
        }
        if (edadAsegurado>90){
            throw new Exception(Mensajes.edadAsegurado_maximo.getMensaje());
        }
        return true;
    }
    public Boolean validarMontoCobertura(Double montoCobertura)throws Exception{
        if (montoCobertura>=1500.0){
            throw new Exception(Mensajes.montoCobertura_mayor.getMensaje());
        }

        return true;
    }
    public Boolean validarFechaInicioCobertura(String InicioCoberturaMala) throws Exception {
        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        if (!this.utilidad.buscarCoincidencia(expresionRegular, InicioCoberturaMala)) {
            throw new Exception(Mensajes.InicioCobertura_mala.getMensaje());
        }

    LocalDate localDate = null;
        try {
        localDate = CambiarFechas.CambiarString(InicioCoberturaMala);
    } catch (Exception e) {
        throw new Exception(Mensajes.beneficiario_distinto.getMensaje());
    }
        return true;
    }
    public Boolean ValidarBeneficiario(String beneficiario) throws Exception {
        if (beneficiario.length() > 50) {
            throw new Exception(Mensajes.beneficiario_maximo.getMensaje());
        }
        String expresionRegular = "^[a-zA-Z]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, beneficiario)) {
            throw new Exception(Mensajes.beneficiario_distinto.getMensaje());
        }
        return true;
    }
}


