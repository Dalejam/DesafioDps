package com.alejandra.domain;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleado;

    public Nomina() {
        this.empleado = new ArrayList<>();
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public void calcularNomina(){

        for(int i =0;i<empleado.size();i++)
        {
            empleado.get(i).calcularSalario();
        }
    }
    public void listarDirecto(){
        empleado.forEach(directo->{
            if(directo instanceof Directo) {
                System.out.println("El salario de empleado con contrato indefinido es: "+directo.calcularSalario());
            }
        });

    }
    public void listarFreelancers(){
        empleado.forEach(freelancers->{
            if(freelancers instanceof Freelance)
            {
                System.out.println("El salario de empleado con contrato Freelance es: "+freelancers.calcularSalario());
            }
        });

    }
    public void listarPromotores(){
        empleado.forEach(promotor->{
            if(promotor instanceof Promotor)
            {
                System.out.println("El salario de empleado con contrato Promotores es : "+promotor.calcularSalario());
            }
        });

    }
}
