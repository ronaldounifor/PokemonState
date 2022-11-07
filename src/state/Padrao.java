package state;

import java.util.Random;

import model.Move;
import model.Pokemon;
import util.Status;

public class Padrao extends State {

    public Padrao(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void atacar(Move move) {
        if(move.getPp() > 0) {
            causarDano();
            move.setPp(move.getPp() - 1);

            Random random = new Random();
            float f = random.nextFloat();
            if(f < move.getChanceEfeito())
                pokemon.setEfeitoAtual(move.getEfeito());
        }
    }

    @Override
    public void mover() {
        System.out.println("Moveu 1 quadrado");
    }

    @Override
    public void causarDano() {
        System.out.println("O pokemon causou " + pokemon.getDano());
    }

    @Override
    public void tratar() {
        if(pokemon.getEfeitoAtual() == Status.PARALIZADO)
            pokemon.setEstado(new Paralizado(pokemon));
        else if (pokemon.getEfeitoAtual() == Status.ENVENENADO)
            pokemon.setEstado(new Envenenado(pokemon));
    }
    
}
