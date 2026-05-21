package com.juego;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.juego.model.Personaje;
import com.juego.patrones.strategy.AtaqueStrategy;

public class PersonajeTest {

    @Test
    public void testRealizarAtaqueUsaEstrategia() {
        // 1. Creamos un "Mock" (un objeto falso) de la estrategia
        AtaqueStrategy mockEstrategia = mock(AtaqueStrategy.class);
        
        // 2. Configuramos el comportamiento: cuando llamen a calcularDanio, que devuelva 50
        when(mockEstrategia.calcularDanio()).thenReturn(50);
        
        // 3. Creamos el personaje usando esa estrategia falsa
        Personaje p = new Personaje("Guerrero", 100, mockEstrategia);
        
        // 4. Verificamos que el ataque devuelva el valor que configuramos
        assertEquals(50, p.realizarAtaque());
        
        // 5. Verificamos que el personaje realmente llamó al método de la estrategia
        verify(mockEstrategia, times(1)).calcularDanio();
    }
}