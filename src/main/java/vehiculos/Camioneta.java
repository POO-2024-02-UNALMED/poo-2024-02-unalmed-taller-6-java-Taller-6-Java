package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidadCamionetas = 0;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) { 
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante); 
        this.volco = volco;
    }

    //Setters 
    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static void setCantidadCamionetas(int cantidad) {
        cantidadCamionetas = cantidad; 
    }

    //Getters 
    public boolean isVolco() {
        return volco;
    }

    public static int getCantidadCamionetas() { 
        return cantidadCamionetas;
    }
}
