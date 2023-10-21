package org.example.utilidades;

public enum Mensajes {
    //Mensajes NombreAsegurado
    NOMBRESASEGURADO_LON("El numero de caracteres debe tener una longitud maxima de 20 caracteres"),
    NOMBREASEGURADO_DIFERENTE("El nombre no cumple los parametros"),
    //Mensajes EdadAsegurado
    EDADASEGURADO_MAXIMO("Como eres mayor a 90 años comuniquese a este numero 3219829231"),
    EDADASEGURADO_NEGATIVO("La edad ingresada no es correcta"),
    //Mensajes Beneficiario
    BENEFICIARIO_MAXIMO("El beneficiario debe tener un maximo de 50 caracteres contando espacios"),
    BENEFICIARIO_DIFERENTE("Los caracteres ingresados no son validos"),
    //Mensajes Monto cobertura
    MONTOCOBERTURA_MAYOR("El monto maximo de cobertura son 1500 millones"),
    //Mensaje fecha
    FECHAINICIOCOBERTURA_MALA("El formato de la fecha es inválido. Debe ser DD/MM/YYYY.");


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
