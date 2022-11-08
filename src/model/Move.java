package model;

public class Move {
    private String nome;
    private String efeito;
    private float chanceEfeito;
    private int pp;
    private int dano;
    private float precisao;

    public Move(String nome, String efeito, float chanceEfeito, int pp, int dano, float precisao) {
        this.nome = nome;
        this.efeito = efeito;
        this.chanceEfeito = chanceEfeito;
        this.pp = pp;
        this.dano = dano;
        this.precisao = precisao;
    }
    
    public String getEfeito() {
        return efeito;
    }
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
    public int getPp() {
        return pp;
    }
    public void setPp(int pp) {
        this.pp = pp;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public float getPrecisao() {
        return precisao;
    }
    public void setPrecisao(float precisao) {
        this.precisao = precisao;
    }

    public float getChanceEfeito() {
        return chanceEfeito;
    }

    public void setChanceEfeito(float chanceEfeito) {
        this.chanceEfeito = chanceEfeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
