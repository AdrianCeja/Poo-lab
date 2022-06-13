package com.mycompany.proyectoquiz;

public class PCgodin extends Enemigo{
    
    public PCgodin(String nombre, int vida, boolean estadoDeVida){	 
	super(nombre,vida,estadoDeVida);
    }
    
    public int perderVidaPCgodin(){
       vida = vida - 20;
       return vida;
    }
}