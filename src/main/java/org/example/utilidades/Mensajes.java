package org.example.utilidades;

public enum Mensajes {
    nombreAsegurado_distinto("Error solo permiten letras"),
    nombreAsegurado_maximo("El numero de caracteres debe estar entre 0 y 20"),
    edadAsegurado_negativo("nombre no coincide"),
    edadAsegurado_maximo(" tu eres mayor de 90 años comunicate al 01 8000 43435"),
    montoCobertura_mayor("no se puede ya que el monto ingresado es mayor que 1500 millones"),
    InicioCobertura_mala("la fecha ingresada no corresponde con lo solicitado"),
    beneficiario_maximo("el nombre tiene mas caracteres al solicitado"),
    beneficiario_distinto("el nombre del beneficiario no es posible");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}




