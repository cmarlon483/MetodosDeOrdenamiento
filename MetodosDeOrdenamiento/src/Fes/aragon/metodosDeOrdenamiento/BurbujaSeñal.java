package Fes.aragon.metodosDeOrdenamiento;

public class BurbujaSeñal {
    public static void main(String[] args) {
        //Se crea el arreglo
        int[] b ={8,6,3,4,-54,6,7,8,89,10};
        System.out.print("Tu arreglo es : ");
        //Se muestra el arreglo
        for (int i = 0; i <b.length ; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.println( );

        //Metodo de BurbujaSeñal

        int i=0;
        boolean band= false;

        while(i <= b.length-1 && band==false){
            band=true;
            for (int j = 0; j < b.length-1; j++) {
                if (b[j]>b[j+1]){
                    int aux=b[j];
                    b[j]=b[j+1];
                    b[j+1]=aux;
                    band=false;
                }
            }
            i=i+1;
        }



        System.out.print("Tu arreglo ordenado es: ");
        for (int j = 0; j <b.length ; j++) {
            System.out.print(" "+ b [j]);
        }
    }

}
