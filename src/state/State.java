package state;

import model.Move;
import model.Pokemon;

public abstract class State {
    protected Pokemon pokemon;

    public abstract void atacar(Move move);
    public abstract void mover();
    public abstract void causarDano();
    public abstract void tratar();
}