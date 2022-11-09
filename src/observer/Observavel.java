package observer;

import java.util.ArrayList;

public class Observavel {
    ArrayList<Observador> observadores = new ArrayList<>();

    public void adicionar(Observador observador) {
        observadores.add(observador);
    }

    public void remover(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar() {
        for (Observador observador : observadores)
            observador.atualizar(this);
    }
}
