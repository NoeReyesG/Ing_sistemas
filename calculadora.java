/*Nota inicial: Hubo varias cosas que investigar que no venían en el material del curso hasta el momento
 * y que no se han visto en las materias previas de programación, si me permiten el comentario, es un poco densa la actividad
 * para ser la primera actividad de la materia.
 * 
 * La calculadora solo realiza una operación a la vez, y aunque puede seguir operando con el resultado, si no se presiona
 * la tecla de igual después de cada operación, el resultado no será el deseado. 
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculadora extends JFrame implements MouseListener{

    //Declaramos las variables en esta parte para que estén disponibles al sobreescribir los métodos dde MouseListener
    //La variable operación guarda un código con el cual identificamos que operación se debe realizar.
    int operacion = 0;
    //una variable para guardar el resultado y dos variables auxiliares para guardar el valor x que se operará con el valor y
    float resultado, x=0, y=0;


    //Creamos de forma global el textField dónde mostraremos el resultado
    JTextField panel = new JTextField("0");

    //Intenté crear los botones de forma iterativa, pero algo en la sintaxis no quedaba, al final lo "hardcodié", como dicen. 
    /*for (int j=0; j< 10; j++){
        JButton boton = new JButton (Integer.toString(i));
    }*/

    //Creamos también los botones que neesitaremos. 
    JButton button1 = new JButton ("1");
    JButton button2 = new JButton ("2");
    JButton button3 = new JButton ("3");
    JButton button14 = new JButton("+");

    JButton button4 = new JButton ("4");
    JButton button5 = new JButton ("5");
    JButton button6 = new JButton ("6");
    JButton button24 = new JButton("-");

    JButton button7 = new JButton ("7");
    JButton button8 = new JButton ("8");
    JButton button9 = new JButton ("9");
    JButton button34 = new JButton("*");

    JButton buttonC = new JButton ("C");
    JButton button0 = new JButton ("0");
    JButton buttonEq = new JButton ("=");
    JButton buttonSl = new JButton("/");

   
    //Creamos el constructor de la clase
    public calculadora() {
        setTitle("Calculadora");
        setSize(380, 480);
        setLayout(null);

        //Al textField le damos una altura de 50, cómo se nos pide en la actividad
        panel.setBounds(15,15,335,50);

        //"hardcodiamos" de nuevo las posiciones y dimensiones de los botones, 80x80, cómo se solicita
        button1.setBounds(15, 80, 80, 80);
        button2.setBounds(100, 80, 80, 80);
        button3.setBounds(185, 80, 80, 80);
        button14.setBounds(270, 80, 80, 80);

        button4.setBounds(15, 165, 80, 80);
        button5.setBounds(100, 165, 80, 80);
        button6.setBounds(185, 165, 80, 80);
        button24.setBounds(270, 165, 80, 80);

        button7.setBounds(15, 250, 80, 80);
        button8.setBounds(100, 250, 80, 80);
        button9.setBounds(185, 250, 80, 80);
        button34.setBounds(270, 250, 80, 80);

        buttonC.setBounds(15, 335, 80, 80);
        button0.setBounds(100, 335, 80, 80);
        buttonEq.setBounds(185, 335, 80, 80);
        buttonSl.setBounds(270, 335, 80, 80);


        //Por último "hardcodiamos" de nuevo el agregar los botones a Mouse Listener y mandarlos al area destinada para la calculadora
        //Me hubiera ahorrado mucho tiempo encontrar la sintaxis correcta para hacerlo con ciclos, creo que ya la encontré, pero 
        //ya lo tenía de esta forma cuando lo descubrí, por lo tanto lo dejo así. 
        button1.addMouseListener(this);
        button2.addMouseListener(this);
        button3.addMouseListener(this);
        button14.addMouseListener(this);

        button4.addMouseListener(this);
        button5.addMouseListener(this);
        button6.addMouseListener(this);
        button24.addMouseListener(this);

        button7.addMouseListener(this);
        button8.addMouseListener(this);
        button9.addMouseListener(this);
        button34.addMouseListener(this);

        buttonC.addMouseListener(this);
        button0.addMouseListener(this);
        buttonEq.addMouseListener(this);
        buttonSl.addMouseListener(this);

        getContentPane().add(panel);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button14);

        getContentPane().add(button4);
        getContentPane().add(button5);
        getContentPane().add(button6);
        getContentPane().add(button24);

        getContentPane().add(button7);
        getContentPane().add(button8);
        getContentPane().add(button9);
        getContentPane().add(button34);

        getContentPane().add(buttonC);
        getContentPane().add(button0);
        getContentPane().add(buttonEq);
        getContentPane().add(buttonSl);

        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Método main
    public static void main (String[] args) {
        calculadora e = new calculadora();
    }

    //Sobreescribimos la clase, MouseListener, el que nos interesa es cuando el usuario da click en los botones
    //será el único que utilizaremos
    @Override
    public void mouseClicked(MouseEvent e){

        //¿Se puede hacer con un switch ? intenté pero me marcaba errores 
            if (e.getSource() == button1){
                /*Multiplicamos x por 10 para sumar en las unidades el dígito del botón seleccionado, en este caso el 1.
                En caso de ser la primera vez que se presiona la tecla, sólo aparecera el uno, puesto que x vale cero*/
                //Es análogo para los demás botones
                x=(x*10)+1;
                //Mostramos en el textField lo presionado
                panel.setText(Float.toString(x));
            }
        
            if (e.getSource() == button2){
                x=(x*10)+2;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button3){
                x=(x*10)+3;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button4){
                x=(x*10)+4;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button5){
                x=(x*10)+5;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button6){
                x=(x*10)+6;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button7){
                x=(x*10)+7;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button8){
                x=(x*10)+8;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button9){
                x=(x*10)+9;
                panel.setText(Float.toString(x));
            }

            if (e.getSource() == button0){
                x=(x*10);
                panel.setText(Float.toString(x));
            }

            //Si se presioná C, reinicializamos todos nuestros valores a cero
            if (e.getSource() == buttonC){
                x=0;
                y=0;
                operacion = 0;
                resultado = 0;
                panel.setText(Float.toString(x));
            }

            //codigo para la suma
            if (e.getSource() == button14){
                //almacenamos en y el primer valor a operar y reinicializamos x para que adquiera el segundo valor a operar 
                y = x;
                x = 0;
                //De forma arbitraria le asigno un valor a la variable operación para reconocer que operación es, en este caso 14 para suma
                operacion = 14;
                //En el textField mostramos el símbolo de la operación a realizar
                panel.setText("+");
            }
            // codigo para la resta, análogo a la suma
            if (e.getSource() == button24){
                y = x;
                x = 0;
                operacion = 24;
                panel.setText("-");
            }
            //Código para la multiplicación
            if (e.getSource() == button34){
                y = x;
                x = 0;
                operacion = 34;
                panel.setText("*");
            }
            //Código para la división
            if (e.getSource() == buttonSl){
                y = x;
                x = 0;
                operacion = 44;
                panel.setText("/");
            }

            //Al hacer click en el boton "=" Usando la variable "operación" identificamos de que operación se trata, 
            //y de acuerdo a esto operamos.
            
            if (e.getSource() == buttonEq){
                //checamos antes si se está tratando dde dividir por cero
                if (operacion == 44 && x == 0.0){
                        panel.setText("Error");
                }
                else{
                    switch(operacion){
                        case 14: resultado = x+y;
                        break;
                        case 24: resultado = y-x;
                        break;
                        case 34: resultado = x*y;
                        break;
                        case 44: resultado = y/x;
                        break;
                    }

                    //guardamos el resultado por si se quiere realizar alguna otra operación con él de forma continua.
                    x = resultado;
                    operacion = 0;

                    //mostramos el resultado
                    panel.setText(Float.toString(resultado));
                }
          
            }
    }

    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){      
    }
    @Override
    public void mousePressed(MouseEvent e){   
    }

}
 