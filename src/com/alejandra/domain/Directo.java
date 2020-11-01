package com.alejandra.domain;

public class Directo extends Empleado{

    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        return this.salario -calcularPension()-calcularSalud();
    }
    public long calcularSalud(){

        return (long) (this.salario*0.05);
    }
    public long calcularPension(){

        return (long) (this.salario*0.065);
    }
}
