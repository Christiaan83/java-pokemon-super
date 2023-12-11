package src;

public abstract class Pokémon {

    private String sound;
    private String food;


    public Pokémon(String sound, String food) {
        this.food = food;
        this.sound = sound;

    }

    public void setSound(String sound) {
        if (sound != null && !sound.isEmpty()) {
            this.sound = sound;
        }
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void pokemonBasic(String sound, String food) {
        sound = getSound();
        food = getFood();

        if (sound.equals("theme") && food.equals("hamburger")) {
            System.out.println("All Pokemon eats " + food + " and starts withe the sound " + sound + ".");
        } else {
            System.out.println("this belongs to an other Pokemon!");
        }
    }

    public static void Pikachu(String sound, String food) {
        sound = "baby sounds";
        food = "fruits";

        System.out.println("Pikachu makes " + sound + " and eat " + food + "!");
    }

    public abstract void level();
}
