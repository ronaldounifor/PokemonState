package model;

import java.util.LinkedList;

import observer.Observador;
import observer.Observavel;

public class Treinador implements Observador {
    private String nome;
    private LinkedList<Pokemon> equipe;
    
    public Treinador(String nome) {
        this.nome = nome;
        equipe = new LinkedList<>();
    }

    @Override
    public void atualizar(Observavel observavel) {
        Pokemon pokeUpdate = (Pokemon) observavel;

        System.out.println(nome + " recebeu atualização");
        System.out.println(pokeUpdate);
    }
    
}
