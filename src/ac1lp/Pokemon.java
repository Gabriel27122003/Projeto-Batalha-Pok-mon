/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac1lp;

import javax.swing.JOptionPane;


public class Pokemon {
    
    private String nome;
    private String tipo;
    private int level;
    private int vida = 1000;
    private int ataque;
    private int defesa;
    
    
    public Pokemon(String nome, String tipo, int level){
    
    this.nome = nome;
    this.tipo = tipo;
    this.level = level;
    this.calculaAtributos();
    this.calcularBonus();
    this.imprimirPokemon();
 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

   
    public int getAtaque() {
        return ataque;
    }

    
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

  
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    //Método Calcular Atributos
    
    public void calculaAtributos() {    
//Caso o tipo seja "Fogo", o atributo vida deverá ser reduzido em 80 níveis/pontos, o ataque deverá ter o valor 75 e a defesa terá o valor 10.

    if (tipo.equals("Fogo")){

        vida -= 80; // se for tipo fogo vida total -80
        ataque = 75; // ataque será de 75
        defesa = 10; // defesa será 10
    
    } else if (tipo.equals("Água")){
        
        vida -= 50;
        ataque = 65;
        defesa = 50;
    } else if (tipo.equals("Planta")){
        
        vida += 40;
        ataque = 25;
        defesa = 30;
    } else if (tipo.equals("Pedra")){
        
        vida += 10;
        ataque = 45;
        defesa = 80;
    }
    
      
}
    public void calcularBonus() {
        // Incrementa os atributos de acordo com o level do Pokemon
        vida += level/4;
        ataque += level/2;
        defesa += level/3;  
    }
   public void imprimirPokemon() {
    String mensagem = "Nome: " + nome + "\n" +
                      "Tipo: " + tipo + "\n" +
                      "Level: " + level + "\n" +
                      "Vida: " + vida + "\n" +
                      "Ataque: " + ataque + "\n" +
                      "Defesa: " + defesa;
    
    JOptionPane.showMessageDialog(null, mensagem, "Dados do Pokemon", JOptionPane.PLAIN_MESSAGE);
}
 
}

    

