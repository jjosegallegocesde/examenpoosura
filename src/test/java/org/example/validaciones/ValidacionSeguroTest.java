package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSeguroTest {

    ValidacionSeguro validacionSeguro;

    @BeforeEach
    public void setup() {
        this.validacionSeguro = new ValidacionSeguro();
    }

    @Test
    void validarNombreAseguradoBueno() {
        String nombreAsegurado = "Esneider";
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarNombreAsegurado(nombreAsegurado));
    }

    @Test
    void validarNombreAseguradoIncorrectoTipoCaracteres() {
        String nombrePrueba = "Esneider19";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals(Mensajes.nombreAsegurado_distinto.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarNombreAseguradoIncorrectoLargo() {
        String nombrePruebaDos = "5647875757353535453541";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.validarNombreAsegurado(nombrePruebaDos));
        Assertions.assertEquals(Mensajes.nombreAsegurado_maximo.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarEdadAseguradoBueno() {
        Integer edad = 42;
        Assertions.assertDoesNotThrow(() -> validacionSeguro.ValidaredadAsegurado(edad));
    }

    @Test
    void validarEdadAseguradoNegativo() {
        Integer edad = -15;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.ValidaredadAsegurado(edad));
        Assertions.assertEquals(Mensajes.edadAsegurado_negativo.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarEdadAseguradoMayor() {
        Integer edad = 98;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.ValidaredadAsegurado(edad));
        Assertions.assertEquals(Mensajes.edadAsegurado_maximo.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarMontoCoberturaBueno() {
        Double montoCobertura = 1000.0;
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarMontoCobertura(montoCobertura));
    }

    @Test
    void validarMontoCoberturaMayor() {
        Double montoCobertura = 2000.0;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.validarMontoCobertura(montoCobertura));
        Assertions.assertEquals(Mensajes.montoCobertura_mayor.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarFechaInicioCoberturaBueno() {
        String fechaInicioCobertura = "19/11/2023";
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarFechaInicioCobertura(fechaInicioCobertura));
    }

    @Test
    void validarFechaInicioCoberturaMala() {
        String fechaInicioCobertura = "2022/07/12";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.validarFechaInicioCobertura(fechaInicioCobertura));
        Assertions.assertEquals(Mensajes.InicioCobertura_mala.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarBeneficiarioBueno() {
        String beneficiarioBueno = "Pedro";
        Assertions.assertDoesNotThrow(() -> validacionSeguro.ValidarBeneficiario(beneficiarioBueno));
    }


    @Test
    void validarBeneficiarioLargo() {
        String beneficiario = "Este es un beneficiario con un nombre muy largo que supera los 50 caracteres";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.ValidarBeneficiario(beneficiario));
        Assertions.assertEquals(Mensajes.beneficiario_maximo.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarBeneficiarioCaracteres() {
        String beneficiario = "PedroAguilarRamirez123";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> validacionSeguro.ValidarBeneficiario(beneficiario));
        Assertions.assertEquals(Mensajes.beneficiario_distinto.getMensaje(), resultado.getMessage());
    }
}
