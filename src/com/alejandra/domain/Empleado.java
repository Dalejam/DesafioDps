package com.alejandra.domain;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract long calcularSalario();
}
