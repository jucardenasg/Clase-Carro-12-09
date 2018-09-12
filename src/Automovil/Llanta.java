/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovil;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    private final String marca;
    private final String modelo;
    private final int pulgadas;
    
    private final Llanta[] llanta;
    private final Motor motor;
    private final Puerta[] puerta;
   
    /**
     *
     * @param marca
     * @param modelo
     * @param pulgadas
     * @param Llanta
     * @param motor
     * @param Puerta
     */
    public Llanta(String marca, String modelo,int pulgadas, int Llanta, Motor motor, int Puerta){
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.llanta = new Llanta[4];
        this.motor = motor;
        this.puerta = new Puerta[4];
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPulgadas() {
        return pulgadas;
    }
    
    
    
}
        
