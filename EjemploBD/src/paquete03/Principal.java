/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Enlace c = new Enlace();
        Ciudad ciudad = new Ciudad("Machala", 100123);
        c.insertarCiudad(ciudad);
        String city, seguir;
        int poblacion;
        
        do {
            System.out.println("Ingrese el nombre de la ciudad");
            city = entrada.nextLine();
            System.out.println("Ingrese la población");
            poblacion = entrada.nextInt();
            Ciudad ciudad2 = new Ciudad(city, poblacion);
            c.insertarCiudad(ciudad2);
            
            entrada.nextLine();
            System.out.println("Ingrese si para seguir introduciendo datos");
            seguir = entrada.nextLine();
        } while (seguir.equals("si"));

        
        
    }
}
