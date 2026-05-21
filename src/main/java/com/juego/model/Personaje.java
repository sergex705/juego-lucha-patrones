package com.juego.model;

import com.juego.patrones.strategy.AtaqueStrategy;

public class Personaje {
    private String nombre;
    private int vida;
    // Este es el "enchufe" para la estrategia
    private AtaqueStrategy estrategiaAtaque;

    public Personaje(String nombre, int vida, AtaqueStrategy estrategia) {
        this.nombre = nombre;
        this.vida = vida;
        this.estrategiaAtaque = estrategia;
    }

    // Método para cambiar la estrategia en tiempo de ejecución (ej: cambiar de arma o estilo)
    public void setEstrategiaAtaque(AtaqueStrategy estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public int realizarAtaque() {
        // Aquí ocurre la magia: ya no hay números fijos (10-30), 
        // ahora delegamos al objeto estrategia
        return estrategiaAtaque.calcularDanio();
    }

    // Getters y Setters...
}