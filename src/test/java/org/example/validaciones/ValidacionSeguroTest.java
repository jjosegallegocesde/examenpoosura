package org.example.validaciones;

import org.example.validaciones.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionSeguroTest {
    ValidacionSeguro validacionSeguro;
    @BeforeEach
    public void prepararPruebas(){
        this.validacionSeguro=new ValidacionSeguro();
    }
    @Test
    public void validarNombreCorrecto(){
    String nombreCorrecto="felipe";
    boolean resultadoNombre= Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarNombre(nombreCorrecto));
    Assertions.assertTrue(resultadoNombre);
    }
    @Test
    public void validarNombreIncorrecto(){
        String nombreIncorrecto="felipe1";
        Exception resultadoNombre=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarNombre(nombreIncorrecto));
        Assertions.assertEquals(Mensaje.FORMATO_NOMBRE.getMensaje(),resultadoNombre.getMessage());
    }

    @Test
    public void validarNombreLongitud(){
        String nombreIncorrecto="fellllllllllllllllllll";
        Exception resultadoNombre=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarNombre(nombreIncorrecto));
        Assertions.assertEquals(Mensaje.LONGITUD_N0MBRE.getMensaje(),resultadoNombre.getMessage());
    }
    @Test
    public void validarEdadCorrecta(){

        Integer edadPrueba = 50;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarEdad(edadPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarEdadIncorrectaPorLongitud(){

        Integer edadPrueba = 91;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdad(edadPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_EDAD.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarMontoCoberturaCorrecta(){

        Integer montoCorrecto =50;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarMontoCobertura(montoCorrecto));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarMontoCoberturaIncorrectaNegativa(){

        Integer montoIncorrecto =-50;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarMontoCobertura(montoIncorrecto));
        Assertions.assertEquals(Mensaje.LONGITUD_COBERTURA.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarMontoCoberturaIncorrectaPorLongitud(){

        Integer montoNoValido =1600;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarMontoCobertura(montoNoValido));
        Assertions.assertEquals(Mensaje.LONGITUD_COBERTURA.getMensaje(),resultado.getMessage());
    }
    @Test
    public  void validarBeneficiarioCorrecto(){
        String beneficiaron = "Felipe";
        Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionSeguro.validarBeneficiario(beneficiaron));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void  validarBeneficiarioIncorrectoPorTipoCaracter(){

        String beneficiarioIncorrecto = "1235natajshhs";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarBeneficiario(beneficiarioIncorrecto));
        Assertions.assertEquals(Mensaje.FORMATO_BENEFICIARO.getMensaje(),resultado.getMessage());
    }

    @Test
    public  void validarBeneficiarioIncorrectoPorLongitud(){

        String beneficiarioLon = "nasikdjfsghdfhgdsoidksdcjhsbdfsldcfkjskdfgsodi;fkjskdhufpsdohsgdfidhfiopiofdhgfififofofofofofof";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarBeneficiario(beneficiarioLon));
        Assertions.assertEquals(Mensaje.LONGITUD_BENEFICIARIO.getMensaje(),resultado.getMessage());
    }
    @Test

    public void ValidarFechaCorrecta(){
        String fechaPrueba= "23/12/2020";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarFecha(fechaPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarFehcaIncorrecta(){
        String fechaPrueba= "322/12/2020";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarFecha(fechaPrueba));
        Assertions.assertEquals(Mensaje.FORMATO_FECHA.getMensaje(),resultado.getMessage());
    }

}
