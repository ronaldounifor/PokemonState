import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import model.Batalha;
import model.Move;
import model.Pokemon;
import model.Treinador;
import util.Moves;

public class App {
    public static void main(String[] args) throws Exception {
      Pokemon pokemonMocinho = pokedex.get(25);
      Pokemon pokemonVilao = pokedex.get(52);

      Batalha batalha = new Batalha(pokemonMocinho, pokemonVilao);

      Treinador ash = new Treinador("Ash");
      pokemonMocinho.adicionar(ash);
      
      
      Treinador jessie = new Treinador("Jessie");
      Treinador james = new Treinador("James");
      pokemonVilao.adicionar(jessie);
      pokemonVilao.adicionar(james);

      while(pokemonMocinho.getHp() > 0 && pokemonVilao.getHp() > 0) {
        batalha.setMoveJogador(Moves.poisonFang);
        batalha.setMoveInimigo(Moves.poisonFang);
        batalha.proximoTurno();
      }

    }

    public static final HashMap<Integer, Pokemon> pokedex = new HashMap<>();
    static {

      try {
        File arquivoTop = new File("resources/pokemons.txt");
        Scanner scanner = new Scanner(arquivoTop);

        Move[] moves = new Move[] {
          Moves.thunderPunch,
          Moves.poisonFang,
          Moves.fireBlast,
          Moves.psybeam
        };

        while (scanner.hasNextLine()) {
          String[] pokedata = scanner.nextLine().split(",");

          Pokemon pokemon = new Pokemon(Integer.parseInt(pokedata[0]), pokedata[1], pokedata[2], pokedata[3], Integer.parseInt(pokedata[4]), Integer.parseInt(pokedata[5]), Integer.parseInt(pokedata[6]),Integer.parseInt(pokedata[7]),Integer.parseInt(pokedata[8]),Integer.parseInt(pokedata[9]),Integer.parseInt(pokedata[10]),Integer.parseInt(pokedata[11]),Boolean.parseBoolean(pokedata[12]));
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
