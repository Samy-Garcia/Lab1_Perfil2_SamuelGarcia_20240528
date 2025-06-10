package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contactos {
    public static void main(String[] args) {
        Contactos demo = new Contactos();
        System.out.println("hola, que desea hacer");
        System.out.println("1 Agregar conatctos");
        System.out.println("2 Mostrar Contactos Ordenados");
        System.out.println("3 Buscar Contacto por nombre");
        System.out.println("4 Eliminar conatcto");
        System.out.println("5 Salir");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        switch (num){

            case "1" :
                demo.RegistarContacto();
                break;

            case "2" :
                demo.MostrarContacto();
                break;

        }


    }



    public void RegistarContacto(){


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del contacto");
        String nombreContacto = scan.nextLine();
        System.out.println("Ingresa el Apellido del contacto");
        String ApellidoConatcto = scan.nextLine();
        System.out.println("Ingresa el Telefono del contacto");
        String telefonoConatcto = scan.nextLine();
        System.out.println("Ingresa el Correo del contacto");
        String CorreoConatcto = scan.nextLine();
        Set<String> contacto = new HashSet<>();
        contacto.add ( nombreContacto +" " +ApellidoConatcto +" " +telefonoConatcto +" " +CorreoConatcto);
        System.out.println("El Contacto fue regidtrado con los siguientes valoes " + contacto);


    }

    public void MostrarContacto(){
        TreeMap<String, Integer> contacto = new TreeMap<>();

    }
}