package util;

import model.Move;

public class Moves {
    public static final Move thunderPunch = new Move("Thunder Punch", Status.PARALIZADO, 10, 15, 75, 100);
    public static final Move poisonFang = new Move("Poison Fang", Status.ENVENENADO, 30, 15, 50, 100);
    public static final Move fireBlast = new Move("Fire Blast", Status.QUEIMADO, 30, 5, 110, 85);
    public static final Move psybeam = new Move("Psybeam", Status.CONFUSO, 10, 20, 65, 100);
    
}
