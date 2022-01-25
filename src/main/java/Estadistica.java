import java.util.ArrayList;

public class Estadistica {

    public double mediaAritmetica(ArrayList<Integer> vector){
        int suma = 0;
        int longitud = vector.size();
        for(int numero: vector){
            suma += numero;
        }
        double media = suma / longitud;

        return media;
    }

    public int varianza(ArrayList<Integer> vector){
//Pr
    }

    public int desviacionEstandar(ArrayList<Integer> vector){

    }
}
