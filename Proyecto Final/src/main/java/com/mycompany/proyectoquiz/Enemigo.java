package com.mycompany.proyectoquiz;

public abstract class Enemigo {
    String nombre;
    int edad, vida;
    boolean estadoDeVida;

    public Enemigo(String nombre, int vida, boolean estadoDeVida){	 
        this.nombre = nombre;
        this.vida = vida;
        this.estadoDeVida = estadoDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    void setVida(int vida) {
        this.vida = vida;
    }

    public boolean getEstadoDeVida() {
        return estadoDeVida;
    }

    void setEstadoDeVida(Boolean estadoDeVida) {
        this.estadoDeVida = estadoDeVida;
    }

}
