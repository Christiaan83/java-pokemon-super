package src;

public class Main {
    public static void main(String[] args) {
Pokémon pokemon = new Pokémon("sound","food", 1);
        System.out.println(pokemon.getSound());

        pokemon.setSound("grom");
        System.out.println(pokemon.getSound());

        System.out.println(pokemon);
    }
}
