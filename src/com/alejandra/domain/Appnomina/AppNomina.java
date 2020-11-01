package com.alejandra.domain.Appnomina;

import com.alejandra.domain.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Directo juan = new Directo("juan",4840000);
        Directo david = new Directo("David",3975000);
        Vendedor juliana = new Vendedor("Juliana",2050000,45510000);
        Vendedor carolina = new Vendedor("Carolina",980000,35989000);
        Freelance johana = new Freelance("Johana",71000,89);
        Freelance gustavo = new Freelance("Gustavo",42500,65);
        Promotor pedro = new Promotor("Pedro",1200,300,62);

        nomina.getEmpleado().add(juan);
        nomina.getEmpleado().add(david);
        nomina.getEmpleado().add(juliana);
        nomina.getEmpleado().add(carolina);
        nomina.getEmpleado().add(johana);
        nomina.getEmpleado().add(gustavo);
        nomina.getEmpleado().add(pedro);

        nomina.calcularNomina();
        nomina.listarDirecto();
        nomina.listarFreelancers();
        nomina.listarPromotores();



    }





}
