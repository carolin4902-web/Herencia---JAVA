package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque con ID: " + getIdTransporte() + " está listo para descarga.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de contenedores: " + cantidadContenedores);
        // Cálculo del costo de viaje (ejemplo: $50 por contenedor)
        double costo = cantidadContenedores * 50.0;
        System.out.println("Costo de Viaje: " + costo + " USD");
    }
}