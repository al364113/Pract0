package pac;

import java.util.ArrayList;
import java.lang.Math;

public class Estadistica {


    public static double mediaAritmetica(ArrayList<Integer> vector) {
        double suma = 0;
        double longitud = vector.size();
        for (int numero : vector) {
            suma += numero;
        }
        double media = suma / longitud;

        return media;
    }

    public static double varianza(ArrayList<Integer> vector) {
        double media = mediaAritmetica(vector);
        double sumatorio = 0;
        for (int numero : vector) {
            sumatorio += Math.pow(numero - media, 2);
        }
        double varianza = sumatorio / vector.size();
        return varianza;
    }

    public static double desviacionEstandar(ArrayList<Integer> vector) {
        double varianza = varianza(vector);
        double desviacionTipica = Math.sqrt(varianza);
        double redondeo = Math.round(desviacionTipica * 100.0) / 100.0; //Redondeo a dos decimales
        return redondeo;

    }
}
