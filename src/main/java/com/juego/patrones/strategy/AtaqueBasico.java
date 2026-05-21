package com.juego.patrones.strategy;

public class AtaqueBasico implements AtaqueStrategy {
    @Override
    public int calcularDanio() {
        // Un ataque básico hace menos daño que el fuerte
        return 10 + (int)(Math.random() * 10); // Daño entre 10 y 20
    }
}