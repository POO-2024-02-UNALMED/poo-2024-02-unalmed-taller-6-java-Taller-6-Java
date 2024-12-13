package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private int ventas;
    private static List<Pais> paises = new ArrayList<>();
    
    public Pais(String nombre){
        this.nombre = nombre;
        this.ventas = 0;
        paises.add(this);
    }

    public static Pais paisMasVendedor() { 
        Pais paisConMasVentas = null; 
        int maxVentas = 0; 
        for (Pais p : paises) { 
            if (p.getVentas() > maxVentas) { 
                maxVentas = p.getVentas(); 
                paisConMasVentas = p; 
            } 
        } 
        return paisConMasVentas; 
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void incrementarVentas() {
        this.ventas++;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getVentas() {
        return ventas;
    }
}
