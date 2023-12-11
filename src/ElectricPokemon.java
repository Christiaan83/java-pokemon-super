package src;

public class ElectricPokemon extends Pokémon{
    private String thunderPunch;
    private String electroBall;

    public ElectricPokemon(String sound, String food,String thunderPunch, String electroBall, int level) {
        super(sound, food, level);
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
}
