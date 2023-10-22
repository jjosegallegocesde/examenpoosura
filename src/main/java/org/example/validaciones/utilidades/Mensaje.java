package org.example.validaciones.utilidades;

public enum Mensaje {

    LONGITUD_N0MBRE("LONGITUD INVALIDAD"),
    FORMATO_NOMBRE("REVISE EL FORMATO, SOLO LETRAS"),
    FORMATO_EDAD("POR FAVOR COMUNIQUESE CON EL SIGUIENTE AL SIGUIENTE NUMERO PARA MAS INF 32122123233"),
    FORMATO_COBERTURA("SOLO SE ACEPTAN NUMEROS POSITIVOS"),
    LONGITUD_COBERTURA("SOLO SE ASEGURAN HASTA 1500 MILLONES"),
    LONGITUD_BENEFICIARIO("SOLO SE ADMITEN HASTA 50 CARACTERES"),
    FORMATO_BENEFICIARO("SOLO SE ACEPTAN LETRAS"),
    FORMATO_FECHA("FORMATO FECHA INCORRECTA");


    private String Mensaje;

    Mensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }
}
