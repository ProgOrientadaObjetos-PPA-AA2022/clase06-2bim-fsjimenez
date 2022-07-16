/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Enlace c = new Enlace();
        Auto a = new Auto();
        a.establecerPlaca("LBNS0001");
        a.establecerValorMatricula(200.2);

        //c.insertarAuto(a);

        String placa, seguir;
        double valorMat;

        do {
            System.out.println("Ingrese la placa");
            placa = entrada.nextLine();
            System.out.println("Ingrese el valor de la Matricula");
            valorMat = entrada.nextDouble();
            Auto auto2 = new Auto();
            auto2.establecerPlaca(placa);
            auto2.establecerValorMatricula(valorMat);
            c.insertarAuto(auto2);

            entrada.nextLine();
            System.out.println("Ingrese si para seguir introduciendo datos");
            seguir = entrada.nextLine();
        } while (seguir.equals("si"));

    }
}
