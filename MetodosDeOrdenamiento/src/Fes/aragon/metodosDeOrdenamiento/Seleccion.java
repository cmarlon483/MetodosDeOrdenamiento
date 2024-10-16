package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class Seleccion {
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

        //Metodo de ordenamiento por seleccion
        for (int i = 0; i < b.length-1 ; i++) {
            int menor=i;
            for (int j = i+1 ; j <b.length ; j++) {
                if(b[j]< b[menor]){
                    menor=j;
                }
            }
            int aux= b[i];
            b[i]=b[menor];
            b[menor ]=aux;

        }
        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i <b.length ; i++) {
            System.out.print(" "+ b [i]);
        }
    }
}
