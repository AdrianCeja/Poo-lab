package com.mycompany.proyectoquiz;

public class PCagonizante extends Enemigo {

    public PCagonizante(String nombre, int vida, boolean estadoDeVida){	 
	super(nombre,vida,estadoDeVida);
    }
    
    public int perderVidaPCagonizante(){
       vida = vida - 25;
           return vida;
    } 
}
