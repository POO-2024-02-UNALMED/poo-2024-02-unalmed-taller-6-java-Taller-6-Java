package vehiculos;

import java.util.ArrayList; 
import java.util.List;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos = 0; 
    private static List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) { 
        this.placa = placa; 
        this.puertas = puertas; 
        this.velocidadMaxima = velocidadMaxima; 
        this.nombre = nombre; this.precio = precio; 
        this.peso = peso; this.traccion = traccion; 
        this.fabricante = fabricante; 
        CantidadVehiculos++;
        vehiculos.add(this);
        fabricante.incrementarVentas();
    }

    public static String vehiculosPorTipo() { 
        int cantidadAutomoviles = 0; 
        int cantidadCamionetas = 0; 
        int cantidadCamiones = 0; 
        for (Vehiculo v : vehiculos) { 
            if (v instanceof Automovil) { 
                cantidadAutomoviles++; 
            } 
            else if (v instanceof Camioneta) { 
                cantidadCamionetas++; 
            } 
            else if (v instanceof Camion) { 
                cantidadCamiones++; 
            } 
        } 
        return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d", cantidadAutomoviles, cantidadCamionetas, cantidadCamiones); 
    }

    public static Pais paisMasVendedor() { 
        return Pais.paisMasVendedor(); 
    } 

    public static Fabricante fabricaMayorVentas() { 
        return Fabricante.fabricaMayorVentas(); 
    }

    //Setters 
    public static void setCantidadVehiculos(int cantidad) {
        CantidadVehiculos = cantidad;
    }


    public void setPlaca(String placa) { 
        this.placa = placa; 
    } 

    public void setPuertas(int puertas) { 
        this.puertas = puertas; 
    }    

    public void setVelocidadMaxima(int velocidadMaxima) { 
        this.velocidadMaxima = velocidadMaxima; 
    } 

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public void setPrecio(double precio) { 
        this.precio = precio; 
    } 

    public void setPeso(double peso) { 
        this.peso = peso; 
    } 
    
    public void setTraccion(String traccion) { 
        this.traccion = traccion; 
    } 

    public void setFabricante(Fabricante fabricante) { 
        this.fabricante = fabricante; 
    } 

    //Getters

    public String getPlaca() { 
        return placa; 
    } 

    public int getPuertas() { 
        return puertas; 
    } 

    public int getVelocidadMaxima() { 
        return velocidadMaxima; 
    } 

    public String getNombre() { 
        return nombre; 
    } 

    public double getPrecio() { 
        return precio; 
    } 

    public double getPeso() { 
        return peso; 
    } 

    public String getTraccion() { 
        return traccion; 
    } 

    public Fabricante getFabricante() { 
        return fabricante; 
    } 
    
    public static int getCantidadVehiculos() { 
        return CantidadVehiculos;
    }
}
