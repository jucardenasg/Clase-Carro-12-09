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
public class Automovil {
    private int anno;
    private String marca;
    private String modelo;
    //Creando objetos
    private final Llanta[] llanta;
    private final Motor motor;
    private final Puerta[] puerta;

    public Automovil(int anno, String marca, String modelo, Llanta[] llanta, Motor motor, Puerta[] puerta) {
        this.anno = anno;
        this.marca = marca;
        this.modelo = modelo;
        this.llanta = new Llanta[4];
        this.motor = motor;
        this.puerta = new Puerta[4];
    }
    
 
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getAnno(){
        return anno;
    }
    
    public void setAnno(int anno){
        this.anno = anno;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
}
