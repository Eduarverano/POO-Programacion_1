package co.edu.uniquindio.poo;

import java.util.Scanner;
// tablas de multiplicar de un numero
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla de multiplicar: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
}
