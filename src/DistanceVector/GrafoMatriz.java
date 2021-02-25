
package DistanceVector;

public class GrafoMatriz {

    public static int numVertices;
    public static int maxVertices;
    Float[][] matriz;
    boolean dirigido;
    public static int origen,destino;
    long [][] matrizAdyacencia;
    long [][] mAdy = new long[maxVertices][maxVertices];


    public GrafoMatriz(int n, int max, boolean d) {
        maxVertices = max;
        numVertices = n;
        matriz = new Float[maxVertices][maxVertices];
        matrizAdyacencia = new long[maxVertices][maxVertices];
        dirigido = d;
        mAdy = new long[maxVertices][maxVertices];
    }

    public GrafoMatriz() {
        maxVertices = 10;
        numVertices = 0;
        matriz = new Float[maxVertices][maxVertices];
        dirigido = true;
    }

    public long [][] generarMatrizAdyacencia(){
        int x = maxVertices;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                matrizAdyacencia[i][j] = 999999999;
                if(i == j){
                    matrizAdyacencia[i][j] = 0;
                }
                
            }
        }
        return matrizAdyacencia;
    }
    
    public int getNumVertices() {
        return numVertices;
    }   

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public void setDirigido(boolean dirigido) {
        this.dirigido = dirigido;
    }

    // Agregar un nuevo nodo
    public void agregarVertice() {
        if (numVertices == maxVertices) {
            return;
        }
        numVertices++;
    }

    public int numeroVertices() {
        return numVertices;
    }

    // Agregar un nuevo camino, definir vector origen (i) vector destino (j), peso del vector (w)
    public void agregarArco(int i, int j, float w) {
        matriz[i][j] = w;
        matrizAdyacencia[i][j] = 1;
        
        if (!dirigido) {
            matrizAdyacencia[i][j] = 1;
            matriz[j][i] = w;
        }
    }
    
    public void devolverListaAdyacencia(){
        int iterador = 0;
        int iterador2 = 0;
        for(int i=0;i<maxVertices;i++){
            long [] array = new long[maxVertices];
            for(int j=0;j<maxVertices;j++){
                
                array[iterador] = matrizAdyacencia[i][j];
                iterador+=1;
            }
            mAdy[iterador2] = array;
            iterador2++;
            if(iterador == maxVertices){
                iterador = 0;
            }
        }
        
    }
    
    public void mostrarGrafo() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int distanciaMinima(float distancias[], boolean conjuntoS[]) {
        float min = Float.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < numVertices; v++) {
            if (conjuntoS[v] == false && distancias[v] <= min) {
                min = distancias[v];
                min_index = v;
            }
        }
        return min_index;
    }

    /*public void mostrarDistancias(float distancias[]) {
        System.out.println("Distancias desde el vertice fuente");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("router" + (i) + " --> " + distancias[i]);
        }
    }*/
    public void DistanciaDestino(float distancias[],int verticeDestino, int verticeFuente) {
        System.out.println("Distancias desde el vertice fuente");
        for (int i = 0; i < numVertices; i++) {
            if(verticeDestino == i){
                System.out.println("El mínimo de saltos hacia router R"+ (verticeDestino+1)+" desde router R"+ (verticeFuente+1) + " es ");
                System.out.println("R" + (i+1) + " --> " + (int)distancias[i] + " salto(s)");
   
            }
        }
    }
    public void mostrar(){
        for(int i=0;i<maxVertices;i++){
                for(int j=0;j<maxVertices;j++){
                    System.out.print(mAdy[i][j]+" ");

                }
            System.out.println("\n");
            }
    }

    public void CaminoMasCorto(int verticeFuente,int verticeDestino) {
        origen = verticeFuente;
        destino = verticeDestino;
        float distancias[] = new float[numVertices];
        boolean conjuntoS[] = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++) {
            distancias[i] = Float.MAX_VALUE;
            conjuntoS[i] = false;
        }
        distancias[verticeFuente] = 0;
        for (int contador = 0; contador < numVertices - 1; contador++) {

            int w = distanciaMinima(distancias, conjuntoS);
            conjuntoS[w] = true;
            for (int v = 0; v < numVertices; v++) {     
                if (!conjuntoS[v] && matriz[w][v] != null
                        && distancias[w] != Float.MAX_VALUE
                        && distancias[w] + matriz[w][v] < distancias[v]) {
                    distancias[v] = distancias[w] + matriz[w][v];
                }
            }
        }

        // Imprimir el arreglo construido
        this.DistanciaDestino(distancias, verticeDestino,verticeFuente);
    }

    public String Devolver(int origen, int destino,String cadena){
        int resultado = cadena.indexOf("("+origen+"--->"+destino+")");

        return cadena.substring(resultado, (resultado+22))+"}";
    }

    public String algoritmoFloyd(){
        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "",cadena="",caminitos="";
        int i,j,k;
        float temporal1,temporal2,temporal3,temporal4,minimo;
        // Inicializar las matrices caminos y caminos auxiliares
        for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                caminos[i][j] = "";
                caminosAuxiliares[i][j]="";
            }
        }
        for(k=0;k<vertices;k++){
            for(i=0;i<vertices;i++){
                for(j=0;j<vertices;j++){
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2+temporal3;
                    //Encontrar el valor mínimo
                    
                    minimo = Math.min(temporal1, temporal4);
                    if(temporal1 != temporal4){
                        if(minimo==temporal4){
                            caminoRecorrido="";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminoR(i,k,caminosAuxiliares,caminoRecorrido)+(k+1);
                            
                        }
                    }
                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }
        
        // Agregar el camino minimo a la cadena
        for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                cadena = cadena+"{"+matrizAdyacencia[i][j]+"}";
            }
            cadena = cadena + "\n";
        }
        for(i=0;i<vertices;i++){
           
            for(j=0;j<vertices;j++){
                if(matrizAdyacencia[i][j] != 1000000000){
                    if(i!=j){
                        if(caminos[i][j].equals("")){
                            caminitos +="De ("+(i+1)+"--->"+(j+1)+") irse por...(" +(i+1)+", "+(j+1)+")\n";
                        }else{
                            caminitos +="De ("+(i+1)+"--->"+(j+1)+ ") irse por...("+ (i+1)+", "+caminos[i][j]+", "+ (j+1)+")\n";
                            
                        }
                    }
                    
                }
            }
        }

        System.out.println("*********");
        int resultado = caminitos.indexOf("("+(origen+1)+"--->"+(destino+1)+")");
        String saltosiguiente;
        saltosiguiente = caminitos.substring(resultado, (resultado+30))+"}";
        System.out.println("Siguiente salto es al router R" + saltosiguiente.substring(24, 26));
        System.out.println("*********");

        return "\nLos caminos más cortos entre vertices son  \n"+caminitos ;
    }

    // Camino que se ha recorrido
    public String caminoR(int i,int k,String[][]caminosAuxiliares,String caminoRecorrido){
        if(caminosAuxiliares[i][k].equals("")){
            return "";
        }else{
            caminoRecorrido += caminoR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido)+(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+", ";
            return caminoRecorrido;
        }
    }

}
    
    
    

