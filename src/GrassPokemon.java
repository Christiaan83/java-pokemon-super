package src;

public class GrassPokemon extends Pokémon{
    private String razorLeaf;
    private boolean grassyTerrain;
    public GrassPokemon(String sound, String food, int level, String razorLeaf, boolean grassyTerrain) {
        super(sound, food, level);
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
}
