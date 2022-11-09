package model;

import state.Padrao;
import state.State;
import util.Status;

public class Pokemon {
    private int id;
    private String nome;
    private String tipo1;
    private String tipo2;
    private int total;
    private int hp;
    private int maxHp;
    private int ataque;
    private int defesa;
    private int ataqueSp;
    private int defesaSp;
    private int velocidade;
    private int geracao;
    private boolean lendario;
    private State estado;
    private Move[] moves;
    private String condicao;

    public Pokemon(int id, String nome, String tipo1, String tipo2, int total, int hp, int ataque, int defesa,
            int ataqueSp, int defesaSp, int velocidade, int geracao, boolean lendario) {
        this.id = id;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.total = total;
        this.hp = hp;
        this.maxHp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataqueSp = ataqueSp;
        this.defesaSp = defesaSp;
        this.velocidade = velocidade;
        this.geracao = geracao;
        this.lendario = lendario;
        this.condicao = Status.PADRAO;
        this.estado = new Padrao(this);
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo1() {
        return tipo1;
    }
    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }
    public String getTipo2() {
        return tipo2;
    }
    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getAtaqueSp() {
        return ataqueSp;
    }
    public void setAtaqueSp(int ataqueSp) {
        this.ataqueSp = ataqueSp;
    }
    public int getDefesaSp() {
        return defesaSp;
    }
    public void setDefesaSp(int defesaSp) {
        this.defesaSp = defesaSp;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getGeracao() {
        return geracao;
    }
    public void setGeracao(int geracao) {
        this.geracao = geracao;
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

    public boolean isLendario() {
        return lendario;
    }

    public void setLendario(boolean lendario) {
        this.lendario = lendario;
    }

    @Override
    public String toString() {
        StringBuilder pokeTexto = new StringBuilder();

        pokeTexto.append(this.nome + " (" + this.tipo1);

        if("".equals(this.tipo2))
            pokeTexto.append(")");
        else
            pokeTexto.append("/" + this.tipo2 + ")");

        pokeTexto.append(System.getProperty("line.separator"));

        pokeTexto.append(this.hp + "/" + this.maxHp + " " + this.getCondicao());

        pokeTexto.append(System.getProperty("line.separator"));

        return pokeTexto.toString();
    }

    public void setCondicao(String efeito) {
        this.condicao = efeito;
        this.estado.tratar();
    }
    public String getCondicao() {
        return condicao;
    }
    public boolean isCondicao(String condicao) {
        return this.condicao.equals(condicao);
    }

    public void sofrerAtaque(Move move) {
        this.estado.receberAtaque(move);
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
