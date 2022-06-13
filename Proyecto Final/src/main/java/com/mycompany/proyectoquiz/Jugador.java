package com.mycompany.proyectoquiz;

public class Jugador {
  
    String nombre;
    String puntos;
    String Dificultad;
    int x;
    
    String[][] Puntuacion = {
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""}
    };
    
    String[][] Puntuacion2 = {
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""},
        {"","",""}
    };

    
    public void OrdenarPuntuaciones(){
 
        x=0;
        
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("5")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        } 
        
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("4")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        }
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("3")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        }
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("2")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        }
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("1")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        }
        for(int i = 0; i<20; i++){
            if(Puntuacion[i][2].equals("0")){
                Puntuacion2[x][0]=Puntuacion[i][0];
                Puntuacion2[x][1]=Puntuacion[i][1];
                Puntuacion2[x][2]=Puntuacion[i][2]; 
                x++;
            }      
        }
    }  
}
   