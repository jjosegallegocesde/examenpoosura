package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidacionSeguro
    {
        Utilidades utilidades = new Utilidades();

        public ValidacionSeguro()
        {

        }
        public boolean validarNombreAsegurado(String nombreAsegurado) throws Exception
        {
            if (nombreAsegurado.length() <1 || nombreAsegurado.length()>=20)
            {
                throw new Exception(Mensajes.NOMBRESASEGURADO_LON.getMensaje());
            }
            String expresionRegular = "^[a-zA-Z ]+$";
            if (!this.utilidades.buscarCoincidencia(expresionRegular, nombreAsegurado))
            {
                throw new Exception(Mensajes.NOMBREASEGURADO_DIFERENTE.getMensaje());
            }
            return true;
        }
        public  boolean validarEdadAsegurado(int edadAsegurado) throws Exception
        {
            if (edadAsegurado<0){
                throw new Exception(Mensajes.EDADASEGURADO_NEGATIVO.getMensaje());
            }
            if (edadAsegurado>90){
                throw new Exception(Mensajes.EDADASEGURADO_MAXIMO.getMensaje());
            }
            return true;
        }
        public boolean validarBeneficiario(String beneficiario) throws Exception
        {
            if (beneficiario.length() <0 || beneficiario.length() >=50)
            {
                throw new Exception(Mensajes.BENEFICIARIO_MAXIMO.getMensaje());
            }
            String expresionRegular = "^[a-zA-Z ]+$";
            if (!this.utilidades.buscarCoincidencia(expresionRegular,beneficiario))
            {
                throw new Exception(Mensajes.BENEFICIARIO_DIFERENTE.getMensaje());
            }
            return true;
        }
        public boolean validarMontoCobertura(double montoCobertura) throws Exception
        {
            if (montoCobertura>=1500.0){
                throw new Exception(Mensajes.MONTOCOBERTURA_MAYOR.getMensaje());
            }

            return true;
        }
        public LocalDate  validarFechaInicioCobertura (String fechaInicioCobertura) throws Exception {
            String patron = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
            if (!fechaInicioCobertura.matches(patron)) {
                throw new Exception(Mensajes.FECHAINICIOCOBERTURA_MALA.getMensaje());
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaInicioCobertura, formatter);

            return fecha;
        }
    }




