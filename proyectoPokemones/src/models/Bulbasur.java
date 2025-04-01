package models;

/**
 * Clase que representa al Pokémon Bulbasaur, un Pokémon de tipo planta.
 * Extiende la clase abstracta Pokemon e implementa la interfaz PokemonPlanta.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public class Bulbasur extends Pokemon implements PokemonPlanta {
    
    /**
     * Constructor de la clase Bulbasaur.
     * 
     * @param numPokedex Número de la Pokédex de Bulbasaur.
     * @param peso Peso de Bulbasaur en kilogramos.
     * @param nombre Nombre de Bulbasaur.
     * @param temporada Temporada en la que aparece Bulbasaur.
     */
    public Bulbasur(String numPokedex, float peso, String nombre, int temporada) {
        super(numPokedex, peso, nombre, temporada);
    }
    
    /**
     * Realiza el ataque Paralizar, específico de Pokémon tipo planta.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarParalizar() {
        System.out.println(getNombre() + " usó Paralizar!");
        return true;
    }
    
    /**
     * Realiza el ataque Drenar, específico de Pokémon tipo planta.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarDrenar() {
        System.out.println(getNombre() + " usó Drenar!");
        return true;
    }
    
    /**
     * Realiza el ataque Hoja Afilada, específico de Pokémon tipo planta.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarHojaAfilada() {
        System.out.println(getNombre() + " usó Hoja Afilada!");
        return true;
    }
    
    /**
     * Realiza el ataque Látigo Cepa, específico de Pokémon tipo planta.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    @Override
    public boolean atacarLatigoCepa() {
        System.out.println(getNombre() + " usó Látigo Cepa!");
        return true;
    }
}