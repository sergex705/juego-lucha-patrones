package com.juego.patrones.strategy;

public class AtaqueFuerte implements AtaqueStrategy {
    @Override
    public int calcularDanio() {
        return 30 + (int)(Math.random() * 20); // Daño entre 30 y 50
    }
}