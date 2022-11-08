package state;

import java.util.Random;

import model.Move;
import model.Pokemon;

public class Padrao extends State {

    public Padrao(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void receberAtaque(Move move) {
        if(move.getPp() > 0) {
            System.out.println("O pokemon causou " + pokemon.getAtaque());
            
            move.setPp(move.getPp() - 1);

            Random random = new Random();
            float f = random.nextFloat();
            if(f < move.getChanceEfeito())
                pokemon.setCondicao(move.getEfeito());
        }
    }

    @Override
    public void mover() {
        System.out.println("Moveu 1 quadrado");
    }
    
}
