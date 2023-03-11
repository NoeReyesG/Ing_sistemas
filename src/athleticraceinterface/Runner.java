/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package athleticraceinterface;

/**
 *
 * @author Noe
 */
//Crea una clase encapsulada que se llame Runner para registrar a los corredores; 
//esta clase tendrá los atributos name y speed. 
public class Runner {
    private String name;
    private int speed; 
    
    /* El atributo name corresponde al nombre del corredor y el atributo speed, 
    a un número aleatorio entre 0 y 30 (puedes usar el método random que provee la clase Math).*/
    public void setName(String name){
        this.name = name;
        speed = (int)(Math.floor(Math.random()*30+1));
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getSpeed(){
        return this.speed;
    }
}
