package com.example;

public class Transporte{
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga){
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    // Métodos Getter y Setter
    // idTransporte
    public void setIdTransporte(String idTransporte){
        this.idTransporte = idTransporte;
    }

    public String getIdTransporte() {
        return this.idTransporte;
    }

    // Combustible
    public void setCombustible(double combustible){
        if(combustible < 0){
            this.combustible = 0;
        } else if(combustible > 100){
            this.combustible = 100;
        } else{
            this.combustible = combustible;
            System.out.println("Combustible: " + combustible);
        }
    }

    public double getCombustible(){
        return combustible;
    }

    // CapacidadCarga
    public void setCapacidadCarga(double capacidadCarga){
        if(capacidadCarga < 0){
            System.out.println("Error: El valor es negativo, no puede ser asignado correctamente");
            
        }else{
            this.capacidadCarga = capacidadCarga;
        }
    } 

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    // Metodo viajar
    public void viajar(int distancia){
        double rastradorDeCombustible = distancia / 10.0;

        this.combustible -= rastradorDeCombustible;

        if (this.combustible < 0){
            this.combustible = 0;
        }
    }

    // Metodo mostrarDatos
    public void mostrarDatos() {
        System.out.println("ID: " + this.idTransporte + " | Combustible: " + this.combustible);
    }
}