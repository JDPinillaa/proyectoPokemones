/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 * Clase que representa a Pikachu, un Pokémon de tipo eléctrico.
 * Extiende la clase abstracta Pokemon e implementa la interfaz PokemonElectrico.
 * 
 * @author juand
 * @since 20250331
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {

    /**
     * Constructor de la clase Pikachu.
     * 
     * @param numPokedex Número de la Pokédex del Pokémon.
     * @param peso Peso del Pokémon en kilogramos.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que aparece el Pokémon.
     */
    public Pikachu(String numPokedex, float peso, String nombre, int temporada) {
        super(numPokedex, peso, nombre, temporada);
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(getNombre() + " usó Impactrueno!");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println(getNombre() + " usó Puño Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println(getNombre() + " usó Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(getNombre() + " usó Rayo Carga!");
    }
}
