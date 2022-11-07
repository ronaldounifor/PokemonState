package model;

import state.Padrao;
import state.State;
import util.Status;

public class Pokemon {
    private String nome;
    private int id;
    private String tipo;
    private int hp;
    private String natureza;
    private int velocidade;
    private int dano;
    private State estado;
    private Move[] moves;
    private String efeitoAtual;

    public Pokemon(String nome, int id, String tipo, int hp, String natureza, int velocidade, int dano) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
        this.hp = hp;
        this.natureza = natureza;
        this.velocidade = velocidade;
        this.dano = dano;
        this.efeitoAtual = Status.PADRAO;
        this.moves = new Move[4];
        this.estado = new Padrao(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public Move[] getMoves() {
        return moves;
    }

    public void setMoves(Move[] moves) {
        this.moves = moves;
    }

    public String getEfeitoAtual() {
        return efeitoAtual;
    }

    public void setEfeitoAtual(String efeitoAtual) {
        this.efeitoAtual = efeitoAtual;
        this.estado.tratar();
    }

    public void sofrerAtaque(Move move) {
        this.estado.atacar(move);
    }
    
    
}
