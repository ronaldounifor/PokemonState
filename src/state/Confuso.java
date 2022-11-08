package state;

import java.util.Random;

import model.Move;
import model.Pokemon;

public class Confuso extends State {
    private static final int POISON_DAMAGE = 10;

    public Confuso(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void receberAtaque(Move move) {
        Random random = new Random();
        int resultado = random.nextInt(100);
        
        if(resultado < 6) {
            System.out.println("O pokemon causou " + pokemon.getAtaque() * 2);
            System.out.println("Foi um dano crítico");
        } else
            System.out.println("O pokemon causou " + pokemon.getAtaque());
            
        this.pokemon.setHp(this.pokemon.getHp() - POISON_DAMAGE);
    }

    @Override
    public void mover() {
        Random random = new Random();
        int resultado = random.nextInt(5);
        if(resultado == 4)
            this.pokemon.setHp(this.pokemon.getHp() - POISON_DAMAGE);
    }
    
}
