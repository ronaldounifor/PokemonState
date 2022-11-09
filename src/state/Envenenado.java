package state;

import java.util.Random;

import model.Move;
import model.Pokemon;
import util.Status;

public class Envenenado extends State {

    public Envenenado(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void receberAtaque(Move move) {
        Random random = new Random();
        int tentativa = random.nextInt(100);

        //Verifica se acerta
        if(tentativa < move.getPrecisao()) {
            int dano = (pokemon.getAtaque() + move.getDano())/20;

            dano += (pokemon.getMaxHp() * (double)1/16);

            //Causa dano
            pokemon.setHp(pokemon.getHp() - dano);

            //Verifica se aplica efeito
            if(!Status.PADRAO.equals(move.getEfeito())) {
                tentativa = random.nextInt(100);
                if(tentativa < move.getChanceEfeito())
                    pokemon.setCondicao(move.getEfeito());
            }
        }
    }

    @Override
    public void mover() {
        Random random = new Random();
        int resultado = random.nextInt(5);
        if(resultado == 4) {
            int dano = (int)(pokemon.getMaxHp() * (double)1/16);
            this.pokemon.setHp(this.pokemon.getHp() - dano);
        }
    }
    
}
