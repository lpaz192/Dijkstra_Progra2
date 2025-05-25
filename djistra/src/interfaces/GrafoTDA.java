

public interface GrafoTDA {
    void inicializarGrafo();
    void agregarVertice(int v);
    void eliminarVertice(int v);
    void agregarArista(int origen, int destino, int peso);
    void eliminarArista(int origen, int destino);
    boolean existeArista(int origen, int destino);
    int pesoArista(int origen, int destino);
    int[] vertices(); // todos los vértices actuales
    int[] vecinos(int v); // nodos accesibles desde v
}
