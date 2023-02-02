package com.advantage.shoping.exceptions;

public class ExceptionsControl extends AssertionError{
    public static final String usuarioIncorrecto = "El nombre del usuario presentado en el home no es esperado";

    public ExceptionsControl(String message, Throwable cause){
        super(message, cause);
    }
}