package com.alejandra.domain;

public class Promotor extends Empleado{

    private int volantesRepartido;
    private long valorVolante;
    private int comprasVolante ;

    public Promotor(String nombre, int volantesRepartido, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesRepartido = volantesRepartido;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    public int getVolantesRepartido() {
        return volantesRepartido;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setVolantesRepartido(int volantesRepartido) {
        this.volantesRepartido = volantesRepartido;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {

        return (this.valorVolante*this.volantesRepartido)+(this.comprasVolante*15000);
    }


}
