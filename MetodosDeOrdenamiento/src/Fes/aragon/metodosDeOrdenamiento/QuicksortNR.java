package Fes.aragon.metodosDeOrdenamiento;

public class QuicksortNR {

    public static void quicksortNR(String[] m){

        qsNR(m, 0 , m.length-1);
    }

    //Metodo no recursivo qs

    private static void qsNR(String[] m, int inf, int sup) {
        CPila<CDatos> pila= new CPila<CDatos>(); //elementos (inf,sup)
        CDatos dato; //encapsula los atributos inf y sup

        int izq,der,p;
        String mitad, x;

        //Iniciar la pila con los valores: inf, sup

        pila.meterEnPila(new CDatos(inf, sup));
        do{
            //Tomar los datos inf. sup de la parte superior de la pila

            dato=pila.sacarDePila();
            inf=dato.ObtenerInf();
            sup= dato.ObtenerSup();
            do {
                //División de la matriz en dos partes

                izq=inf;
                der=sup;
                mitad= m [(izq+der)/2];
                do {
                    while(m[izq].compareTo(mitad)<0 && izq < sup ) izq++;
                    while (mitad.compareTo(m[der]) < 0 && der > inf) der--;
                    if(izq<=der){
                        x=m[izq]; m[izq]=m[der]; m[der]= x;
                        izq++; der--;
                    }
                }
                while (izq<=der);
                if(izq<sup){
                    //Meter en la pila a los valores: izq, sup

                    pila.meterEnPila(new CDatos(izq,sup));
                }
                /* inf= inf*/ sup=der;
            }
            while(inf<der);
        }
        while(pila.getLongitud() != 0);
    }
}
