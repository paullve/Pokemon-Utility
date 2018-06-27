package pokemonutil;

public class Calculator {

    private static int hp;     //  Health
    private static int atk;    //  Attack
    private static int def;    //  Defense
    private static int spe;    //  Speed
    private static int spa;    //  Special Attack
    private static int spd;    //  Special Defense

    private static int gen;

    /**
     * Loads values from the pokemon
     * @param inHP
     * @param inATK
     * @param inDEF
     * @param inSPE
     * @param inSPA
     * @param inSPD
     * @param inGEN
     */
    public static void loadValues(int inHP, int inATK, int inDEF, int inSPE, int inSPA, int inSPD, int inGEN) {
        hp = inHP;
        atk = inATK;
        def = inDEF;
        spe = inSPE;
        spa = inSPA;
        spd = inSPD;
        gen = inGEN;
    }

}
