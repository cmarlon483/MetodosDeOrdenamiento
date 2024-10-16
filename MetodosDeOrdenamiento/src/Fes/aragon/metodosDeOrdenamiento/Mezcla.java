package Fes.aragon.metodosDeOrdenamiento;

import java.util.Random;

public class Mezcla {

    public void sort(int arr[], int izq, int der){
        if(izq < der){
            int mitad = (izq + der) / 2;


            sort(arr, izq, mitad);
            sort(arr, mitad+1, der);
            ordenamiento(arr, izq, mitad, der);
        }
    }

    public void ordenamiento(int arr[], int izq, int mitad, int der) {


        int n1 = mitad - izq + 1;
        int n2 = der - mitad;


        int izqArray[] = new int [n1];
        int derArray[] = new int [n2];

        for (int i=0; i < n1; i++) {
            izqArray[i] = arr[izq+i];
        }
        for (int i=0; i < n2; i++) {
            derArray[i] = arr[mitad + i + 1];
        }

        int i = 0, j = 0, k = izq;

        while (i < n1 && j < n2) {
            if (izqArray[i] <= derArray[j]) {
                arr[k] = izqArray[i];
                i++;
            } else {
                arr[k] = derArray[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = izqArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = derArray[j];
            j++;
            k++;
        }
    }

    //Metodo para imprimir


    public void printArray(int arr[]) {
        for (int i=0; i<arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Mezcla mezcla = new Mezcla();
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

        System.out.println();
        System.out.println("Tu arreglo ordenado es: ");
        mezcla.sort(b,0,b.length-1);
        mezcla.printArray(b);
    }
}

