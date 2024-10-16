package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class SacudidaBandera {
    public static void main(String[] args) {

        Random R= new Random();
        //Se crea el arreglo
        int[] a =new int [50];
        System.out.print("Tu arreglo es : ");
        for (int i = 0; i < 50; i++) {
            a[i]= R.nextInt(1000);

        }
        //Se muestra el arreglo
        for (int i = 0; i < a.length ; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println( );

        int izq=0;
        int der=a.length-1;
        boolean band=true;

        while(izq< der && band){
            band=false;

            for (int i = izq; i < der ; i++) {
                if (a[i] > a[i+1]) {
                    int aux=a[i];
                    a[i]=a[i+1];
                    a[i+1]=aux;
                    band=true;
                }
            }
            der=der-1;
            if(band){
                band=false;
                for (int i = der; i > izq+1; i--) {
                    if(a[i]<a[i-1]){
                        int aux=a[i];
                        a[i]=a[i-1];
                        a[i-1]=aux;
                        band= true;
                    }
                }
                izq=izq+1;
            }
        }

        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
