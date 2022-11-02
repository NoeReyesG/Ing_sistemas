/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package athleticraceinterface;

/**
 *
 * @author Noe
 */
//import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;

/*Pondremos Cada punto Solicitado*/

//•Diseño de la interfaz gráfica 
//a)Crea una clase que se llame AthleticRaceInterface y agrega los elementos gráficos correspondientes. 
public class AthleticRaceInterface extends JFrame{

    /**
     * @param args the command line argument
     */
    
    
    //En la clase AthleticRaceInterface debes definir un arreglo del tipo Runner con cinco elementos;
    //de esta manera, el sistema aceptará cinco corredores como máximo. 
    Runner[] corredores = new Runner[5];
    //Creamos también un contador para manipular el arreglo
    int contador = 0;
    
    
    //La ventana consta de tres secciones. 
    //La número 1: un campo de texto y un botón para registrar a los corredores en el sistema.
    JLabel registrarL = new JLabel("Registrar corredor");
    JTextField registrarTF = new JTextField();
    JButton registrarB = new JButton("Registrar");
        
    
    //La número 2: es un JTextArea que muestra los participantes registrados hasta el momento.
    JLabel registradosL = new JLabel("Corredores registrados");
    JTextArea registradosTA = new JTextArea();
    
    //La número 3: consta de cuatro elementos gráficos.
    //Un JTextArea que muestra el orden en que los competidores llegan a la meta.
    //Tres botones para iniciar la carrera, reiniciar la carrera y terminar la ejecución del programa

    JLabel resultadosL = new JLabel("Resultados");
    JTextArea resultadosTA = new JTextArea();
    JButton resultadosI = new JButton("Iniciar");
    JButton resultadosR = new JButton("Reiniciar");
    JButton resultadosT = new JButton("Terminar");
    
    
    
    public AthleticRaceInterface(){
      //Creamos la ventana que necesitaremos
      setTitle("Carrera Atlética");
      setSize(610, 600);
      setLayout(null);
      setLocationRelativeTo(null);
      
      //Definimos la posicion de los elementos de la seccion 1
      registrarL.setBounds(40,10,200,30);
      registrarTF.setBounds(40,50,300,40);
      registrarB.setBounds(360,50,200,40);
    
      //Definimos la posicion de los elementos de la seccion 2
      registradosL.setBounds(40,100,200,40);
      registradosTA.setBounds(40,150, 520, 150);
      
      //Definimos la posicion de los elementos de la seccion 3
      resultadosL.setBounds(40, 320, 200, 30);
      resultadosTA.setBounds(40,360,380,150);
      resultadosI.setBounds(440,360,120,40);
      resultadosR.setBounds(440,415, 120,40);
      resultadosT.setBounds(440,470,120,40);
      
      //Agregamos la sección uno a nuestra ventana
      getContentPane().add(registrarL);
      getContentPane().add(registrarB);
      getContentPane().add(registrarTF);
      
      //Agregamos la seccion 2 a nuestra ventana
      getContentPane().add(registradosL);
      getContentPane().add(registradosTA);
      
      //Agregamos la seccion 3 a nuestra ventana
      getContentPane().add(resultadosL);
      getContentPane().add(resultadosTA);
      getContentPane().add(resultadosI);
      getContentPane().add(resultadosR);
      getContentPane().add(resultadosT);
      
      
    //Cuando el usuario presione el botón Registrar... 
           
    registrarB.addActionListener(new ActionListener(){
              
        @Override
        public void actionPerformed(ActionEvent e){
            
            System.out.println(contador);
            //...el programa debe validar que el nombre del corredor no está vacío...
            if(registrarTF.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Registra el nombre del corredor en el campo de texto");
            }
            //...y que no excede el tamaño del arreglo
            else if (contador < 5){
                corredores[contador] = new Runner();
                corredores[contador].setName(registrarTF.getText());
                JOptionPane.showMessageDialog(null, "Corredor " + corredores[contador].getName() +" resgistrado.");
                //Cuando se registre un usuario correctamente, 
                //éste debe aparecer listado en el JTextArea perteneciente a la sección 2 de la ventana (corredores registrados).
                registradosTA.append((contador+1) + " - "+ corredores[contador].getName() + "\n"); 
                contador++;
                registrarTF.setText("");
            }
            else{
                //(agrega los mensajes correspondientes para que el usuario conozca lo que sucede
                //internamente en el sistema. Puedes usar la clase JOptionPane)
                registrarTF.setText("");
                JOptionPane.showMessageDialog(null, "Ha alcanzado el número máximo de corredores");
            }
        }
    });
    
    
      
    
    resultadosI.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           //Con el botón Iniciar y para comenzar la carrera, se debe validar que los cinco corredores están registrados.
           if (corredores[4] == null){
               JOptionPane.showMessageDialog(null, "Registra 5 corredores para iniciar la carrera");
           }
           else{
            
            for (int i=0; i<5; i++){   
            ThreadRunner runner = new ThreadRunner(corredores[i], resultadosTA);
            runner.start();
            }
            JOptionPane.showMessageDialog(null, "La carrera dura 30 seg. Mostrando resultados...");
           }
       }
    });
    
    
    //El botón Reiniciar debe limpiar todos los valores de las variables en la clase, así como los datos de lo JTextArea
    resultadosR.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           //Reinicializamos nuestro contador auxiliar
           contador = 0;
           //reinicializamos nuestra variable global que muestra el lugar de los resultados.
           posiciones.posicion = 1;
           //Limpiamos nuestras TextAreas
           registradosTA.setText("");
           resultadosTA.setText("");
           registrarTF.setText("");
           //Vaciamos nuestro arreglo
           for(int j=0; j<5; j++){
               corredores[j]=null;
           }
       }
    });
    
    //Finalmente, el botón Terminar debe cerrar el programa.
    resultadosT.addActionListener(new ActionListener(){
              
        @Override
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }    
        
    });
    
    
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
    
    }                  
    public static void main(String[] args) {
        // TODO code application logic here
        //Usamos una librería de las manejadas en la unidad 2 para estilizar la interfaz
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarculaLaf");   
        } 
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        //Realizamos la instancia de la clase
        AthleticRaceInterface Carrera = new AthleticRaceInterface();
        
    }
    
}
