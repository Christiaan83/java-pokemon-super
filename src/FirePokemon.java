package src;

public class FirePokemon extends Pokémon {
    private int flameThrower;
    private String fireLash;

    public FirePokemon(String sound, String food, int flameThrower, String fireLash) {
        super(sound, food);
        this.flameThrower = flameThrower;
        this.fireLash = fireLash;
    }

    public int getFlameThrower() {
        return flameThrower;
    }

    public String getFireLash() {
        return fireLash;
    }

    public void setFlameThrower(int flameThrower) {
        this.flameThrower = flameThrower;
    }

    public void setFireLash(String fireLash) {
        this.fireLash = fireLash;
    }

    public String nextLevel() {
        return " level 2!";
    }

    public void printFoodAndSound() {
        System.out.println("Fire Pokémon eats: " + getFood() + " and makes a " + getSound() + " sound!");
    }

    @Override
    public void level() {
        System.out.println("Flame Thrower, " + flameThrower + ", moved to" + nextLevel());
    }
}
