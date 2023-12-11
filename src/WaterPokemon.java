package src;

public class WaterPokemon extends Pokémon{

    private String rainDance;
    private String hydroCanon;
    public WaterPokemon(String sound, String food,String rainDance, String hydroCanon, int level) {
        super(sound, food, level);
        this.rainDance = rainDance;
        this.hydroCanon = hydroCanon;
    }

    public String getRainDance() {
        return rainDance;
    }

    public String getHydroCanon() {
        return hydroCanon;
    }

    public void setRainDance(String rainDance) {
        this.rainDance = rainDance;
    }

    public void setHydroCanon(String hydroCanon) {
        this.hydroCanon = hydroCanon;
    }
}
