
package DistanceVector;

public class AppGrafo {

    public static void main(String[] args) {

        /* -------------- Topología de 5 nodos -------------- */
        /*
        GrafoMatriz m = new GrafoMatriz(5, 5, true);
        m.generarMatrizAdyacencia();
        m.agregarVertice();
        m.agregarVertice();
        m.agregarVertice();
        m.agregarVertice();
        m.agregarVertice();
        
        m.agregarArco(0, 1, 1);
        m.agregarArco(0, 2, 1);
        m.agregarArco(0, 3, 1);
        
        m.agregarArco(1, 0, 1);
        m.agregarArco(1, 2, 1);
        
        m.agregarArco(2, 0, 1);
        m.agregarArco(2, 1, 1);
        m.agregarArco(2, 4, 1);
        
        m.agregarArco(3, 0, 1);
        m.agregarArco(3, 4, 1);
        
        m.agregarArco(4, 2, 1);
        m.agregarArco(4, 3, 1);
        
        System.out.println("Número de vértices: " + m.numeroVertices());
        
        m.mostrarGrafo();
        m.CaminoMasCorto(0,4);

        m.devolverListaAdyacencia();
        System.out.println(m.algoritmoFloyd());
        */


        /* -------------- Topología de 10 nodos -------------- */
        /*
        GrafoMatriz e = new GrafoMatriz(10, 10, true);
        e.generarMatrizAdyacencia();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();
        e.agregarVertice();

        //para R1
        e.agregarArco(0, 1, 1);
        e.agregarArco(0, 4, 1);

        //para R2
        e.agregarArco(1 , 0, 1);
        e.agregarArco(1 , 2, 1);
        e.agregarArco(1 , 3, 1);

        //para R3
        e.agregarArco(2 , 1, 1);
        e.agregarArco(2 , 3, 1);
        e.agregarArco(2 , 5, 1);

        //para R4
        e.agregarArco(3, 1, 1);
        e.agregarArco(3, 2, 1);
        e.agregarArco(3, 4, 1);

        //para R5
        e.agregarArco(4, 0, 1);
        e.agregarArco(4, 3, 1);
        e.agregarArco(4, 5, 1);
        e.agregarArco(4, 6, 1);

        //para R6
        e.agregarArco(5, 2, 1);
        e.agregarArco(5, 4, 1);
        e.agregarArco(5, 7, 1);

        //para R7
        e.agregarArco(6, 4, 1);
        e.agregarArco(6, 7, 1);
        e.agregarArco(6, 8, 1);
        e.agregarArco(6, 9, 1);

        //para R8
        e.agregarArco(7, 5, 1);
        e.agregarArco(7, 6, 1);
        e.agregarArco(7, 8, 1);
        e.agregarArco(7, 9, 1);

        //para R9
        e.agregarArco(8, 6, 1);
        e.agregarArco(8, 7, 1);

        //para R10
        e.agregarArco(9, 6, 1);
        e.agregarArco(9, 7, 1);

        System.out.println("Número de vértices: " + e.numeroVertices());
        e.devolverListaAdyacencia();
        e.mostrarGrafo();

        e.CaminoMasCorto(1,8);
        e.devolverListaAdyacencia();
        System.out.println(e.algoritmoFloyd());
        */


        /* -------------- Topología de 15 nodos -------------- */

        GrafoMatriz t = new GrafoMatriz(15, 15, true);
        t.generarMatrizAdyacencia();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        t.agregarVertice();
        
        //para R1
        t.agregarArco(0, 2, 1);
        t.agregarArco(0, 1, 1);
        
        //para R2
        t.agregarArco(1 , 0, 1);
        t.agregarArco(1 , 3, 1);
        t.agregarArco(1 , 5, 1);
        
        //para R3
        t.agregarArco(2 , 0, 1);
        t.agregarArco(2 , 3, 1);
        t.agregarArco(2 , 6, 1);
        t.agregarArco(2 , 8, 1);
        
        //para R4
        t.agregarArco(3, 2, 1);
        t.agregarArco(3, 1, 1);
        t.agregarArco(3, 4, 1);

        //para R5
        t.agregarArco(4, 6, 1);
        t.agregarArco(4, 3, 1);
        t.agregarArco(4, 5, 1);

        //para R6
        t.agregarArco(5, 1, 1);
        t.agregarArco(5, 4, 1);
        t.agregarArco(5, 7, 1);
        t.agregarArco(5, 11, 1);
        
        //para R7
        t.agregarArco(6, 2, 1);
        t.agregarArco(6, 4, 1);
        t.agregarArco(6, 9, 1);

        //para R8
        t.agregarArco(7, 5, 1);
        t.agregarArco(7, 10, 1);
        
        //para R9
        t.agregarArco(8, 2, 1);
        t.agregarArco(8, 9, 1);
        t.agregarArco(8, 13, 1);
        t.agregarArco(8, 14, 1);

        //para R10
        t.agregarArco(9, 8, 1);
        t.agregarArco(9, 6, 1);
        t.agregarArco(9, 10, 1);
        
        //para R11
        t.agregarArco(10, 11, 1);
        t.agregarArco(10, 7, 1);
        t.agregarArco(10, 13, 1);
        t.agregarArco(10, 9, 1);
        
        //para R12
        t.agregarArco(11, 5, 1);
        t.agregarArco(11, 10, 1);
        t.agregarArco(11, 12, 1);
        //para R13
        t.agregarArco(12, 11, 1);
        t.agregarArco(12, 13, 1);
        
        //para R14
        t.agregarArco(13, 10, 1);
        t.agregarArco(13, 12, 1);
        t.agregarArco(13, 14, 1);
        
        //para R15
        t.agregarArco(14, 8, 1);
        t.agregarArco(14, 13, 1);

        System.out.println("Número de vértices: " + t.numeroVertices());
        t.devolverListaAdyacencia();
        t.mostrarGrafo();

        t.CaminoMasCorto(0,14);
        t.devolverListaAdyacencia();
        System.out.println(t.algoritmoFloyd());

    }
}
    

