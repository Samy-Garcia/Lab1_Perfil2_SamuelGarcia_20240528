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

            case "3" :
                demo.BuscarContacto();
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
        TreeMap<String, String> contacto = new TreeMap<>();
        contacto.put("Francisco Garcia", "60777057");
        contacto.put("Samy Cruz", "67841548");
        contacto.put("Astrid Murgas", "96385274");
        contacto.put("Mauricio Castro", "12345678");
        System.out.println(contacto);


    }

    public void BuscarContacto(){
        Scanner scan = new Scanner(System.in);

        Set<String> contactos = new HashSet<>();
        contactos.add("Francisco Garcia");
        contactos.add("Samy Cruz");
        contactos.add("Astrid Murgas");
        contactos.add("Mauricio Castro");
        System.out.println("Ingresa el Correo del contacto");
        String nombreConatcto = scan.nextLine();
        Set<String> contacto = new HashSet<>();
        contacto.add (nombreConatcto);
        System.out.println("El contacto ");


    }
}