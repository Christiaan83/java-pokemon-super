package src;

public class Pokémon {

    private String sound;
    private String food;
    private int level;

    public Pokémon(String sound, String food, int level){
        this.food = food;
        this.sound = sound;
        this.level =level;
    }

    public void setSound(String sound) {
        if(sound != null && !sound.isEmpty()){
        this.sound = sound;
        }
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Pokémon{" +
                "sound='" + sound + '\'' +
                ", food='" + food + '\'' +
                ", level=" + level +
                '}';
    }
}
