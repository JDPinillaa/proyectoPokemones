package models;

/**
 * Interfaz que define los ataques específicos para Pokémon de tipo fuego.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public interface PokemonFuego {
    
    /**
     * Realiza el ataque Puño Fuego.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarPunoFuego();
    
    /**
     * Realiza el ataque Ascuas.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarAscuas();
    
    /**
     * Realiza el ataque Lanzallamas.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarLanzallamas();
}
