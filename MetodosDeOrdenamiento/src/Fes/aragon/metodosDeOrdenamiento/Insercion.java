package Fes.aragon.metodosDeOrdenamiento;

public class Insercion {
    public static void main(String[] args) {
        int a[]={8,0,3,4,-54,6,7,8,89,10};
        System.out.print("Tu arreglo es : ");
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

