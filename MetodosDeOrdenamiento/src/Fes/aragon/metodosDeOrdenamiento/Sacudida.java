package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class Sacudida {
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

        int izq = 0;
        int der=a.length-1;
        int k=a.length-1;

        while( der>=izq){
            for(int i=der; i > izq; i--){
                if(a[i-1]>a[i]){
                    int aux = a[i-1];
                    a[i-1]=a[i];
                    a[i]= aux;
                    k=i;
                }
            }
            izq=k+1;

            for(int i=izq;i < der; i++){
                if(a[i-1]> a[i]){
                    int aux=a[i-1];
                    a[i-1]=a[i];
                    a[i]=aux;
                    k=i;
                }
            }
            der = k-1;
        }

        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
