package co.edu.uniquindio.poo;

import java.util.Scanner;
// contar dijitos de un numero
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero positivo: ");
        int n = sc.nextInt();

        int i = 0;

        while(n > 0){
            n /= 10;
            i = i + 1;
        }
        System.out.println("el numero tiene " + i + " dijitos");
    }
}
