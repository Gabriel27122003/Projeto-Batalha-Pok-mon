package ac1lp;
import javax.swing.JOptionPane;
public class Batalhas{

    private int meuPokemonHP;
    private int outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void meuPokemon(String nome, int vida){
        this.meuPokemonNome = nome;
        this.meuPokemonHP = vida;
    }
    
    public void outroPokemon(String nome, int vida){
        this.outroPokemonNome = nome;
        this.outroPokemonHP = vida;
    }


  public void startBattle() {

    JOptionPane.showMessageDialog(null, "A batalha vai começar!",        
     "Batalha de Pokemons", JOptionPane.INFORMATION_MESSAGE);
    String mensagem = "A batalha começará em: ";
  
        //contador para batalha iniciar
       
        for (int i = 3; i > 0; i--) {
            mensagem += i + "... ";
        
            JOptionPane.showMessageDialog(null, mensagem,
                "Batalha de Pokemons", JOptionPane.INFORMATION_MESSAGE);
        }
    
// criando uma variavel String (vencedor) para guardar o nome e imprimir na sequencia.
    String vencedor;

    if (meuPokemonHP > outroPokemonHP) {
        vencedor = meuPokemonNome;
    } else {
        vencedor = outroPokemonNome;
    }

    JOptionPane.showMessageDialog(null, "O pokemon " + vencedor + " venceu a batalha!",
            "Batalha de Pokemons", JOptionPane.INFORMATION_MESSAGE);
}

    
}

