package Fes.aragon.metodosDeOrdenamiento;

public class Reduce_recursivo {


    public void Reduce_recursivo(int ini, int fin){

        int [] a=new int[51];
        int izq = ini;
        int der = fin;
        int pos = ini;
        boolean band = true;

        while (band==true){
            band=false;
            while (a[pos]<= a[der] && pos!=der){
                der=der-1;
            }
            if(pos!=der){
                int aux=a[pos];
                a[pos]=a[der];
                a[der]=aux;
                pos=der;
                while (a[pos]>=a[izq]&&pos!=izq){
                    izq=izq+1;
                }
                if(pos!=izq){
                    band=true;
                    aux=a[pos];
                    a[pos]=a[izq];
                    a[izq]=aux;
                    pos=izq;
                }
            }
        }
        if (pos-1>ini){

            Reduce_recursivo(ini,pos-1);
        }
        if(fin>pos+1){

            Reduce_recursivo(pos+1,fin);
        }
    }
}
