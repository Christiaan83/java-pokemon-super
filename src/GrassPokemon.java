package src;

public class GrassPokemon extends Pokémon {
    private String razorLeaf;
    private boolean grassyTerrain;

    public GrassPokemon(String sound, String food, String razorLeaf, boolean grassyTerrain) {
        super(sound, food);
        this.razorLeaf = razorLeaf;
        this.grassyTerrain = grassyTerrain;
    }

    public String getRazorLeaf() {
        return razorLeaf;
    }

    public boolean isGrassyTerrain() {
        return grassyTerrain;
    }

    public void setRazorLeaf(String razorLeaf) {
        this.razorLeaf = razorLeaf;
    }

    public void setGrassyTerrain(boolean grassyTerrain) {
        this.grassyTerrain = grassyTerrain;
    }

    public String nextLevel() {
        return " level 2! ";
    }

    public void printFoodAndSound() {
        System.out.println("Grass Pokémon eats: " + getFood() + " and makes a " + getSound() + " sound!");
    }

    @Override
    public void level() {
        System.out.println("Grassy terrain, " + grassyTerrain +  ", moved to " + nextLevel());
    }
}
