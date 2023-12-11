package src;

public class WaterPokemon extends Pokémon {

    private String rainDance;
    private String hydroCanon;

    public WaterPokemon(String sound, String food, String rainDance, String hydroCanon) {
        super(sound, food);
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

    public void printFoodAndSound() {
        System.out.println("Water Pokémon eats: " + getFood() + " and makes a " + getSound() + " sound!");
    }

    public String nextLevel() {
        return " level 2! ";

    }

    @Override
    public void level() {

        System.out.println("Rain dance, " + rainDance +  ", moved to " + nextLevel());
    }
}
