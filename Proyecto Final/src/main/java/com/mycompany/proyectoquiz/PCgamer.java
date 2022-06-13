package com.mycompany.proyectoquiz;


public class PCgamer extends Enemigo{       
    
    public PCgamer(String nombre, int vida, boolean estadoDeVida){	 
	super(nombre,vida,estadoDeVida);
    }
    
    public int perderVidaPCgamer(){
       vida = vida - 25;
       return vida;
    }
}
