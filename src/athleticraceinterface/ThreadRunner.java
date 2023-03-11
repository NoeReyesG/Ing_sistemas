/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package athleticraceinterface;

/**
 *
 * @author Noe
 */

//Crea una clase que se llame ThreadRunner, que se puede extender desde la clase Thread o implementar la interfaz Runnable; 
import javax.swing.JTextArea;
public class ThreadRunner extends Thread {
        
    Runner runner = new Runner(); 
    JTextArea resultados = new JTextArea();
   
    /*El constructor de esta clase debe recibir el nombre del corredor y el JTextArea,
    es decir, una instancia de la clase Runner y la instancia del elemento gráfico JTextArea; esto es para agregar al corredor
    cuando el hilo se haya completado */
    ThreadRunner(Runner runner, JTextArea resultados ){
        this.runner = runner;
        this.resultados = resultados;
    }
    
    /*(en el método run() usa el método sleep que provee la clase Thread; éste debe recibir 
    como argumento el valor del atributo speed del corredor actual, valor que debes multiplicar por 1000 para convertirlo a milisegundos).*/
    @Override
    public void run(){
        try {
            Thread.sleep(runner.getSpeed()*1000);
        } catch (InterruptedException ex) {
        }
        //Aquí usé un truco un tanto raro, creé una clase que solo tiene la variable 'posición' para tener una variable 
        //que se pueda manipular desde todas la clases y asi irla incrementando y que conserve el valor incrementado
        //mostrando así la posición en que aparecen los corredores. La única otra forma que se me ocurrió de mostrar el número de posición del corredor
        //fue ordenar el arreglo de los corredores por la variable speed y pasar su posicion en el arreglo como parámetro a
        //la clase Thread Runner, pero a parte de que sería más complicado, sería algo asi como saber por adelantado qué pasará, así que opté
        //por esta opción, aunque seguro hay una forma más óptima de hacerlo
        resultados.append(posiciones.posicion+" - "+ runner.getName()+" - Tiempo: " + runner.getSpeed()+ " segundos"+"\n");
        posiciones.posicion++;
    }
    
}

class posiciones{
  static int posicion=1; 
}