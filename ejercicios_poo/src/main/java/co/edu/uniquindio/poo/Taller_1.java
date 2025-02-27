package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Taller_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        String[][] estudiantes = new String[numEstudiantes][6];
        for (int i = 0; i < numEstudiantes; i++){
            System.out.println("ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.println("Nombre del estudiante: ");
            estudiantes[i][0] = sc.next();
            System.out.println("Apellido del estudiante: ");
            estudiantes[i][1] = sc.next();
            System.out.println("Edad del estudiante: ");
            estudiantes[i][2] = sc.next();
            System.out.println("Numero de identificacion del estudiante: ");
            estudiantes[i][3] = sc.next();
            System.out.println("Numero de telefono del estudiante: ");
            estudiantes[i][4] = sc.next();
            System.out.println("Correo electronico del estudiante: ");
            estudiantes[i][5] = sc.next();
        }

        System.out.println("\nEstos son los datos almacenados de los estudiantes:\n");
        for (int i = 0; i < numEstudiantes; i++){
            System.out.println("Estudiante " + (i +1) + ":");
            System.out.println("Nombre del estudiante: " + estudiantes[i][0]);
            System.out.println("Apellido del estudiante: " + estudiantes[i][1]);
            System.out.println("Edad del estudiante: " + estudiantes[i][2]);
            System.out.println("Numero de indentificacion del estudiante: " + estudiantes[i][3]);
            System.out.println("Numero de telefono del estudiante: " + estudiantes[i][4]);
            System.out.println("Correo electronico del estudiante: " + estudiantes[i][5]);

        }
    }
}

    /*public static int NumIdentidad(int nit){
        int identificacion = nit;
        return identificacion;
    }

    public static String NombreEstudiante(String nombre){
        String nombres = nombre;
        return nombres;
    }

    public static String ApellidoEstudiante(String apellido){
        String apellidos = apellido;
        return apellidos;
    }

    public static String Correo(String correo){
        String correos = correo;
        return correos;
    }

    public static long NumTelefono(long telefono){
        long telefonos = telefono;
        return telefonos;
    }

    public static int Edad(int edad){
        int edades = edad;
        return edades;
    }*/

        /*System.out.println("ingrese su nombre: ");
        String nombre = sc.next();
        System.out.println("ingrese su apellido: ");
        String apellido = sc.next();
        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println("ingrese su numero de identificacion: ");
        int nit = sc.nextInt();
        System.out.println("ingrese su numero de telefono: ");
        long telefono = sc.nextLong();
        System.out.println("ingrese su correo electronico: ");
        String correo = sc.next();*/


        /*System.out.println("\n" + "Estos son los datos alamcenados del estudiante: " + "\n");
        System.out.println("Nombre del estudiante = " + NombreEstudiante(nombre));
        System.out.println("Apellido del estudiante = " +ApellidoEstudiante(apellido));
        System.out.println("Edad del estudiante = " + Edad(edad));
        System.out.println("Identificacion del estudiante = " + NumIdentidad(nit));
        System.out.println("Telefono del estudiante = " + NumTelefono(telefono));
        System.out.println("Correo del estudiante = " + Correo(correo));*/
