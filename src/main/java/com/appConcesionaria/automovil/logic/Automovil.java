
package com.appConcesionaria.automovil.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String modelo;
    private String motor;
    private String color;
    private String patente;
    private int cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int _id, String modelo, String motor, String color, String patente, int cantidadPuertas) {
        this.id = _id;
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "_id=" + id + ", modelo=" + modelo + ", motor=" + motor + ", color=" + color + ", patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
    
    
}
