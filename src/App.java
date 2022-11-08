import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import model.Move;
import model.Pokemon;
import util.Status;

public class App {
    public static final HashMap<Integer, Pokemon> pokedex = new HashMap<>();

    public static void main(String[] args) throws Exception {
           
    }

    static {
        try {
          File arquivoTop = new File("resources/pokemons.txt");
          Scanner scanner = new Scanner(arquivoTop);

          Move[] moves = new Move[] {
            //Thunder Punch
            new Move(Status.PARALIZADO, 10, 15, 75, 100),
            //Poison Fang
            new Move(Status.ENVENENADO, 30, 15, 50, 100),
            //Fire Blast
            new Move(Status.QUEIMADO, 30, 5, 110, 85),
            //Psybeam
            new Move(Status.CONFUSO, 10, 20, 65, 100)
          };
          
          while (scanner.hasNextLine()) {
            String[] pokedata = scanner.nextLine().split(",");
            
            Pokemon pokemon = new Pokemon(Integer.parseInt(pokedata[0]),
                                            pokedata[1],
                                            pokedata[2],
                                            pokedata[3],
                                            Integer.parseInt(pokedata[4]),
                                            Integer.parseInt(pokedata[5]),
                                            Integer.parseInt(pokedata[6]),
                                            Integer.parseInt(pokedata[7]),
                                            Integer.parseInt(pokedata[8]),
                                            Integer.parseInt(pokedata[9]),
                                            Integer.parseInt(pokedata[10]),
                                            Integer.parseInt(pokedata[11]),
                                            Boolean.parseBoolean(pokedata[12]));
            pokemon.setMoves(moves);

            pokedex.put(Integer.parseInt(pokedata[0]), pokemon);
          }
          scanner.close();
        } catch (FileNotFoundException e) {
          System.out.println("Oops, não achei");
          e.printStackTrace();
        }
    }
}
