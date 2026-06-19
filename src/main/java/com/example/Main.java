package com.example;

import java.util.ArrayList; // Necesario para el polimorfismo

public class Main {
    public static void main(String[] args) {
        // 1. Instanciación Segura
        CamionDeReparto camion = new CamionDeReparto("CAMION-001", 100.0, 500.0, true);
        BuqueCarga buque = new BuqueCarga("BUQUE-001", 100.0, 5000.0, 50);

        camion.setCombustible(-20); // Intentamos poner un valor negativo
        System.out.println("Combustible actual tras error: " + camion.getCombustible());

        // Polimorfismo
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);    
            t.mostrarDatos(); 

            if (t instanceof BuqueCarga) {
                ((BuqueCarga) t).atracarEnPuerto();
            }
            System.out.println("-------------------------");
        }
    }
}