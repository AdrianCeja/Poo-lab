package com.mycompany.proyectoquiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Juego extends javax.swing.JFrame {

    //Variables
    int x;
    int y;
    char correcta;
    int index;
    int respuestasCorrectas = 0;
    int totalPreguntas = 4;
    int segundos = 10;
    int conocimientos = 0;
    int flag, flagPrincipiante, flagEstandar, flagDificil, flagExperto, flagExperto2;
    String RespuestaExperto;
    int Persona;
    
    // Elementos de musica
    Musica musica = new Musica();
    
    //Preguntas
    Preguntas P = new Preguntas();
    
    //Enemigos
    PCagonizante EnemigoPrincipiante = new PCagonizante("PC Agonizante", 100, true);
    PCgodin EnemigoEstandar = new PCgodin("PC Godin", 100, true);
    PCgamer EnemigoDificil = new PCgamer("PC Gamer", 100, true);
    PCgamerMasterRace EnemigoExperto = new PCgamerMasterRace("PC Gamer Master Race", 100, true);
    Jugador J = new Jugador();
    
    
    public void PreguntasPrincipiante(){
        jButton_OpcionPrincipiante1.show();
	jButton_OpcionPrincipiante2.show();
	jButton_OpcionPrincipiante3.show();
	jButton_OpcionPrincipiante4.show();    
    }
    
    public void PreguntasEstandar(){
        jButton_OpcionEstandar1.show();
	jButton_OpcionEstandar2.show();
	jButton_OpcionEstandar3.show();
	jButton_OpcionEstandar4.show();    
    }
    
    public void PreguntasDificiles(){
        jButton_OpcionDificil1.show();
	jButton_OpcionDificil2.show();
	jButton_OpcionDificil3.show();
	jButton_OpcionDificil4.show();    
    }
    
    
    public Juego() {
        initComponents();
        
        //Inicio del juego
        musica.reproducirMusica("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\BeatFondo.wav");
                
        JPanel_Dificultad.hide();
        jPanel_PreguntasPrincipiante.hide();
        jPanel_PreguntasEstandar.hide();
        jPanel_PreguntasDificil.hide();
        jPanel_PreguntasExperto.hide();
        jPanel_Puntuacion.hide();
    }
    
    private void nextQuestion(){
        
        if (flag == 1){
            if (index>=totalPreguntas){
                    results();
            }
            else{
                    jTextPane_PreguntaPrincipiante.setText(P.PregutaPrincipiante[index]);
                    jButton_OpcionPrincipiante1.setText(P.RespuestaPrincipiante[index][0]);
                    jButton_OpcionPrincipiante2.setText(P.RespuestaPrincipiante[index][1]);
                    jButton_OpcionPrincipiante3.setText(P.RespuestaPrincipiante[index][2]);
                    jButton_OpcionPrincipiante4.setText(P.RespuestaPrincipiante[index][3]);
            }
        }
        else if (flag == 2){
            if (index>=totalPreguntas){
                    results();
            }
            else{
                    jTextPane_PreguntaEstandar.setText(P.PreguntaEstandar[index]);
                    jButton_OpcionEstandar1.setText(P.RespuestaEstandar[index][0]);
                    jButton_OpcionEstandar2.setText(P.RespuestaEstandar[index][1]);
                    jButton_OpcionEstandar3.setText(P.RespuestaEstandar[index][2]);
                    jButton_OpcionEstandar4.setText(P.RespuestaEstandar[index][3]);
            }
        }
        else if (flag == 3){
            if (index>=totalPreguntas){
                    results();
            }
            else{
                    jTextPane_PreguntaDificil.setText(P.PreguntaDificil[index]);
                    jButton_OpcionDificil1.setText(P.RespuestaDificil[index][0]);
                    jButton_OpcionDificil2.setText(P.RespuestaDificil[index][1]);
                    jButton_OpcionDificil3.setText(P.RespuestaDificil[index][2]);
                    jButton_OpcionDificil4.setText(P.RespuestaDificil[index][3]);
            }
        }
        
        else if (flag == 4){
            if (index>=totalPreguntas){
                    results();
            }
            else{
                    jTextPane_PreguntaExperto.setText(P.PreguntaExperto[index]);
            }
        }
    }
    
    public void displayAnswer() {
        
        if (flag == 1){
            jButton_OpcionPrincipiante1.setEnabled(false);
            jButton_OpcionPrincipiante2.setEnabled(false);
            jButton_OpcionPrincipiante3.setEnabled(false);
            jButton_OpcionPrincipiante4.setEnabled(false);

            Timer pause = new Timer(2000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    correcta= ' ';
                    segundos=10;
                    jButton_OpcionPrincipiante1.setEnabled(true);
                    jButton_OpcionPrincipiante2.setEnabled(true);
                    jButton_OpcionPrincipiante3.setEnabled(true);
                    jButton_OpcionPrincipiante4.setEnabled(true);
                    index++;
                    nextQuestion();
                    }
            });
                    pause.setRepeats(false);
                    pause.start();
        }
        else if (flag == 2){
            jButton_OpcionEstandar1.setEnabled(false);
            jButton_OpcionEstandar2.setEnabled(false);
            jButton_OpcionEstandar3.setEnabled(false);
            jButton_OpcionEstandar4.setEnabled(false);

            Timer pause = new Timer(2000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    correcta= ' ';
                    segundos=10;
                    jButton_OpcionEstandar1.setEnabled(true);
                    jButton_OpcionEstandar2.setEnabled(true);
                    jButton_OpcionEstandar3.setEnabled(true);
                    jButton_OpcionEstandar4.setEnabled(true);
                    index++;
                    nextQuestion();
                    }
            });
                    pause.setRepeats(false);
                    pause.start();
        }
        else if (flag == 3){
            jButton_OpcionDificil1.setEnabled(false);
            jButton_OpcionDificil2.setEnabled(false);
            jButton_OpcionDificil3.setEnabled(false);
            jButton_OpcionDificil4.setEnabled(false);

            Timer pause = new Timer(2000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    correcta= ' ';
                    segundos=10;
                    jButton_OpcionDificil1.setEnabled(true);
                    jButton_OpcionDificil2.setEnabled(true);
                    jButton_OpcionDificil3.setEnabled(true);
                    jButton_OpcionDificil4.setEnabled(true);
                    index++;
                    nextQuestion();
                    }
            });
                    pause.setRepeats(false);
                    pause.start();
        }
        
        else if (flag == 4){
            jButton_ExpertoAceptar.setEnabled(false);

            Timer pause = new Timer(2000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){

                    correcta= ' ';
                    segundos=10;
                    jButton_ExpertoAceptar.setEnabled(true);
                    index++;
                    nextQuestion();
                    }
            });
                    pause.setRepeats(false);
                    pause.start();
        }
    }
    
    public void results(){
        
        if (flag == 1){
            jButton_OpcionPrincipiante1.hide();
            jButton_OpcionPrincipiante2.hide();
            jButton_OpcionPrincipiante3.hide();
            jButton_OpcionPrincipiante4.hide();
            jButton_VolverPrincipiante.show();


            if (EnemigoPrincipiante.getVida() == 0){
                    respuestasCorrectas+=1;
            }
            jTextPane_PreguntaPrincipiante.setText("Has obtenido ("+respuestasCorrectas+"/"+totalPreguntas+") respuestas correctas!");
            conocimientos +=respuestasCorrectas;
        }
        else if (flag == 2){
            jButton_OpcionEstandar1.hide();
            jButton_OpcionEstandar2.hide();
            jButton_OpcionEstandar3.hide();
            jButton_OpcionEstandar4.hide();
            jButton_VolverEstandar.show();


            if (EnemigoEstandar.getVida() == 0){
                    respuestasCorrectas+=1;
            }
            jTextPane_PreguntaEstandar.setText("Has obtenido ("+respuestasCorrectas+"/"+totalPreguntas+") respuestas correctas!");
            conocimientos +=respuestasCorrectas;
        }
         else if (flag == 3){
            jButton_OpcionDificil1.hide();
            jButton_OpcionDificil2.hide();
            jButton_OpcionDificil3.hide();
            jButton_OpcionDificil4.hide();
            jButton_VolverDificil.show();


            if (EnemigoDificil.getVida() == 0){
                    respuestasCorrectas+=1;
            }
            jTextPane_PreguntaDificil.setText("Has obtenido ("+respuestasCorrectas+"/"+totalPreguntas+") respuestas correctas!");
            conocimientos +=respuestasCorrectas;
        }
        
        
        else if (flag == 4){
            jButton_ExpertoAceptar.hide();
            jTextField_ExpertoRespuesta.hide();
            jLabel_TextoRespuesta.hide();
            jButton_VolverExperto.show();

            if (EnemigoExperto.getVida() == 0){
                    respuestasCorrectas+=1;
            }
            jTextPane_PreguntaExperto.setText("Has obtenido ("+respuestasCorrectas+"/"+totalPreguntas+") respuestas correctas!");
            conocimientos +=respuestasCorrectas;
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Menu = new javax.swing.JPanel();
        Boton_Jugar = new javax.swing.JButton();
        Label_Titulo = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();
        jButton_Puntuacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JPanel_Dificultad = new javax.swing.JPanel();
        jLabel_TituloDificultad = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Dificultad = new javax.swing.JLabel();
        jButton_Principiante = new javax.swing.JButton();
        jButton_Estandar = new javax.swing.JButton();
        jButton_Experto = new javax.swing.JButton();
        jButton_Dificil = new javax.swing.JButton();
        jButton_VolverDificultad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel_Puntuacion = new javax.swing.JPanel();
        jButton_VolverPuntuacion = new javax.swing.JButton();
        jLabel_Puntuaciones = new javax.swing.JLabel();
        jLabel_Nombres = new javax.swing.JLabel();
        jLabel_Dificultades = new javax.swing.JLabel();
        jLabel_Puntuacion = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        jLabel_Nombre6 = new javax.swing.JLabel();
        jLabel_Dificultad1 = new javax.swing.JLabel();
        jLabel_Dificultad2 = new javax.swing.JLabel();
        jLabel_Dificultad3 = new javax.swing.JLabel();
        jLabel_Dificultad4 = new javax.swing.JLabel();
        jLabel_Dificultad5 = new javax.swing.JLabel();
        jLabel_Dificultad6 = new javax.swing.JLabel();
        jLabel_Puntos1 = new javax.swing.JLabel();
        jLabel_Puntos2 = new javax.swing.JLabel();
        jLabel_Puntos3 = new javax.swing.JLabel();
        jLabel_Puntos4 = new javax.swing.JLabel();
        jLabel_Puntos5 = new javax.swing.JLabel();
        jLabel_Puntos6 = new javax.swing.JLabel();
        jLabel_Posicion = new javax.swing.JLabel();
        jLabel_Posicion1 = new javax.swing.JLabel();
        jLabel_Posicion2 = new javax.swing.JLabel();
        jLabel_Posicion3 = new javax.swing.JLabel();
        jLabel_Posicion4 = new javax.swing.JLabel();
        jLabel_Posicion5 = new javax.swing.JLabel();
        jLabel_Posicion6 = new javax.swing.JLabel();
        jLabel_FondoPuntuacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_PreguntasPrincipiante = new javax.swing.JPanel();
        jButton_VolverPrincipiante = new javax.swing.JButton();
        jProgressBar_VidaPrincipiante = new javax.swing.JProgressBar();
        jButton_OpcionPrincipiante3 = new javax.swing.JButton();
        jButton_OpcionPrincipiante4 = new javax.swing.JButton();
        jButton_OpcionPrincipiante2 = new javax.swing.JButton();
        jButton_OpcionPrincipiante1 = new javax.swing.JButton();
        jScrollPane_PreguntaPrincipiante = new javax.swing.JScrollPane();
        jTextPane_PreguntaPrincipiante = new javax.swing.JTextPane();
        jLabel_NombrePrincipiante = new javax.swing.JLabel();
        PCPrincipiante = new javax.swing.JLabel();
        FondoPrincipiante = new javax.swing.JLabel();
        jPanel_PreguntasEstandar = new javax.swing.JPanel();
        jButton_VolverEstandar = new javax.swing.JButton();
        jProgressBar_VidaEstandar = new javax.swing.JProgressBar();
        jButton_OpcionEstandar3 = new javax.swing.JButton();
        jButton_OpcionEstandar2 = new javax.swing.JButton();
        jButton_OpcionEstandar4 = new javax.swing.JButton();
        jButton_OpcionEstandar1 = new javax.swing.JButton();
        jScrollPane_PreguntaEstandar = new javax.swing.JScrollPane();
        jTextPane_PreguntaEstandar = new javax.swing.JTextPane();
        PCestandar = new javax.swing.JLabel();
        jLabel_NombreEstandar = new javax.swing.JLabel();
        jLabel_FondoEstandar = new javax.swing.JLabel();
        FondoBlancoEstandar = new javax.swing.JPanel();
        jPanel_PreguntasDificil = new javax.swing.JPanel();
        jButton_VolverDificil = new javax.swing.JButton();
        jProgressBar_VidaDificil = new javax.swing.JProgressBar();
        jButton_OpcionDificil3 = new javax.swing.JButton();
        jButton_OpcionDificil4 = new javax.swing.JButton();
        jButton_OpcionDificil2 = new javax.swing.JButton();
        jButton_OpcionDificil1 = new javax.swing.JButton();
        jScrollPane_PreguntaDificil = new javax.swing.JScrollPane();
        jTextPane_PreguntaDificil = new javax.swing.JTextPane();
        jLabel_NombreDificil = new javax.swing.JLabel();
        PCDificil = new javax.swing.JLabel();
        jLabel_FondoDificil = new javax.swing.JLabel();
        FondoBlancoDificil = new javax.swing.JPanel();
        jPanel_PreguntasExperto = new javax.swing.JPanel();
        jButton_VolverExperto = new javax.swing.JButton();
        jProgressBar_VidaExperto = new javax.swing.JProgressBar();
        jScrollPane_PreguntaExperto = new javax.swing.JScrollPane();
        jTextPane_PreguntaExperto = new javax.swing.JTextPane();
        jTextField_ExpertoRespuesta = new javax.swing.JTextField();
        jLabel_TextoRespuesta = new javax.swing.JLabel();
        jLabel_NombreExperto = new javax.swing.JLabel();
        jButton_ExpertoAceptar = new javax.swing.JButton();
        PCExperto = new javax.swing.JLabel();
        jLabel_FondoExperto = new javax.swing.JLabel();
        FondoBlancoExperto = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programming Test");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setName("JForm_Principal"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        JPanel_Menu.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Menu.setMinimumSize(new java.awt.Dimension(1024, 720));
        JPanel_Menu.setLayout(null);

        Boton_Jugar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Boton_Jugar.setText("Jugar");
        Boton_Jugar.setBorder(null);
        Boton_Jugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Jugar.setName("Boton_Jugar"); // NOI18N
        Boton_Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_JugarActionPerformed(evt);
            }
        });
        JPanel_Menu.add(Boton_Jugar);
        Boton_Jugar.setBounds(400, 320, 164, 84);

        Label_Titulo.setFont(new java.awt.Font("Roboto Medium", 0, 72)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Programming Test ");
        Label_Titulo.setName("label_Titulo1"); // NOI18N
        JPanel_Menu.add(Label_Titulo);
        Label_Titulo.setBounds(0, 0, 1020, 100);

        jButton_Salir.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.setBorder(null);
        jButton_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        JPanel_Menu.add(jButton_Salir);
        jButton_Salir.setBounds(550, 450, 160, 80);

        jButton_Puntuacion.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Puntuacion.setText("Puntuaciones");
        jButton_Puntuacion.setBorder(null);
        jButton_Puntuacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Puntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PuntuacionActionPerformed(evt);
            }
        });
        JPanel_Menu.add(jButton_Puntuacion);
        jButton_Puntuacion.setBounds(240, 450, 190, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\Fondoprog.png")); // NOI18N
        jLabel1.setText("jLabel1");
        JPanel_Menu.add(jLabel1);
        jLabel1.setBounds(-3, 110, 1030, 610);

        getContentPane().add(JPanel_Menu);
        JPanel_Menu.setBounds(0, 0, 1024, 720);

        JPanel_Dificultad.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Dificultad.setMaximumSize(new java.awt.Dimension(1024, 720));
        JPanel_Dificultad.setMinimumSize(new java.awt.Dimension(1024, 720));
        JPanel_Dificultad.setName("JPanel_Dificultad"); // NOI18N
        JPanel_Dificultad.setPreferredSize(new java.awt.Dimension(1024, 720));
        JPanel_Dificultad.setLayout(null);

        jLabel_TituloDificultad.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TituloDificultad.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_TituloDificultad.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_TituloDificultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TituloDificultad.setText("Selecciona la dificultad");
        JPanel_Dificultad.add(jLabel_TituloDificultad);
        jLabel_TituloDificultad.setBounds(0, 0, 1020, 100);

        jTextField_Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jTextField_Nombre.setText("Usuario");
        jTextField_Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_NombreMouseClicked(evt);
            }
        });
        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jTextField_Nombre);
        jTextField_Nombre.setBounds(460, 200, 180, 40);

        jLabel_Nombre.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        jLabel_Nombre.setName(""); // NOI18N
        JPanel_Dificultad.add(jLabel_Nombre);
        jLabel_Nombre.setBounds(360, 200, 100, 40);

        jLabel_Dificultad.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Dificultad.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad.setText("Dificultad:");
        JPanel_Dificultad.add(jLabel_Dificultad);
        jLabel_Dificultad.setBounds(30, 300, 170, 43);

        jButton_Principiante.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Principiante.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Principiante.setText("Principiante");
        jButton_Principiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Principiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_PrincipianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_PrincipianteMouseExited(evt);
            }
        });
        jButton_Principiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrincipianteActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jButton_Principiante);
        jButton_Principiante.setBounds(80, 390, 170, 50);

        jButton_Estandar.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Estandar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Estandar.setText("Estándar");
        jButton_Estandar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Estandar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_EstandarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_EstandarMouseExited(evt);
            }
        });
        jButton_Estandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EstandarActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jButton_Estandar);
        jButton_Estandar.setBounds(330, 390, 140, 50);

        jButton_Experto.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Experto.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Experto.setText("Experto");
        jButton_Experto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Experto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_ExpertoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_ExpertoMouseExited(evt);
            }
        });
        jButton_Experto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExpertoActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jButton_Experto);
        jButton_Experto.setBounds(780, 390, 150, 50);

        jButton_Dificil.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Dificil.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_Dificil.setText("Difícil");
        jButton_Dificil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Dificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_DificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_DificilMouseExited(evt);
            }
        });
        jButton_Dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DificilActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jButton_Dificil);
        jButton_Dificil.setBounds(570, 390, 140, 50);

        jButton_VolverDificultad.setBackground(new java.awt.Color(204, 204, 204));
        jButton_VolverDificultad.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverDificultad.setText("Regresar");
        jButton_VolverDificultad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_VolverDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverDificultadActionPerformed(evt);
            }
        });
        JPanel_Dificultad.add(jButton_VolverDificultad);
        jButton_VolverDificultad.setBounds(20, 630, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoDificultad.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1024, 864));
        JPanel_Dificultad.add(jLabel2);
        jLabel2.setBounds(-3, 90, 1030, 630);

        getContentPane().add(JPanel_Dificultad);
        JPanel_Dificultad.setBounds(0, 0, 1024, 720);

        jPanel_Puntuacion.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel_Puntuacion.setLayout(null);

        jButton_VolverPuntuacion.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverPuntuacion.setText("Regresar");
        jButton_VolverPuntuacion.setBorder(null);
        jButton_VolverPuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverPuntuacionActionPerformed(evt);
            }
        });
        jPanel_Puntuacion.add(jButton_VolverPuntuacion);
        jButton_VolverPuntuacion.setBounds(40, 620, 130, 40);

        jLabel_Puntuaciones.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_Puntuaciones.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Puntuaciones.setText("Puntuaciones");
        jPanel_Puntuacion.add(jLabel_Puntuaciones);
        jLabel_Puntuaciones.setBounds(360, 20, 320, 60);

        jLabel_Nombres.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombres.setText("Nombres");
        jPanel_Puntuacion.add(jLabel_Nombres);
        jLabel_Nombres.setBounds(340, 150, 150, 60);

        jLabel_Dificultades.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Dificultades.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultades.setText("Dificultad");
        jPanel_Puntuacion.add(jLabel_Dificultades);
        jLabel_Dificultades.setBounds(540, 150, 160, 60);

        jLabel_Puntuacion.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Puntuacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntuacion.setText("Puntos");
        jPanel_Puntuacion.add(jLabel_Puntuacion);
        jLabel_Puntuacion.setBounds(740, 150, 120, 60);

        jLabel_Nombre1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre1.setText("N1");
        jPanel_Puntuacion.add(jLabel_Nombre1);
        jLabel_Nombre1.setBounds(360, 230, 130, 40);

        jLabel_Nombre2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre2.setText("N2");
        jPanel_Puntuacion.add(jLabel_Nombre2);
        jLabel_Nombre2.setBounds(360, 290, 130, 40);

        jLabel_Nombre3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre3.setText("N3");
        jPanel_Puntuacion.add(jLabel_Nombre3);
        jLabel_Nombre3.setBounds(360, 350, 150, 40);

        jLabel_Nombre4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre4.setText("N4");
        jPanel_Puntuacion.add(jLabel_Nombre4);
        jLabel_Nombre4.setBounds(360, 410, 150, 40);

        jLabel_Nombre5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre5.setText("N5");
        jPanel_Puntuacion.add(jLabel_Nombre5);
        jLabel_Nombre5.setBounds(360, 470, 160, 40);

        jLabel_Nombre6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Nombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre6.setText("N6");
        jPanel_Puntuacion.add(jLabel_Nombre6);
        jLabel_Nombre6.setBounds(360, 530, 150, 40);

        jLabel_Dificultad1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad1.setText("D1");
        jLabel_Dificultad1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel_Puntuacion.add(jLabel_Dificultad1);
        jLabel_Dificultad1.setBounds(550, 230, 170, 40);

        jLabel_Dificultad2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad2.setText("D2");
        jPanel_Puntuacion.add(jLabel_Dificultad2);
        jLabel_Dificultad2.setBounds(550, 290, 170, 40);

        jLabel_Dificultad3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad3.setText("D3");
        jPanel_Puntuacion.add(jLabel_Dificultad3);
        jLabel_Dificultad3.setBounds(550, 350, 170, 40);

        jLabel_Dificultad4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad4.setText("D4");
        jPanel_Puntuacion.add(jLabel_Dificultad4);
        jLabel_Dificultad4.setBounds(550, 410, 170, 40);

        jLabel_Dificultad5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad5.setText("D5");
        jPanel_Puntuacion.add(jLabel_Dificultad5);
        jLabel_Dificultad5.setBounds(550, 470, 170, 40);

        jLabel_Dificultad6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Dificultad6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dificultad6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dificultad6.setText("D6");
        jPanel_Puntuacion.add(jLabel_Dificultad6);
        jLabel_Dificultad6.setBounds(550, 530, 170, 40);

        jLabel_Puntos1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos1.setText("P1");
        jPanel_Puntuacion.add(jLabel_Puntos1);
        jLabel_Puntos1.setBounds(780, 230, 30, 40);

        jLabel_Puntos2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos2.setText("P2");
        jPanel_Puntuacion.add(jLabel_Puntos2);
        jLabel_Puntos2.setBounds(780, 290, 90, 40);

        jLabel_Puntos3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos3.setText("P3");
        jPanel_Puntuacion.add(jLabel_Puntos3);
        jLabel_Puntos3.setBounds(780, 350, 90, 40);

        jLabel_Puntos4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos4.setText("P4");
        jPanel_Puntuacion.add(jLabel_Puntos4);
        jLabel_Puntos4.setBounds(780, 410, 90, 40);

        jLabel_Puntos5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos5.setText("P5");
        jPanel_Puntuacion.add(jLabel_Puntos5);
        jLabel_Puntos5.setBounds(780, 470, 90, 40);

        jLabel_Puntos6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel_Puntos6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Puntos6.setText("P6");
        jPanel_Puntuacion.add(jLabel_Puntos6);
        jLabel_Puntos6.setBounds(780, 530, 90, 40);

        jLabel_Posicion.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion.setText("Posición");
        jPanel_Puntuacion.add(jLabel_Posicion);
        jLabel_Posicion.setBounds(160, 150, 150, 60);

        jLabel_Posicion1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion1.setText("1.");
        jPanel_Puntuacion.add(jLabel_Posicion1);
        jLabel_Posicion1.setBounds(220, 230, 40, 40);

        jLabel_Posicion2.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion2.setText("2.");
        jPanel_Puntuacion.add(jLabel_Posicion2);
        jLabel_Posicion2.setBounds(220, 290, 40, 40);

        jLabel_Posicion3.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion3.setText("3.");
        jPanel_Puntuacion.add(jLabel_Posicion3);
        jLabel_Posicion3.setBounds(220, 350, 40, 40);

        jLabel_Posicion4.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion4.setText("4.");
        jPanel_Puntuacion.add(jLabel_Posicion4);
        jLabel_Posicion4.setBounds(220, 410, 40, 40);

        jLabel_Posicion5.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion5.setText("5.");
        jPanel_Puntuacion.add(jLabel_Posicion5);
        jLabel_Posicion5.setBounds(220, 470, 30, 40);

        jLabel_Posicion6.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_Posicion6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Posicion6.setText("6.");
        jPanel_Puntuacion.add(jLabel_Posicion6);
        jLabel_Posicion6.setBounds(220, 530, 40, 40);

        jLabel_FondoPuntuacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoPuntuaciones1.png")); // NOI18N
        jLabel_FondoPuntuacion.setText("jLabel1");
        jPanel_Puntuacion.add(jLabel_FondoPuntuacion);
        jLabel_FondoPuntuacion.setBounds(0, 100, 1030, 650);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Puntuacion.add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 100);

        getContentPane().add(jPanel_Puntuacion);
        jPanel_Puntuacion.setBounds(0, 0, 1024, 720);

        jPanel_PreguntasPrincipiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_PreguntasPrincipiante.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasPrincipiante.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasPrincipiante.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasPrincipiante.setLayout(null);

        jButton_VolverPrincipiante.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverPrincipiante.setText("Continuar");
        jButton_VolverPrincipiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_VolverPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverPrincipianteActionPerformed(evt);
            }
        });
        jPanel_PreguntasPrincipiante.add(jButton_VolverPrincipiante);
        jButton_VolverPrincipiante.setBounds(370, 480, 310, 70);

        jProgressBar_VidaPrincipiante.setBackground(new java.awt.Color(0, 255, 0));
        jProgressBar_VidaPrincipiante.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        jProgressBar_VidaPrincipiante.setForeground(new java.awt.Color(0, 51, 255));
        jProgressBar_VidaPrincipiante.setToolTipText("");
        jProgressBar_VidaPrincipiante.setValue(100);
        jProgressBar_VidaPrincipiante.setBorder(null);
        jPanel_PreguntasPrincipiante.add(jProgressBar_VidaPrincipiante);
        jProgressBar_VidaPrincipiante.setBounds(10, 80, 440, 30);

        jButton_OpcionPrincipiante3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionPrincipiante3.setText("Opcion 3");
        jButton_OpcionPrincipiante3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OpcionPrincipiante3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionPrincipiante3ActionPerformed(evt);
            }
        });
        jPanel_PreguntasPrincipiante.add(jButton_OpcionPrincipiante3);
        jButton_OpcionPrincipiante3.setBounds(50, 560, 420, 70);

        jButton_OpcionPrincipiante4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionPrincipiante4.setText("Opcion 4");
        jButton_OpcionPrincipiante4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OpcionPrincipiante4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionPrincipiante4ActionPerformed(evt);
            }
        });
        jPanel_PreguntasPrincipiante.add(jButton_OpcionPrincipiante4);
        jButton_OpcionPrincipiante4.setBounds(560, 560, 420, 70);

        jButton_OpcionPrincipiante2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionPrincipiante2.setText("Opcion 2");
        jButton_OpcionPrincipiante2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OpcionPrincipiante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionPrincipiante2ActionPerformed(evt);
            }
        });
        jPanel_PreguntasPrincipiante.add(jButton_OpcionPrincipiante2);
        jButton_OpcionPrincipiante2.setBounds(560, 450, 420, 70);

        jButton_OpcionPrincipiante1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionPrincipiante1.setText("Opcion 1");
        jButton_OpcionPrincipiante1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_OpcionPrincipiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionPrincipiante1ActionPerformed(evt);
            }
        });
        jPanel_PreguntasPrincipiante.add(jButton_OpcionPrincipiante1);
        jButton_OpcionPrincipiante1.setBounds(50, 450, 420, 70);

        jTextPane_PreguntaPrincipiante.setBackground(new java.awt.Color(204, 204, 204));
        jTextPane_PreguntaPrincipiante.setEditable(false);
        jTextPane_PreguntaPrincipiante.setBorder(null);
        jTextPane_PreguntaPrincipiante.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jTextPane_PreguntaPrincipiante.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane_PreguntaPrincipiante.setViewportView(jTextPane_PreguntaPrincipiante);

        jPanel_PreguntasPrincipiante.add(jScrollPane_PreguntaPrincipiante);
        jScrollPane_PreguntaPrincipiante.setBounds(190, 350, 670, 70);

        jLabel_NombrePrincipiante.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_NombrePrincipiante.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_NombrePrincipiante.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NombrePrincipiante.setText("Nombre");
        jLabel_NombrePrincipiante.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel_NombrePrincipiante.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel_PreguntasPrincipiante.add(jLabel_NombrePrincipiante);
        jLabel_NombrePrincipiante.setBounds(10, 10, 1010, 70);

        PCPrincipiante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\PCfacil1.png")); // NOI18N
        PCPrincipiante.setText("jLabel4");
        jPanel_PreguntasPrincipiante.add(PCPrincipiante);
        PCPrincipiante.setBounds(440, 130, 170, 210);

        FondoPrincipiante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoFacilAzul.jpg")); // NOI18N
        FondoPrincipiante.setText("jLabel3");
        jPanel_PreguntasPrincipiante.add(FondoPrincipiante);
        FondoPrincipiante.setBounds(0, 126, 1030, 590);
        FondoPrincipiante.getAccessibleContext().setAccessibleName("FondoFacil");

        getContentPane().add(jPanel_PreguntasPrincipiante);
        jPanel_PreguntasPrincipiante.setBounds(0, 0, 1024, 720);

        jPanel_PreguntasEstandar.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasEstandar.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasEstandar.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasEstandar.setLayout(null);

        jButton_VolverEstandar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverEstandar.setText("Continuar");
        jButton_VolverEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverEstandarActionPerformed(evt);
            }
        });
        jPanel_PreguntasEstandar.add(jButton_VolverEstandar);
        jButton_VolverEstandar.setBounds(400, 470, 230, 70);

        jProgressBar_VidaEstandar.setValue(100);
        jPanel_PreguntasEstandar.add(jProgressBar_VidaEstandar);
        jProgressBar_VidaEstandar.setBounds(10, 80, 440, 30);

        jButton_OpcionEstandar3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionEstandar3.setText("Opcion 3");
        jButton_OpcionEstandar3.setToolTipText("");
        jButton_OpcionEstandar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionEstandar3ActionPerformed(evt);
            }
        });
        jPanel_PreguntasEstandar.add(jButton_OpcionEstandar3);
        jButton_OpcionEstandar3.setBounds(70, 590, 410, 80);

        jButton_OpcionEstandar2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionEstandar2.setText("Opcion 2");
        jButton_OpcionEstandar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionEstandar2ActionPerformed(evt);
            }
        });
        jPanel_PreguntasEstandar.add(jButton_OpcionEstandar2);
        jButton_OpcionEstandar2.setBounds(550, 470, 420, 80);

        jButton_OpcionEstandar4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionEstandar4.setText("Opcion 4");
        jButton_OpcionEstandar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionEstandar4ActionPerformed(evt);
            }
        });
        jPanel_PreguntasEstandar.add(jButton_OpcionEstandar4);
        jButton_OpcionEstandar4.setBounds(550, 590, 420, 80);

        jButton_OpcionEstandar1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionEstandar1.setText("Opcion 1");
        jButton_OpcionEstandar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionEstandar1ActionPerformed(evt);
            }
        });
        jPanel_PreguntasEstandar.add(jButton_OpcionEstandar1);
        jButton_OpcionEstandar1.setBounds(70, 470, 410, 80);

        jTextPane_PreguntaEstandar.setBackground(new java.awt.Color(102, 102, 0));
        jTextPane_PreguntaEstandar.setEditable(false);
        jTextPane_PreguntaEstandar.setBorder(null);
        jTextPane_PreguntaEstandar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jScrollPane_PreguntaEstandar.setViewportView(jTextPane_PreguntaEstandar);

        jPanel_PreguntasEstandar.add(jScrollPane_PreguntaEstandar);
        jScrollPane_PreguntaEstandar.setBounds(210, 370, 600, 70);

        PCestandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\PCestandar.png")); // NOI18N
        PCestandar.setText("jLabel5");
        jPanel_PreguntasEstandar.add(PCestandar);
        PCestandar.setBounds(420, 150, 200, 200);

        jLabel_NombreEstandar.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_NombreEstandar.setText("Nombre");
        jPanel_PreguntasEstandar.add(jLabel_NombreEstandar);
        jLabel_NombreEstandar.setBounds(10, 20, 690, 50);

        jLabel_FondoEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoEstandar.jpg")); // NOI18N
        jLabel_FondoEstandar.setText("Fondo");
        jPanel_PreguntasEstandar.add(jLabel_FondoEstandar);
        jLabel_FondoEstandar.setBounds(0, 130, 1020, 590);

        FondoBlancoEstandar.setBackground(new java.awt.Color(255, 255, 255));
        FondoBlancoEstandar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_PreguntasEstandar.add(FondoBlancoEstandar);
        FondoBlancoEstandar.setBounds(0, 0, 1030, 130);

        getContentPane().add(jPanel_PreguntasEstandar);
        jPanel_PreguntasEstandar.setBounds(0, 0, 1024, 720);

        jPanel_PreguntasDificil.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasDificil.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasDificil.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasDificil.setLayout(null);

        jButton_VolverDificil.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverDificil.setText("Continuar");
        jButton_VolverDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverDificilActionPerformed(evt);
            }
        });
        jPanel_PreguntasDificil.add(jButton_VolverDificil);
        jButton_VolverDificil.setBounds(400, 450, 270, 70);

        jProgressBar_VidaDificil.setValue(100);
        jPanel_PreguntasDificil.add(jProgressBar_VidaDificil);
        jProgressBar_VidaDificil.setBounds(10, 80, 440, 30);

        jButton_OpcionDificil3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionDificil3.setText("Opcion 3");
        jButton_OpcionDificil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionDificil3ActionPerformed(evt);
            }
        });
        jPanel_PreguntasDificil.add(jButton_OpcionDificil3);
        jButton_OpcionDificil3.setBounds(100, 570, 370, 80);

        jButton_OpcionDificil4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionDificil4.setText("Opcion 4");
        jButton_OpcionDificil4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionDificil4ActionPerformed(evt);
            }
        });
        jPanel_PreguntasDificil.add(jButton_OpcionDificil4);
        jButton_OpcionDificil4.setBounds(580, 570, 370, 80);

        jButton_OpcionDificil2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionDificil2.setText("Opcion 2");
        jButton_OpcionDificil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionDificil2ActionPerformed(evt);
            }
        });
        jPanel_PreguntasDificil.add(jButton_OpcionDificil2);
        jButton_OpcionDificil2.setBounds(580, 450, 370, 80);

        jButton_OpcionDificil1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton_OpcionDificil1.setText("Opcion 1");
        jButton_OpcionDificil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpcionDificil1ActionPerformed(evt);
            }
        });
        jPanel_PreguntasDificil.add(jButton_OpcionDificil1);
        jButton_OpcionDificil1.setBounds(100, 450, 370, 80);

        jTextPane_PreguntaDificil.setBackground(new java.awt.Color(102, 102, 255));
        jTextPane_PreguntaDificil.setEditable(false);
        jTextPane_PreguntaDificil.setBorder(null);
        jTextPane_PreguntaDificil.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jScrollPane_PreguntaDificil.setViewportView(jTextPane_PreguntaDificil);

        jPanel_PreguntasDificil.add(jScrollPane_PreguntaDificil);
        jScrollPane_PreguntaDificil.setBounds(220, 360, 600, 70);

        jLabel_NombreDificil.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_NombreDificil.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NombreDificil.setText("Nombre");
        jPanel_PreguntasDificil.add(jLabel_NombreDificil);
        jLabel_NombreDificil.setBounds(10, 20, 690, 50);

        PCDificil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\PCDificil.png")); // NOI18N
        jPanel_PreguntasDificil.add(PCDificil);
        PCDificil.setBounds(400, 140, 270, 200);

        jLabel_FondoDificil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoDificil.jpg")); // NOI18N
        jLabel_FondoDificil.setText("Fondo");
        jPanel_PreguntasDificil.add(jLabel_FondoDificil);
        jLabel_FondoDificil.setBounds(0, 130, 1030, 590);

        FondoBlancoDificil.setBackground(new java.awt.Color(255, 255, 255));
        FondoBlancoDificil.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_PreguntasDificil.add(FondoBlancoDificil);
        FondoBlancoDificil.setBounds(0, 0, 1030, 130);

        getContentPane().add(jPanel_PreguntasDificil);
        jPanel_PreguntasDificil.setBounds(0, 0, 1024, 720);

        jPanel_PreguntasExperto.setMaximumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasExperto.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasExperto.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel_PreguntasExperto.setLayout(null);

        jButton_VolverExperto.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_VolverExperto.setText("Continuar");
        jButton_VolverExperto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverExpertoActionPerformed(evt);
            }
        });
        jPanel_PreguntasExperto.add(jButton_VolverExperto);
        jButton_VolverExperto.setBounds(390, 490, 250, 60);
        jButton_VolverExperto.hide();

        jProgressBar_VidaExperto.setValue(100);
        jPanel_PreguntasExperto.add(jProgressBar_VidaExperto);
        jProgressBar_VidaExperto.setBounds(10, 80, 440, 30);

        jTextPane_PreguntaExperto.setBackground(new java.awt.Color(102, 102, 255));
        jTextPane_PreguntaExperto.setEditable(false);
        jTextPane_PreguntaExperto.setBorder(null);
        jTextPane_PreguntaExperto.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jScrollPane_PreguntaExperto.setViewportView(jTextPane_PreguntaExperto);

        jPanel_PreguntasExperto.add(jScrollPane_PreguntaExperto);
        jScrollPane_PreguntaExperto.setBounds(290, 370, 430, 100);

        jTextField_ExpertoRespuesta.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jTextField_ExpertoRespuesta.setToolTipText("");
        jPanel_PreguntasExperto.add(jTextField_ExpertoRespuesta);
        jTextField_ExpertoRespuesta.setBounds(360, 540, 200, 50);

        jLabel_TextoRespuesta.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel_TextoRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TextoRespuesta.setText("Respuesta:");
        jPanel_PreguntasExperto.add(jLabel_TextoRespuesta);
        jLabel_TextoRespuesta.setBounds(360, 490, 230, 40);

        jLabel_NombreExperto.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel_NombreExperto.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_NombreExperto.setText("Nombre");
        jPanel_PreguntasExperto.add(jLabel_NombreExperto);
        jLabel_NombreExperto.setBounds(10, 20, 990, 50);

        jButton_ExpertoAceptar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton_ExpertoAceptar.setText("Aceptar");
        jButton_ExpertoAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExpertoAceptarActionPerformed(evt);
            }
        });
        jPanel_PreguntasExperto.add(jButton_ExpertoAceptar);
        jButton_ExpertoAceptar.setBounds(560, 540, 130, 50);

        PCExperto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\PCExperto.png")); // NOI18N
        jPanel_PreguntasExperto.add(PCExperto);
        PCExperto.setBounds(400, 140, 230, 230);

        jLabel_FondoExperto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Adrian\\Documents\\Trabajos\\Programación Orientada a Objetos Lab\\ProyectoChido\\ProyectoQuiz\\src\\main\\java\\Recursos\\FondoExperto.jpg")); // NOI18N
        jLabel_FondoExperto.setText("F");
        jPanel_PreguntasExperto.add(jLabel_FondoExperto);
        jLabel_FondoExperto.setBounds(0, 130, 1030, 590);

        FondoBlancoExperto.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_PreguntasExperto.add(FondoBlancoExperto);
        FondoBlancoExperto.setBounds(0, 0, 1030, 130);

        getContentPane().add(jPanel_PreguntasExperto);
        jPanel_PreguntasExperto.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_JugarActionPerformed
        JPanel_Menu.hide();
        JPanel_Dificultad.show();
    }//GEN-LAST:event_Boton_JugarActionPerformed

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jButton_ExpertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExpertoActionPerformed
        flag = 4;
        jPanel_PreguntasExperto.show();
        JPanel_Dificultad.hide();
        jButton_VolverExperto.hide();
        jLabel_NombreExperto.setText(EnemigoExperto.getNombre() + " - HP:" + EnemigoExperto.getVida());
        x = 0;
        y = 0;
        index = 0;
        nextQuestion();
        
        
        //Puntuaciones
        J.Puntuacion[Persona][0]=jTextField_Nombre.getText();
        J.Puntuacion[Persona][1]="Experto";
        
    }//GEN-LAST:event_jButton_ExpertoActionPerformed

    private void jButton_VolverDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverDificultadActionPerformed
        JPanel_Menu.show();
        JPanel_Dificultad.hide();
    }//GEN-LAST:event_jButton_VolverDificultadActionPerformed

    private void jButton_PrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrincipianteActionPerformed
        flag = 1;
        jPanel_PreguntasPrincipiante.show();
        JPanel_Dificultad.hide();
        jButton_VolverPrincipiante.hide();
        jLabel_NombrePrincipiante.setText(EnemigoPrincipiante.getNombre()+ " - HP:" + EnemigoPrincipiante.getVida());
        x = 0;
        y = 0;
        index = 0;
        PreguntasPrincipiante();
        nextQuestion();
        
        
        //Puntuaciones
        J.Puntuacion[Persona][0]=jTextField_Nombre.getText();
        J.Puntuacion[Persona][1]="Principiante";
        
    }//GEN-LAST:event_jButton_PrincipianteActionPerformed

    private void jButton_EstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EstandarActionPerformed
        flag = 2;
        jPanel_PreguntasEstandar.show();
        JPanel_Dificultad.hide(); 
        jButton_VolverEstandar.hide();
        jLabel_NombreEstandar.setText(EnemigoEstandar.getNombre() + " - HP:" + EnemigoEstandar.getVida());
        x = 0;
        y = 0;
        index = 0;
        PreguntasEstandar();
        nextQuestion();
        
        
        //Puntuaciones
        J.Puntuacion[Persona][0]=jTextField_Nombre.getText();
        J.Puntuacion[Persona][1]="Estándar";
    }//GEN-LAST:event_jButton_EstandarActionPerformed

    private void jButton_DificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DificilActionPerformed
        flag = 3;
        jPanel_PreguntasDificil.show();
        JPanel_Dificultad.hide(); 
        jButton_VolverDificil.hide();
        jLabel_NombreDificil.setText(EnemigoDificil.getNombre() + " - HP:" + EnemigoDificil.getVida());
        x = 0;
        y = 0;
        index = 0;
        PreguntasDificiles();
        nextQuestion();
        
        //Puntuaciones
        J.Puntuacion[Persona][0]=jTextField_Nombre.getText();
        J.Puntuacion[Persona][1]="Difícil";
        
    }//GEN-LAST:event_jButton_DificilActionPerformed

    private void jButton_PrincipianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PrincipianteMouseEntered

    }//GEN-LAST:event_jButton_PrincipianteMouseEntered

    private void jButton_PrincipianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PrincipianteMouseExited

    }//GEN-LAST:event_jButton_PrincipianteMouseExited

    private void jButton_VolverPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverPrincipianteActionPerformed
        jPanel_PreguntasPrincipiante.hide();
        JPanel_Dificultad.hide();
        JPanel_Menu.show();
       
        
        //Puntuaciones
        J.Puntuacion[Persona][2]=String.valueOf(respuestasCorrectas);
        Persona++;

        //RESET DE PUNTOS Y VIDA
        index = 0;
        respuestasCorrectas = 0;
        EnemigoPrincipiante.setVida(100);
        jProgressBar_VidaPrincipiante.setValue(EnemigoPrincipiante.vida);
        flagPrincipiante=1;
        
        

        
    }//GEN-LAST:event_jButton_VolverPrincipianteActionPerformed

    private void jButton_VolverEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverEstandarActionPerformed
        jPanel_PreguntasEstandar.hide();
        JPanel_Dificultad.hide();
        JPanel_Menu.show();
        
        
        //Puntuaciones
        J.Puntuacion[Persona][2]=String.valueOf(respuestasCorrectas);
        Persona++;
        
        
        //RESET DE PUNTOS Y VIDA
        index = 0;
        respuestasCorrectas = 0;
        EnemigoEstandar.setVida(100);
        jProgressBar_VidaEstandar.setValue(EnemigoPrincipiante.vida);
        flagEstandar=1;
    }//GEN-LAST:event_jButton_VolverEstandarActionPerformed

    private void jButton_VolverDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverDificilActionPerformed
        jPanel_PreguntasDificil.hide();
        JPanel_Dificultad.hide();
        JPanel_Menu.show();
        
        //Puntuaciones
        J.Puntuacion[Persona][2]=String.valueOf(respuestasCorrectas);
        Persona++;
        
        //RESET DE PUNTOS Y VIDA
        index = 0;
        respuestasCorrectas = 0;
        EnemigoDificil.setVida(100);
        jProgressBar_VidaDificil.setValue(EnemigoDificil.vida);
        flagDificil=1;
    }//GEN-LAST:event_jButton_VolverDificilActionPerformed

    private void jButton_VolverExpertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverExpertoActionPerformed
        jPanel_PreguntasExperto.hide();
        JPanel_Dificultad.hide();
        JPanel_Menu.show();
        
        
        //Puntuaciones
        J.Puntuacion[Persona][2]=String.valueOf(respuestasCorrectas);
        Persona++;
        
        //RESET DE PUNTOS Y PUNTOS
        index = 0;
        respuestasCorrectas = 0;
        EnemigoExperto.setVida(100);
        jProgressBar_VidaExperto.setValue(EnemigoExperto.vida);
        flagExperto=1;
        flagExperto2=0;
        
        jLabel_TextoRespuesta.show();
        jTextField_ExpertoRespuesta.show();
        jButton_ExpertoAceptar.show();
        
        

    }//GEN-LAST:event_jButton_VolverExpertoActionPerformed

    private void jButton_OpcionEstandar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionEstandar2ActionPerformed
        jButton_OpcionEstandar1.setEnabled(false);
	jButton_OpcionEstandar2.setEnabled(false);
	jButton_OpcionEstandar3.setEnabled(false);
	jButton_OpcionEstandar4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionEstandar2){
            correcta= 'B';
        	if(correcta == P.respuestas2[index]){
        		respuestasCorrectas++;
                        EnemigoEstandar.setVida(EnemigoEstandar.getVida()-25);
                        jProgressBar_VidaEstandar.setValue(EnemigoEstandar.vida);
                        jLabel_NombreEstandar.setText(EnemigoEstandar.getNombre() + " - HP:" + EnemigoEstandar.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionEstandar2ActionPerformed

    private void jButton_OpcionPrincipiante3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionPrincipiante3ActionPerformed
        jButton_OpcionPrincipiante1.setEnabled(false);
	jButton_OpcionPrincipiante2.setEnabled(false);
	jButton_OpcionPrincipiante3.setEnabled(false);
	jButton_OpcionPrincipiante4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionPrincipiante3){
            correcta= 'C';
        	if(correcta == P.respuestas1[index]){
        		respuestasCorrectas++;
                        EnemigoPrincipiante.setVida(EnemigoPrincipiante.getVida()-25);
                        jProgressBar_VidaPrincipiante.setValue(EnemigoPrincipiante.vida);
                        jLabel_NombrePrincipiante.setText(EnemigoPrincipiante.getNombre() + " - HP:" + EnemigoPrincipiante.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionPrincipiante3ActionPerformed

    private void jButton_OpcionDificil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionDificil1ActionPerformed
        jButton_OpcionDificil1.setEnabled(false);
	jButton_OpcionDificil2.setEnabled(false);
	jButton_OpcionDificil3.setEnabled(false);
	jButton_OpcionDificil4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionDificil1){
            correcta= 'A';
        	if(correcta == P.respuestas3[index]){
        		respuestasCorrectas++;
                        EnemigoDificil.setVida(EnemigoDificil.getVida()-25);
                        jProgressBar_VidaDificil.setValue(EnemigoDificil.vida);
                        jLabel_NombreDificil.setText(EnemigoDificil.getNombre() + " - HP:" + EnemigoDificil.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionDificil1ActionPerformed

    private void jButton_EstandarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EstandarMouseEntered

        
    }//GEN-LAST:event_jButton_EstandarMouseEntered

    private void jButton_EstandarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EstandarMouseExited

    }//GEN-LAST:event_jButton_EstandarMouseExited

    private void jButton_DificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DificilMouseEntered

    }//GEN-LAST:event_jButton_DificilMouseEntered

    private void jButton_DificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DificilMouseExited

    }//GEN-LAST:event_jButton_DificilMouseExited

    private void jButton_ExpertoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExpertoMouseEntered

    }//GEN-LAST:event_jButton_ExpertoMouseEntered

    private void jButton_ExpertoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ExpertoMouseExited

    }//GEN-LAST:event_jButton_ExpertoMouseExited

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_OpcionPrincipiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionPrincipiante1ActionPerformed
        jButton_OpcionPrincipiante1.setEnabled(false);
	jButton_OpcionPrincipiante2.setEnabled(false);
	jButton_OpcionPrincipiante3.setEnabled(false);
	jButton_OpcionPrincipiante4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionPrincipiante1){
            correcta= 'A';
        	if(correcta == P.respuestas1[index]){
        		respuestasCorrectas++;
                        EnemigoPrincipiante.setVida(EnemigoPrincipiante.getVida()-25);
                        jProgressBar_VidaPrincipiante.setValue(EnemigoPrincipiante.vida);
                        jLabel_NombrePrincipiante.setText(EnemigoPrincipiante.getNombre() + " - HP:" + EnemigoPrincipiante.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionPrincipiante1ActionPerformed

    private void jButton_OpcionPrincipiante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionPrincipiante2ActionPerformed
        jButton_OpcionPrincipiante1.setEnabled(false);
	jButton_OpcionPrincipiante2.setEnabled(false);
	jButton_OpcionPrincipiante3.setEnabled(false);
	jButton_OpcionPrincipiante4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionPrincipiante2){
            correcta= 'B';
        	if(correcta == P.respuestas1[index]){
        		respuestasCorrectas++;
                        EnemigoPrincipiante.setVida(EnemigoPrincipiante.getVida()-25);
                        jProgressBar_VidaPrincipiante.setValue(EnemigoPrincipiante.vida);
                        jLabel_NombrePrincipiante.setText(EnemigoPrincipiante.getNombre() + " - HP:" + EnemigoPrincipiante.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionPrincipiante2ActionPerformed

    private void jButton_OpcionPrincipiante4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionPrincipiante4ActionPerformed
        jButton_OpcionPrincipiante1.setEnabled(false);
	jButton_OpcionPrincipiante2.setEnabled(false);
	jButton_OpcionPrincipiante3.setEnabled(false);
	jButton_OpcionPrincipiante4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionPrincipiante4){
            correcta= 'D';
        	if(correcta == P.respuestas1[index]){
        		respuestasCorrectas++;
                        EnemigoPrincipiante.setVida(EnemigoPrincipiante.getVida()-25);
                        jProgressBar_VidaPrincipiante.setValue(EnemigoPrincipiante.vida);
                        jLabel_NombrePrincipiante.setText(EnemigoPrincipiante.getNombre() + " - HP:" + EnemigoPrincipiante.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionPrincipiante4ActionPerformed

    private void jTextField_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_NombreMouseClicked
        if (jTextField_Nombre.getText().equals("Usuario"))
            jTextField_Nombre.setText("");

    }//GEN-LAST:event_jTextField_NombreMouseClicked

    private void jButton_OpcionEstandar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionEstandar1ActionPerformed
        jButton_OpcionEstandar1.setEnabled(false);
	jButton_OpcionEstandar2.setEnabled(false);
	jButton_OpcionEstandar3.setEnabled(false);
	jButton_OpcionEstandar4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionEstandar1){
            correcta= 'A';
        	if(correcta == P.respuestas2[index]){
        		respuestasCorrectas++;
                        EnemigoEstandar.setVida(EnemigoEstandar.getVida()-25);
                        jProgressBar_VidaEstandar.setValue(EnemigoEstandar.vida);
                        jLabel_NombreEstandar.setText(EnemigoEstandar.getNombre() + " - HP:" + EnemigoEstandar.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionEstandar1ActionPerformed

    private void jButton_OpcionEstandar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionEstandar3ActionPerformed
        jButton_OpcionEstandar1.setEnabled(false);
	jButton_OpcionEstandar2.setEnabled(false);
	jButton_OpcionEstandar3.setEnabled(false);
	jButton_OpcionEstandar4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionEstandar3){
            correcta= 'C';
        	if(correcta == P.respuestas2[index]){
        		respuestasCorrectas++;
                        EnemigoEstandar.setVida(EnemigoEstandar.getVida()-25);
                        jProgressBar_VidaEstandar.setValue(EnemigoEstandar.vida);
                        jLabel_NombreEstandar.setText(EnemigoEstandar.getNombre() + " - HP:" + EnemigoEstandar.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionEstandar3ActionPerformed

    private void jButton_OpcionEstandar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionEstandar4ActionPerformed
        jButton_OpcionEstandar1.setEnabled(false);
	jButton_OpcionEstandar2.setEnabled(false);
	jButton_OpcionEstandar3.setEnabled(false);
	jButton_OpcionEstandar4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionEstandar4){
            correcta= 'D';
        	if(correcta == P.respuestas2[index]){
        		respuestasCorrectas++;
                        EnemigoEstandar.setVida(EnemigoEstandar.getVida()-25);
                        jProgressBar_VidaEstandar.setValue(EnemigoEstandar.vida);
                        jLabel_NombreEstandar.setText(EnemigoEstandar.getNombre() + " - HP:" + EnemigoEstandar.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionEstandar4ActionPerformed

    private void jButton_OpcionDificil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionDificil2ActionPerformed
        jButton_OpcionDificil1.setEnabled(false);
	jButton_OpcionDificil2.setEnabled(false);
	jButton_OpcionDificil3.setEnabled(false);
	jButton_OpcionDificil4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionDificil2){
            correcta= 'B';
        	if(correcta == P.respuestas3[index]){
        		respuestasCorrectas++;
                        EnemigoDificil.setVida(EnemigoDificil.getVida()-25);
                        jProgressBar_VidaDificil.setValue(EnemigoDificil.vida);
                        jLabel_NombreDificil.setText(EnemigoDificil.getNombre() + " - HP:" + EnemigoDificil.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionDificil2ActionPerformed

    private void jButton_OpcionDificil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionDificil3ActionPerformed
        jButton_OpcionDificil1.setEnabled(false);
	jButton_OpcionDificil2.setEnabled(false);
	jButton_OpcionDificil3.setEnabled(false);
	jButton_OpcionDificil4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionDificil3){
            correcta= 'C';
        	if(correcta == P.respuestas3[index]){
        		respuestasCorrectas++;
                        EnemigoDificil.setVida(EnemigoDificil.getVida()-25);
                        jProgressBar_VidaDificil.setValue(EnemigoDificil.vida);
                        jLabel_NombreDificil.setText(EnemigoDificil.getNombre() + " - HP:" + EnemigoDificil.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionDificil3ActionPerformed

    private void jButton_OpcionDificil4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpcionDificil4ActionPerformed
        jButton_OpcionDificil1.setEnabled(false);
	jButton_OpcionDificil2.setEnabled(false);
	jButton_OpcionDificil3.setEnabled(false);
	jButton_OpcionDificil4.setEnabled(false);

	if(evt.getSource()==jButton_OpcionDificil4){
            correcta= 'D';
        	if(correcta == P.respuestas3[index]){
        		respuestasCorrectas++;
                        EnemigoDificil.setVida(EnemigoDificil.getVida()-25);
                        jProgressBar_VidaDificil.setValue(EnemigoDificil.vida);
                        jLabel_NombreDificil.setText(EnemigoDificil.getNombre() + " - HP:" + EnemigoDificil.getVida());
		}
	}
        displayAnswer();
    }//GEN-LAST:event_jButton_OpcionDificil4ActionPerformed

    private void jButton_ExpertoAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExpertoAceptarActionPerformed
	
        jButton_ExpertoAceptar.setEnabled(false);
        RespuestaExperto = jTextField_ExpertoRespuesta.getText().toLowerCase();
            
        if(P.RespuestaExperto[index][0].equals(RespuestaExperto) || P.RespuestaExperto[index][1].equals(RespuestaExperto) 
                    || P.RespuestaExperto[index][2].equals(RespuestaExperto) || P.RespuestaExperto[index][3].equals(RespuestaExperto)){
         
            respuestasCorrectas++;
            EnemigoExperto.setVida(EnemigoExperto.getVida()-25);
            jProgressBar_VidaExperto.setValue(EnemigoExperto.vida);
            jLabel_NombreExperto.setText(EnemigoExperto.getNombre() + " - HP:" + EnemigoExperto.getVida());
	}
        y++;
        displayAnswer();
        jTextField_ExpertoRespuesta.setText("");
        
    }//GEN-LAST:event_jButton_ExpertoAceptarActionPerformed

    private void jButton_PuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PuntuacionActionPerformed
        jPanel_Puntuacion.show();
        JPanel_Menu.hide();
        
        J.OrdenarPuntuaciones();
        
        jLabel_Nombre1.setText(J.Puntuacion2[0][0]);
        jLabel_Nombre2.setText(J.Puntuacion2[1][0]);
        jLabel_Nombre3.setText(J.Puntuacion2[2][0]);
        jLabel_Nombre4.setText(J.Puntuacion2[3][0]);
        jLabel_Nombre5.setText(J.Puntuacion2[4][0]);
        jLabel_Nombre6.setText(J.Puntuacion2[5][0]);
        
        jLabel_Dificultad1.setText(J.Puntuacion2[0][1]);
        jLabel_Dificultad2.setText(J.Puntuacion2[1][1]);
        jLabel_Dificultad3.setText(J.Puntuacion2[2][1]);
        jLabel_Dificultad4.setText(J.Puntuacion2[3][1]);
        jLabel_Dificultad5.setText(J.Puntuacion2[4][1]);
        jLabel_Dificultad6.setText(J.Puntuacion2[5][1]);
        
        jLabel_Puntos1.setText(J.Puntuacion2[0][2]);
        jLabel_Puntos2.setText(J.Puntuacion2[1][2]);
        jLabel_Puntos3.setText(J.Puntuacion2[2][2]);
        jLabel_Puntos4.setText(J.Puntuacion2[3][2]);
        jLabel_Puntos5.setText(J.Puntuacion2[4][2]);
        jLabel_Puntos6.setText(J.Puntuacion2[5][2]);
    }//GEN-LAST:event_jButton_PuntuacionActionPerformed

    private void jButton_VolverPuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverPuntuacionActionPerformed
        jPanel_Puntuacion.hide();
        JPanel_Menu.show();
    }//GEN-LAST:event_jButton_VolverPuntuacionActionPerformed

        
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Jugar;
    private javax.swing.JPanel FondoBlancoDificil;
    private javax.swing.JPanel FondoBlancoEstandar;
    private javax.swing.JPanel FondoBlancoExperto;
    private javax.swing.JLabel FondoPrincipiante;
    private javax.swing.JPanel JPanel_Dificultad;
    private javax.swing.JPanel JPanel_Menu;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JLabel PCDificil;
    private javax.swing.JLabel PCExperto;
    private javax.swing.JLabel PCPrincipiante;
    private javax.swing.JLabel PCestandar;
    private javax.swing.JButton jButton_Dificil;
    private javax.swing.JButton jButton_Estandar;
    private javax.swing.JButton jButton_Experto;
    private javax.swing.JButton jButton_ExpertoAceptar;
    private javax.swing.JButton jButton_OpcionDificil1;
    private javax.swing.JButton jButton_OpcionDificil2;
    private javax.swing.JButton jButton_OpcionDificil3;
    private javax.swing.JButton jButton_OpcionDificil4;
    private javax.swing.JButton jButton_OpcionEstandar1;
    private javax.swing.JButton jButton_OpcionEstandar2;
    private javax.swing.JButton jButton_OpcionEstandar3;
    private javax.swing.JButton jButton_OpcionEstandar4;
    private javax.swing.JButton jButton_OpcionPrincipiante1;
    private javax.swing.JButton jButton_OpcionPrincipiante2;
    private javax.swing.JButton jButton_OpcionPrincipiante3;
    private javax.swing.JButton jButton_OpcionPrincipiante4;
    private javax.swing.JButton jButton_Principiante;
    private javax.swing.JButton jButton_Puntuacion;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_VolverDificil;
    private javax.swing.JButton jButton_VolverDificultad;
    private javax.swing.JButton jButton_VolverEstandar;
    private javax.swing.JButton jButton_VolverExperto;
    private javax.swing.JButton jButton_VolverPrincipiante;
    private javax.swing.JButton jButton_VolverPuntuacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Dificultad;
    private javax.swing.JLabel jLabel_Dificultad1;
    private javax.swing.JLabel jLabel_Dificultad2;
    private javax.swing.JLabel jLabel_Dificultad3;
    private javax.swing.JLabel jLabel_Dificultad4;
    private javax.swing.JLabel jLabel_Dificultad5;
    private javax.swing.JLabel jLabel_Dificultad6;
    private javax.swing.JLabel jLabel_Dificultades;
    private javax.swing.JLabel jLabel_FondoDificil;
    private javax.swing.JLabel jLabel_FondoEstandar;
    private javax.swing.JLabel jLabel_FondoExperto;
    private javax.swing.JLabel jLabel_FondoPuntuacion;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JLabel jLabel_NombreDificil;
    private javax.swing.JLabel jLabel_NombreEstandar;
    private javax.swing.JLabel jLabel_NombreExperto;
    private javax.swing.JLabel jLabel_NombrePrincipiante;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_Posicion;
    private javax.swing.JLabel jLabel_Posicion1;
    private javax.swing.JLabel jLabel_Posicion2;
    private javax.swing.JLabel jLabel_Posicion3;
    private javax.swing.JLabel jLabel_Posicion4;
    private javax.swing.JLabel jLabel_Posicion5;
    private javax.swing.JLabel jLabel_Posicion6;
    private javax.swing.JLabel jLabel_Puntos1;
    private javax.swing.JLabel jLabel_Puntos2;
    private javax.swing.JLabel jLabel_Puntos3;
    private javax.swing.JLabel jLabel_Puntos4;
    private javax.swing.JLabel jLabel_Puntos5;
    private javax.swing.JLabel jLabel_Puntos6;
    private javax.swing.JLabel jLabel_Puntuacion;
    private javax.swing.JLabel jLabel_Puntuaciones;
    private javax.swing.JLabel jLabel_TextoRespuesta;
    private javax.swing.JLabel jLabel_TituloDificultad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_PreguntasDificil;
    private javax.swing.JPanel jPanel_PreguntasEstandar;
    private javax.swing.JPanel jPanel_PreguntasExperto;
    private javax.swing.JPanel jPanel_PreguntasPrincipiante;
    private javax.swing.JPanel jPanel_Puntuacion;
    private javax.swing.JProgressBar jProgressBar_VidaDificil;
    private javax.swing.JProgressBar jProgressBar_VidaEstandar;
    private javax.swing.JProgressBar jProgressBar_VidaExperto;
    private javax.swing.JProgressBar jProgressBar_VidaPrincipiante;
    private javax.swing.JScrollPane jScrollPane_PreguntaDificil;
    private javax.swing.JScrollPane jScrollPane_PreguntaEstandar;
    private javax.swing.JScrollPane jScrollPane_PreguntaExperto;
    private javax.swing.JScrollPane jScrollPane_PreguntaPrincipiante;
    private javax.swing.JTextField jTextField_ExpertoRespuesta;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextPane jTextPane_PreguntaDificil;
    private javax.swing.JTextPane jTextPane_PreguntaEstandar;
    private javax.swing.JTextPane jTextPane_PreguntaExperto;
    private javax.swing.JTextPane jTextPane_PreguntaPrincipiante;
    // End of variables declaration//GEN-END:variables
}
