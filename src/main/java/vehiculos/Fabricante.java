package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;
    private static List<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ventas = 0;
        fabricantes.add(this);
    }

    public void incrementarVentas() {
        this.ventas++;
        this.pais.incrementarVentas();
    }

    public static Fabricante fabricaMayorVentas() { 
        Fabricante fabricanteConMasVentas = null; 
        int maxVentas = 0; 
        for (Fabricante f : fabricantes) { 
            if (f.getVentas() > maxVentas) { 
                maxVentas = f.getVentas(); 
                fabricanteConMasVentas = f; 
            } 
        } 
        return fabricanteConMasVentas;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    //Getters
    public String getNombre() {
        return nombre;
    } 

    public Pais getPais() {
        return pais;
    }

    public int getVentas() {
        return ventas; 
    }
}
