package state;

import java.util.Random;

import model.Move;
import model.Pokemon;

public class Envenenado extends State {
    private static final int POISON_DAMAGE = 10;

    public Envenenado(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void atacar(Move move) {
        causarDano();
        this.pokemon.setHp(this.pokemon.getHp() - POISON_DAMAGE);
    }

    @Override
    public void mover() {
        Random random = new Random();
        int resultado = random.nextInt(5);
        if(resultado == 4)
            this.pokemon.setHp(this.pokemon.getHp() - POISON_DAMAGE);
    }

    @Override
    public void causarDano() {
        Random random = new Random();
        int resultado = random.nextInt(100);
        
        if(resultado < 6) {
            System.out.println("O pokemon causou " + pokemon.getDano() * 2);
            System.out.println("Foi um dano crítico");
        } else
            System.out.println("O pokemon causou " + pokemon.getDano());
    }

    @Override
    public void tratar() {
        
    }
    
}
