package models;

/**
 * Clase que representa al Pokémon Pikachu, un Pokémon de tipo eléctrico.
 * Extiende la clase abstracta Pokemon e implementa la interfaz PokemonElectrico.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    
    /**
     * Constructor de la clase Pikachu.
     * 
     * @param numPokedex Número de la Pokédex de Pikachu.
     * @param peso Peso de Pikachu en kilogramos.
     * @param nombre Nombre de Pikachu.
     * @param temporada Temporada en la que aparece Pikachu.
     */
    public Pikachu(String numPokedex, float peso, String nombre, int temporada) {
        super(numPokedex, peso, nombre, temporada);
    }
    
    /**
     * Realiza el ataque Impactrueno, específico de Pokémon tipo eléctrico.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarImpactrueno() {
        System.out.println(getNombre() + " usó Impactrueno!");
        return true;
    }
    
    /**
     * Realiza el ataque Puño Trueno, específico de Pokémon tipo eléctrico.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarPunoTrueno() {
        System.out.println(getNombre() + " usó Puño Trueno!");
        return true;
    }
    
    /**
     * Realiza el ataque Rayo, específico de Pokémon tipo eléctrico.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarRayo() {
        System.out.println(getNombre() + " usó Rayo!");
        return true;
    }
    
    /**
     * Realiza el ataque Rayo Carga, específico de Pokémon tipo eléctrico.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarRayoCarga() {
        System.out.println(getNombre() + " usó Rayo Carga!");
        return true;
    }
}
