package com.alejandra.domain;

import javax.swing.*;
import java.util.List;

public class Nomina {
    private List<Empleado> empleado;

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
                System.out.println(directo);
            }
        });

    }
    public void listarFreelancers(){
        empleado.forEach(freelancers->{
            if(freelancers instanceof Freelance)
            {
                System.out.println(freelancers);
            }
        });

    }
    public void listarPromotores(){
        empleado.forEach(freelancers->{
            if(freelancers instanceof Freelance)
            {
                System.out.println(freelancers);
            }
        });

    }
}
