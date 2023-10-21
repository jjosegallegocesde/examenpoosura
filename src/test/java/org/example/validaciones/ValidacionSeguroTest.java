package org.example.validaciones;
import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class ValidacionSeguroTest
{
    ValidacionSeguro validacionSeguro;

    @BeforeEach
    public void testPrueba()
    {
        this.validacionSeguro = new ValidacionSeguro();
    }

    @Test
    void validarNombreAseguradoCorrecto()
    {
        String nombreP = "Boris Fernandez";
        Boolean resultado = assertDoesNotThrow(() -> this.validacionSeguro.validarNombreAsegurado(nombreP));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreAseguradoInCorrecto()
    {
        String nombreP = "Boris Fernandez12";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarNombreAsegurado(nombreP));
        Assertions.assertEquals(Mensajes.NOMBREASEGURADO_DIFERENTE.getMensaje(), resultado.getMessage());
    }
    @Test
    public void validarNombreAseguradoLon()
    {
        String nombreP = "Boris Felipe Fernandez Mejia";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarNombreAsegurado(nombreP));
        Assertions.assertEquals(Mensajes.NOMBRESASEGURADO_LON.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarEdadAseguradoCorrecto()
    {
        Integer edad = 14;
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarEdadAsegurado(edad));
    }

    @Test
    void validarEdadAseguradoInCorrecto()
    {
        int edad = -5;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarEdadAsegurado(edad));
        Assertions.assertEquals(Mensajes.EDADASEGURADO_NEGATIVO.getMensaje(), resultado.getMessage());
    }
    @Test
    void validarEdadAseguradoMax()
    {
        Integer edad = 92;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarEdadAsegurado(edad));
        Assertions.assertEquals(Mensajes.EDADASEGURADO_MAXIMO.getMensaje(), resultado.getMessage());
    }

    @Test
    void validarBeneficiarioCorrecto()
    {
        String beneficiario = "Esneider Gomez";
        Boolean resultado = assertDoesNotThrow(() -> this.validacionSeguro.validarBeneficiario(beneficiario));
        Assertions.assertTrue(resultado);
    }

    @Test
    void validarBeneficiarioInCorrecto()
    {
        String beneficiario = "Sebastian123";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarBeneficiario(beneficiario));
        Assertions.assertEquals(Mensajes.BENEFICIARIO_DIFERENTE.getMensaje(), resultado.getMessage());
    }
    @Test
    void validarBeneficiarioInCorrectoMax()
    {
        String beneficiario = "GustaboPetroooooooooooooooooooooooooooooeoeoeoroeoroeroerooroeoreothethethethethetr";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarBeneficiario(beneficiario));
        Assertions.assertEquals(Mensajes.BENEFICIARIO_MAXIMO.getMensaje(), resultado.getMessage());
    }


    @Test
    void validarMontoCoberturaCorrecto()
    {
        double montoCobertura = 1000;
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarMontoCobertura(montoCobertura));
    }
    @Test
    void validarMontoCoberturaMax()
    {
        double montoCobertura = 1503;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarMontoCobertura(montoCobertura));
        Assertions.assertEquals(Mensajes.MONTOCOBERTURA_MAYOR.getMensaje(), resultado.getMessage());
    }


    @Test
    void fechaInicioCoberturaCorrecta()
    {
        String fechaInicioCobertura = "01/12/2023";
        Assertions.assertDoesNotThrow(() -> validacionSeguro.validarFechaInicioCobertura(fechaInicioCobertura));
    }

    @Test
    void fechaInicioCoberturaInCorrecta()
    {
        String fechaStr = "2023/3/13/";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarFechaInicioCobertura(fechaStr));
        Assertions.assertEquals(Mensajes.FECHAINICIOCOBERTURA_MALA.getMensaje(), resultado.getMessage());
    }
}