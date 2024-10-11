package Fes.aragon.metodosDeOrdenamiento;

public class Burbuja {
    public static void main(String[] args) {
        //Se crea el arreglo
        int b[]={8,6,3,4,-54,6,7,8,89,10};
        System.out.print("Tu arreglo es : ");
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
