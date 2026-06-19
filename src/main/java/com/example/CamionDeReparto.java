package com.example;

public class CamionDeReparto extends Transporte{
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    public boolean isTieneRefrigeracion() {
        return tieneRefrigeracion;
    }

    // Setter
    public void setTieneRefrigeracion(boolean tieneRefrigeracion) {
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {

        if (tieneRefrigeracion) {

            double consumo = (distancia / 10.0) * 2;

            setCombustible(getCombustible() - consumo);

        } else {

            super.viajar(distancia);

        }
    }
}
