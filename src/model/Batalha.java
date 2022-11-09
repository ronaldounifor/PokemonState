package model;

public class Batalha {
    private Pokemon pokemonAtivo;
    private Pokemon pokemonAlvo;
    private Move moveJogador;
    private Move moveInimigo;

    public Batalha(Pokemon pokemonAtivo, Pokemon pokemonAlvo) {
        this.pokemonAtivo = pokemonAtivo;
        this.pokemonAlvo = pokemonAlvo;
    }
    
    public void setMoveJogador(Move move) {
        move.setPp(move.getPp() - 1);
        this.moveJogador = move;
    }

    public void setMoveInimigo(Move move) {
        move.setPp(move.getPp() - 1);
        this.moveInimigo = move;
    }

    public void proximoTurno() {
        if(pokemonAtivo.getVelocidade() > pokemonAlvo.getVelocidade()) {
            pokemonAlvo.sofrerAtaque(moveJogador);
            pokemonAtivo.sofrerAtaque(moveInimigo);
        } else {
            pokemonAtivo.sofrerAtaque(moveInimigo);
            pokemonAlvo.sofrerAtaque(moveJogador);
        }
    }

    
}