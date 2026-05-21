package com.juego.patrones.factory;

import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueFuerte;
import com.juego.patrones.strategy.AtaqueBasico;
import com.juego.patrones.strategy.AtaqueStrategy;

public class PersonajeFactory {

    public static Personaje crearPersonaje(String tipo) {
        if (tipo.equalsIgnoreCase("Mago")) {
            // El mago usa ataque fuerte
            return new Personaje("Mago", 100, new AtaqueFuerte());
        } else if (tipo.equalsIgnoreCase("Guerrero")) {
            // El guerrero usa ataque básico
            return new Personaje("Guerrero", 150, new AtaqueBasico());
        }
        return null;
    }
}