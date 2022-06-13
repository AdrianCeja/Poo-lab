package com.mycompany.proyectoquiz;

public class Preguntas {
    
    //Principiante
    String[] PregutaPrincipiante = {	
        "¿Qué es la programación?",		
        "¿Cuáles son los lenguajes de programación más comunes?",		
        "¿Cuáles son los elementos primordiales de la programación?",			
        "¿El diagrama de flujo es un buen inicio de teoría para programar?",                       
    };
   
    String[][] RespuestaPrincipiante = {
        {"Proceso de creación de programas informáticos", "Tratamiento automático de la información", "Arte de combinar los sonidos", "Modelo cromático que representa varios colores"},
        {"Intel y AMD","Java, Python y C++", "Nvidia y LG" , "Microsoft, Windows, Linux y MacOS"},
        {"Emisor, receptor y mensaje", "Tono, intensidad y tiembre", "Creatividad, lógica y razonamiento", "Cuerpo, Movimiento y Forma"},
        {"Tal vez", "Puede ser", "Verdadero", "Falso"},
    };
           
   char[] respuestas1 = {
	'A',
	'B',
	'C',
	'C'
    };
   
    //Estandar
    String[] PreguntaEstandar = {
         "¿Qué es codificar?",
         "¿En cuál de los siguientes programas puedes codificar?",
         "¿Cuál es uno de los errores más comunes al programar?",
         "Es uno de los pasos que hay que seguir para programar"           

    };
    
    String[][] RespuestaEstandar = {
        {"Es la conversión de un algoritmo en programa", "Es la conversión del pensamiento al notpad++", "Es la ciencia formal que abarca la computación ", "Aplicación orientada al entretenimiento"},
        {"Assetto Corsa", "Discord", "CodeBlocks", "Visual Hear"},
        {"No agregar los dibujos", "Olvidar el ;", "No compilar", "Olvidar guardar como .png"},
        {"Codificación","Investigar el tema", "Elaborar una hipótesis", "Analizar los datos y sacar una conclusión"}
    };
    
    char[] respuestas2 = {
	'C',
	'B',
	'B',
	'A'
    };
    
    //Dificiles
    
    String[] PreguntaDificil = {  
        "¿En qué año se creó el lenguaje de programación C?",                   
        "¿Qué es la programación lineal?",                      
        "¿La conjunción de 2 valores solo es cierta si 1 es verdadero?",              
        "¿Con que otro nombre son conocidos los arreglos o arrays?",                    
    };
    
    String[][] RespuestaDificil = {
        {"1990", "1972", "1985", "1853"},
        {"Un proceso de minimización", "Proceso de maximización", "Proceso de ampliación", "Proceso de optimización"},
        {"Falso", "Tal vez sí", "Verdadero", "Tal vez no"},
        {"Constantes y variables", "Operadores matemáticos y lógicos","Vectores o matrices", "Polígonos y poliedros"},
    };
    
    char[] respuestas3 = {
	'B',
	'D',
	'A',
	'C'
    };
        
    //Experto
    String[] PreguntaExperto = {
        "¿En qué año nació el primer lenguaje de programación?",
        "¿Como se le conoce también a un subprograma?",
        "Forma vertical de almacenar datos en la memoria de la computadora y mostrarlos por pantalla",
        "Un arreglo para dirigir almacenar y accesar a los datos debe contar con:",
    };
         
    String[][] RespuestaExperto = {
        {"relleno52342352", "1801", "relleno123512", "relleno15262346"},
        {"ciclos y sentencias", "ciclos", "sentencias","sentencias y ciclos"},
        {"Listas","lista", "listas","Lista"},
        {"índice","indice", "Indice","Índice"},
    };
        
    public void preguntasExperto(){
    }       
}
