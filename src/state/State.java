package state;

import model.Move;
import model.Pokemon;
import util.Status;

public abstract class State {
    protected Pokemon pokemon;

    public abstract void receberAtaque(Move move);
    public abstract void mover();

    public void tratar() {
        switch(pokemon.getCondicao()) {
            case Status.CONFUSO: 
                pokemon.setEstado(new Confuso(pokemon));
                pokemon.notificar();
                break;
            case Status.ENVENENADO: 
                pokemon.setEstado(new Envenenado(pokemon));
                pokemon.notificar();
                break;
            case Status.PARALIZADO:
                pokemon.setEstado(new Paralizado(pokemon));
                pokemon.notificar();
                break;
            case Status.QUEIMADO:
                pokemon.setEstado(new Queimado(pokemon));
                pokemon.notificar();
                break;
            default:
                pokemon.setEstado(new Padrao(pokemon));
                break;
        }
    }
}