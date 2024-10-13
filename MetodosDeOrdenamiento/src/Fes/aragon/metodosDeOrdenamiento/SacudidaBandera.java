package Fes.aragon.metodosDeOrdenamiento;

public class SacudidaBandera {
    public static void main(String[] args) {

        int[] a ={8,0,3,4,-54,6,7,8,89,10};

        System.out.print("Tu arreglo es : ");
        for (int i = 0; i <a.length ; i++) {
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
