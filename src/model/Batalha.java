package model;

public class Batalha {
    private Pokemon pokemonAtivo;
    private Pokemon pokemonAlvo;
    private Move moveJogador;
    private Move moveInimigo;
    
    public void setMoveJogador(Move move) {
        this.moveJogador = move;
    }

    public void setMoveInimigo(Move move) {
        this.moveInimigo = move;
    }

    public void proximoTurno() {
        if(pokemonAtivo.getVelocidade() > pokemonAlvo.getVelocidade()) {
            pokemonAlvo.sofrerAtaque(moveJogador);
            pokemonAtivo.sofrerAtaque(moveInimigo);
        }

    }

    
}