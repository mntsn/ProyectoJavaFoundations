package sample;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList <hotel> hoteles = new ArrayList<>();

        System.out.println("¿Quiere introducir un nuevo sample.hotel?");
        System.out.println("Escriba 's' para sí y 'n' para no.");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        if (entrada=="s"){
            System.out.println("Introduzca el nombre");
            String nombre = sc.next();
            sample.hotel h1 = new sample.hotel ();
            h1.setNombre(entradaNom);
            for (int i=0; ;i++){
                hoteles.add(new hotel(nombre));
            }


        }
    }
}
