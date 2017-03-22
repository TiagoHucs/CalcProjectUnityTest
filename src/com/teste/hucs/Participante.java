package com.teste.hucs;

public class Participante {
 
    // Declara atributos da classe
    private String nome;
    private int idade;
 
    // Declara m�todos Getter e Setter da classe
    public String getNome()
    {
        return nome;
    }
 
    public void setNome(String nome)
    {
        this.nome = nome;
    	//nome = this.nome; // simular erro l�gico
    	
          // Troque a linha acima por: nome = this.nome;
          // funciona na sintaxe mas n�o passa no teste unit�rio
          // pois � erro b�sico de logica e pode ser escrito em
          // um momento de desaten��o.
 
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
