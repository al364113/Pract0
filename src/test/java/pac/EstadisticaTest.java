package pac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test de la clase Estadistica")
class EstadisticaTest {


    @Test
    @DisplayName("Test de la media aritmetica")
    void mediaAritmetica() {
        ArrayList<Integer> vect = new ArrayList<Integer>();
        vect.add(5); vect.add(5); vect.add(5); vect.add(5);
        assertEquals(Estadistica.mediaAritmetica(vect), 5);

        vect.clear();
        vect.add(1); vect.add(2); vect.add(3); vect.add(4);
        assertEquals(Estadistica.mediaAritmetica(vect), 2.5);

        vect.clear();
        vect.add(1);
        assertEquals(Estadistica.mediaAritmetica(vect), 1);

        vect.clear();
        vect.add(1); vect.add(-1);
        assertEquals(Estadistica.mediaAritmetica(vect), 0);

        vect.clear();
        vect.add(-1);
        assertEquals(Estadistica.mediaAritmetica(vect), -1);

    }

    @Test
    @DisplayName("Test de la varianza")
    void varianza() {
        ArrayList<Integer> vect = new ArrayList<Integer>();
        vect.add(12); vect.add(6); vect.add(7); vect.add(3); vect.add(15); vect.add(10); vect.add(18); vect.add(5);
        assertEquals(Estadistica.varianza(vect), 23.75);

        vect.clear();
        vect.add(5); vect.add(5); vect.add(12); vect.add(13); vect.add(15); vect.add(15); vect.add(15); vect.add(20); vect.add(20); vect.add(23);
        assertEquals(Estadistica.varianza(vect), 32.21);

        vect.clear();
        vect.add(150); vect.add(160); vect.add(164); vect.add(158); vect.add(183);
        assertEquals(Estadistica.varianza(vect), 120.8);

    }

    @Test
    @DisplayName("Test de la desciacion estandar")
    void desviacionEstandar() {
        ArrayList<Integer> vect = new ArrayList<Integer>();
        vect.add(9); vect.add(3); vect.add(8); vect.add(8); vect.add(9); vect.add(8); vect.add(9); vect.add(18);
        assertEquals(Estadistica.desviacionEstandar(vect),3.87);

        vect.clear();
        vect.add(2); vect.add(4); vect.add(3);
        assertEquals(Estadistica.desviacionEstandar(vect),0.82);

        vect.clear();
        vect.add(2); vect.add(1); vect.add(3); vect.add(2);
        assertEquals(Estadistica.desviacionEstandar(vect),0.71);

        vect.clear();
        vect.add(7); vect.add(5); vect.add(6); vect.add(8); vect.add(7); vect.add(8); vect.add(8); vect.add(9); vect.add(10); vect.add(10);
        assertEquals(Estadistica.desviacionEstandar(vect),1.54);
    }
}