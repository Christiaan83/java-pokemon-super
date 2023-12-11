package src;

public class FirePokemon extends Pokémon{
 private String flameThrower;
 private String fireLash;
    public FirePokemon(String sound, String food, String flameThrower, String fireLash, int level) {
        super(sound, food, level);
        this.flameThrower = flameThrower;
        this.fireLash = fireLash;
    }

    public String getFlameThrower() {
        return flameThrower;
    }

    public String getFireLash() {
        return fireLash;
    }

    public void setFlameThrower(String flameThrower) {
        this.flameThrower = flameThrower;
    }

    public void setFireLash(String fireLash) {
        this.fireLash = fireLash;
    }
}
