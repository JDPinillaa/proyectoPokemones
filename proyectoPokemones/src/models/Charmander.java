package models;

/**
 * Clase que representa al Pokémon Charmander, un Pokémon de tipo fuego.
 * Extiende la clase abstracta Pokemon e implementa la interfaz PokemonFuego.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego {
    
    /**
     * Constructor de la clase Charmander.
     * 
     * @param numPokedex Número de la Pokédex de Charmander.
     * @param peso Peso de Charmander en kilogramos.
     * @param nombre Nombre de Charmander.
     * @param temporada Temporada en la que aparece Charmander.
     */
    public Charmander(String numPokedex, float peso, String nombre, int temporada) {
        super(numPokedex, peso, nombre, temporada);
    }
    
    /**
     * Realiza el ataque Puño Fuego, específico de Pokémon tipo fuego.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarPunoFuego() {
        System.out.println(getNombre() + " usó Puño Fuego!");
        return true;
    }
    
    /**
     * Realiza el ataque Ascuas, específico de Pokémon tipo fuego.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarAscuas() {
        System.out.println(getNombre() + " usó Ascuas!");
        return true;
    }
    
    /**
     * Realiza el ataque Lanzallamas, específico de Pokémon tipo fuego.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarLanzallamas() {
        System.out.println(getNombre() + " usó Lanzallamas!");
        return true;
    }
}
