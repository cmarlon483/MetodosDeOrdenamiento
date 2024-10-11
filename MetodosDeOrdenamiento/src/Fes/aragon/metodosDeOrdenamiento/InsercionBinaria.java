package Fes.aragon.metodosDeOrdenamiento;


public class InsercionBinaria {
    public static void main(String[] args) {
        int[] a = {8, 6, 3, 4, -54, -6, 7, 56, 89, 10};

        System.out.print("Tu arreglo es : ");

        for (int i = 0; i <a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

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
