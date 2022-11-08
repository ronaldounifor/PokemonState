package state;

import java.util.Random;

import model.Move;
import model.Pokemon;

public class Paralizado extends State {

    public Paralizado(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void receberAtaque(Move move) {
        Random random = new Random();
        int resultado = random.nextInt(2);
        if(resultado == 1) {
            resultado = random.nextInt(100);
            
            if(resultado < 6) {
                System.out.println("O pokemon causou " + pokemon.getAtaque() * 2);
                System.out.println("Foi um dano crítico");
            } else
                System.out.println("O pokemon causou " + pokemon.getAtaque());
        } else
            System.out.println("Seu pokemon está paralizado, não pode atacar");
    }

    @Override
    public void mover() {
        Random random = new Random();
        int resultado = random.nextInt(5);
        if(resultado < 4)
            System.out.println("Moveu 1 quadrado");
        else
            System.out.println("Seu pokemon está paralizado, não pode se mover");
    }
    
}
