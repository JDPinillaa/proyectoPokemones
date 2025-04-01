/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 * Clase abstracta que representa un Pokémon genérico.
 * Proporciona atributos básicos y métodos comunes para todos los Pokémon.
 * 
 * Esta clase debe ser extendida por clases específicas que representen
 * diferentes tipos de Pokémon.
 * 
 * @author juand
 * @since 2025-03-31
 * @version 1.0
 */
public abstract class Pokemon {
    private String numPokedex; // Número de la Pokédex del Pokémon
    private float peso;        // Peso del Pokémon en kilogramos
    private String nombre;     // Nombre del Pokémon
    private int temporada;     // Temporada en la que aparece el Pokémon

    /**
     * Constructor de la clase Pokemon.
     * 
     * @param numPokedex Número de la Pokédex del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que aparece el Pokémon.
     */
    public Pokemon(String numPokedex, float peso, String nombre, int temporada) {
        this.numPokedex = numPokedex;
        this.peso = peso;
        this.nombre = nombre;
        this.temporada = temporada;
    }
    
    /**
     * Realiza el ataque Placaje.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarPlacaje() {
        System.out.println(nombre + " usó Placaje!");
        return true; 
    }
    
    /**
     * Realiza el ataque Arañazo.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarArañazo() {
        System.out.println(nombre + " usó Arañazo!");
        return true; 
    }
    
    /**
     * Realiza el ataque Mordisco.
     * 
     * @return true si el ataque se ejecuta correctamente.
     */
    public boolean atacarMordisco() {
        System.out.println(nombre + " usó Mordisco!");
        return true; 
    }

    /**
     * Obtiene el número de la Pokédex del Pokémon.
     * 
     * @return Número de la Pokédex.
     */
    public String getNumPokedex() {
        return numPokedex;
    }

    /**
     * Establece el número de la Pokédex del Pokémon.
     * 
     * @param numPokedex Número de la Pokédex.
     */
    public void setNumPokedex(String numPokedex) {
        this.numPokedex = numPokedex;
    }

    /**
     * Obtiene el peso del Pokémon.
     * 
     * @return Peso del Pokémon en kilogramos.
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Establece el peso del Pokémon.
     * 
     * @param peso Peso del Pokémon en kilogramos.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el nombre del Pokémon.
     * 
     * @return Nombre del Pokémon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del Pokémon.
     * 
     * @param nombre Nombre del Pokémon.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la temporada en la que aparece el Pokémon.
     * 
     * @return Temporada del Pokémon.
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Establece la temporada en la que aparece el Pokémon.
     * 
     * @param temporada Temporada del Pokémon.
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
