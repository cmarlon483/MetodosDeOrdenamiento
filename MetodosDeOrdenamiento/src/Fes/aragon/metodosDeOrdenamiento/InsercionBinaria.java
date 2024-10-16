package Fes.aragon.metodosDeOrdenamiento;


import java.util.Random;

public class InsercionBinaria {
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

        for (int i = 1; i < a.length; i++) {
            int aux = a[i];
            int izq = 0;
            int der = i - 1;
            while (izq <= der) {
                int M = (izq + der) / 2;
                if (aux<a[M]){
                    der=M-1;
                }
                else{
                    izq=M+1;
                }
            }
            int J=i-1;
            while (J>=izq){
                a[J+1]=a[J];
                J=J-1;
            }
            a[izq]=aux;
        }
        System.out.print("Tu arreglo ordenado es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
