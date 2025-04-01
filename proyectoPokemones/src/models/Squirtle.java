package models;

/**
 * Clase que representa al Pokémon Squirtle, un Pokémon de tipo agua.
 * Extiende la clase abstracta Pokemon e implementa la interfaz PokemonAgua.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua {
    
    /**
     * Constructor de la clase Squirtle.
     * 
     * @param numPokedex Número de la Pokédex de Squirtle.
     * @param peso Peso de Squirtle en kilogramos.
     * @param nombre Nombre de Squirtle.
     * @param temporada Temporada en la que aparece Squirtle.
     */
    public Squirtle(String numPokedex, float peso, String nombre, int temporada) {
        super(numPokedex, peso, nombre, temporada);
    }
    
    /**
     * Realiza el ataque Hidrobomba, específico de Pokémon tipo agua.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarHidrobomba() {
        System.out.println(getNombre() + " usó Hidrobomba!");
        return true;
    }
    
    /**
     * Realiza el ataque Pistola de Agua, específico de Pokémon tipo agua.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarPistolaAgua() {
        System.out.println(getNombre() + " usó Pistola de Agua!");
        return true;
    }
    
    /**
     * Realiza el ataque Burbuja, específico de Pokémon tipo agua.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarBurbuja() {
        System.out.println(getNombre() + " usó Burbuja!");
        return true;
    }
    
    /**
     * Realiza el ataque Hidropulso, específico de Pokémon tipo agua.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarHidropulso() {
        System.out.println(getNombre() + " usó Hidropulso!");
        return true;
    }
}