package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class Burbuja {
    public static void main(String[] args) {

        Random R= new Random();

        //Se crea el arreglo
        int[] b =new int [50];
        System.out.print("Tu arreglo es : ");
        for (int i = 0; i < 50; i++) {
            b[i]= R.nextInt(1000);

        }
        //Se muestra el arreglo
        for (int i = 0; i <b.length ; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println( );

        //Metodo de BurbujaMayor

        for (int i = b.length-1 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (b[j]>b[j+1]){
                    int aux=b[j];
                    b[j]=b[j+1];
                    b[j+1]=aux;
                }
            }
        }
        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i <b.length ; i++) {
            System.out.print(" "+ b [i]);
        }
    }

}
