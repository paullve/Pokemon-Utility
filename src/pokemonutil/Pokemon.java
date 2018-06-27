package pokemonutil;

public class Pokemon
{

    private String name;

    private int hp;     //  Health
    private int atk;    //  Attack
    private int def;    //  Defense
    private int spe;    //  Speed
    private int spa;    //  Special Attack
    private int spd;    //  Special Defense

    private int gen;    //  Generation

    public Pokemon(String name, int hp, int atk, int def, int spe, int spa, int spd, int gen)
    {

        this.name = name;

        Calculator.loadValues(hp, atk, def, spe, spa, spd, gen);

    }


}
