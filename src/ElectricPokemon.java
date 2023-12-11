package src;

public class ElectricPokemon extends Pokémon {
    private String thunderPunch;
    private String electroBall;

    public ElectricPokemon(String sound, String food, String thunderPunch, String electroBall) {
        super(sound, food);
        this.thunderPunch = thunderPunch;
        this.electroBall = electroBall;
    }

    public String getThunderPunch() {
        return thunderPunch;
    }

    public String getElectroBall() {
        return electroBall;
    }

    public void setThunderPunch(String thunderPunch) {
        this.thunderPunch = thunderPunch;
    }

    public void setElectroBall(String electroBall) {
        this.electroBall = electroBall;
    }

    public String nextLevel() {
        return " level 2!";
    }

    public void printFoodAndSound() {
        System.out.println("Electric Pokémon eats: " + getFood() + " and makes a " + getSound() + " sound!");
    }

    @Override
    public void level() {
        System.out.println("Electro ball," + electroBall + ", moved to " + nextLevel());
    }
}
