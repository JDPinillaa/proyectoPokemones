package models;

/**
 * Interfaz que define los ataques específicos para Pokémon de tipo eléctrico.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public interface PokemonElectrico {
    
    /**
     * Realiza el ataque Impactrueno.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarImpactrueno();
    
    /**
     * Realiza el ataque Puño Trueno.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarPunoTrueno();
    
    /**
     * Realiza el ataque Rayo.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarRayo();
    
    /**
     * Realiza el ataque Rayo Carga.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarRayoCarga();
}
