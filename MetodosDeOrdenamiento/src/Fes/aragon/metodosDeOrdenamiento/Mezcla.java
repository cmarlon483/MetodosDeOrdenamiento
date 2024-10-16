package Fes.aragon.metodosDeOrdenamiento;

public class Mezcla {

    public void sort(int arr[], int izq, int der){
        if(izq < der){
            int mitad = (izq + der) / 2; //punto medio

            //Divide a la mitad (recursividad).

            sort(arr, izq, mitad);
            sort(arr, mitad+1, der);
            ordenamiento(arr, izq, mitad, der); //union
        }
    }

    public void ordenamiento(int arr[], int izq, int mitad, int der) {

        //Tamaño de los sub-arreglos para unirlos.

        int n1 = mitad - izq + 1;
        int n2 = der - mitad;

        //Arrays temporales

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

        //Si quedan elementos por ordenar copiar los elementos restantes de izq y der Array[].

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
        int[] arreglo = {1,9,2,8,3,7,4,6,5,10};

        System.out.println("Tu arreglo es:");
        for (int value : arreglo) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Tu arreglo ordenado es :");
        mezcla.sort(arreglo,0,arreglo.length-1);
        mezcla.printArray(arreglo);
    }
}

