package com.alejandra.domain;

public class Vendedor extends Directo{

    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
    public long calcularComision(){
        if(this.getSalario()<1000000){
           return (long) (getSalario()*0.4);
        }
        else {
            return (long) (getSalario()*0.035);
        }
    }

    @Override
    public long calcularSalario() {
        return getSalario()+calcularComision();
    }
}
