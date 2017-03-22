package com.teste.hucs;
 
import static org.junit.Assert.*;

import org.junit.Test;
 
public class ParticipanteTeste {
 
    @Test
    public void testSetNome()
    {
        // Implementa método de teste unitário: Nome
        Participante p1 = new Participante();
        p1.setNome("Jose");
        assertEquals("Jose", p1.getNome());
    }
 
    @Test
    public void testSetIdade()
    {
        // Implementa método de teste unitário: Idade
        Participante p2 = new Participante();
        p2.setIdade(20);
        assertEquals(20, p2.getIdade());
    }
    
   
    @Test
    public void testMaioridade()
    {
        // Implementa método de teste unitário: Idade
        Participante p2 = new Participante();
        p2.setIdade(19);
        assertEquals(true, p2.getIdade()>=18);
    }
 
}