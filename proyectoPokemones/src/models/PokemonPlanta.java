package models;

/**
 * Interfaz que define los ataques específicos para Pokémon de tipo planta.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public interface PokemonPlanta {
    
    /**
     * Realiza el ataque Paralizar.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarParalizar();
    
    /**
     * Realiza el ataque Drenar.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarDrenar();
    
    /**
     * Realiza el ataque Hoja Afilada.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarHojaAfilada();
    
    /**
     * Realiza el ataque Látigo Cepa.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarLatigoCepa();
}
