package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class Insercion {

    public static void main(String[] args) {

        Random R= new Random();
        //Se crea el arreglo
        int[] a =new int [50];
        System.out.print("Tu arreglo es : ");
        for (int i = 0; i < 50; i++) {
            a[i]= R.nextInt(1000);

        }
        //Se muestra el arreglo
        for (int i = 0; i <a.length ; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println( );

        for (int i = 1 ; i <a.length ; i++) {
            int aux= a[i];
            int k= i-1;
            while (k >= 0 && aux<a[k]){
                a[k+1]=a[k];
                k=k-1;
            }
            a[k+1]=aux;
        }
        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}

