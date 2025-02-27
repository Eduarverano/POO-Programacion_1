package co.edu.uniquindio.poo;

import java.util.Scanner;
// suma de N numeros naturales
public class Natuales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int n = sc.nextInt();

        int suma = 0;
        int i = 1;

        while(i <= n){
            suma += i;
            i = i + 1;
        }
        System.out.println(suma);
    }
}
