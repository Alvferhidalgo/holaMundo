public class Coche {

    String marca;
    String modelo;
    int anyoConstruccion;
    int kilometros;
    boolean inspeccion;

    public Coche(String marca, String modelo, int anyoConstruccion, int kilometros, boolean inspeccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoConstruccion = anyoConstruccion;
        this.kilometros = kilometros;
        this.inspeccion = inspeccion;
    }

    public Coche(){}
}
