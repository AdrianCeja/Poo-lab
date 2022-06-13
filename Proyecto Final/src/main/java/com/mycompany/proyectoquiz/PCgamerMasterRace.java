package com.mycompany.proyectoquiz;


public class PCgamerMasterRace extends Enemigo{      
    
   public PCgamerMasterRace(String nombre, int vida, boolean estadoDeVida){	 
	super(nombre,vida,estadoDeVida);
    }
    
    public int perderVidaPCgamerMasterRace(){
       vida = vida - 25;
       return vida;
    }
}
