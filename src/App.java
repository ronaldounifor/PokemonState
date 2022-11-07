import model.Move;
import model.Pokemon;
import util.Status;

public class App {
    public static void main(String[] args) throws Exception {
        Pokemon makuhita = new Pokemon("Makuhita", 296, "Lutador", 72, "Adamante", 25, 500);

        Move thunderPunch = new Move(Status.ENVENENADO, 1, 15, 10, 100);

        makuhita.getEstado().mover();

        makuhita.sofrerAtaque(thunderPunch);

        for (int i = 0; i < 12; i++) {
            makuhita.getEstado().mover();
        }
        
    }
}
