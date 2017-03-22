package com.teste.hucs;

public class Participante {
 
    // Declara atributos da classe
    private String nome;
    private int idade;
 
    // Declara métodos Getter e Setter da classe
    public String getNome()
    {
        return nome;
    }
 
    public void setNome(String nome)
    {
        this.nome = nome;
    	//nome = this.nome; // simular erro lógico
    	
          // Troque a linha acima por: nome = this.nome;
          // funciona na sintaxe mas não passa no teste unitário
          // pois é erro básico de logica e pode ser escrito em
          // um momento de desatenção.
 
    }
 
    public int getIdade()
    {
        return idade;
    }
 
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
 
}
