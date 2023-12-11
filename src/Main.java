package src;

public class Main {
    public static void main(String[] args) {
        FirePokemon firePokemon = new FirePokemon("crackle", "sandwich", 25, "Inforno Overdrive");
        WaterPokemon waterPokemon = new WaterPokemon("splash", "fish", "z-rain", "Hydro Vortex");
        GrassPokemon grassPokemon = new GrassPokemon("whoosh", "Bocadillo", "Bloom Doom", true);
        ElectricPokemon electricPokemon = new ElectricPokemon("buzz", "Shiny Sandwich", "Gigavolt Havoc", " Gigavolt Havoc");

        Pokémon.Pikachu("babysound", "fruits");
        firePokemon.printFoodAndSound();
        waterPokemon.printFoodAndSound();
        grassPokemon.printFoodAndSound();
        electricPokemon.printFoodAndSound();
        firePokemon.level();
        waterPokemon.level();
        grassPokemon.level();
        electricPokemon.level();

    }
}