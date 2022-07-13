/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */

abstract class Bike {

    abstract void run();

}


public class Honda4 extends Bike {
    
    
    public static void main(String[] args) {
        
       // Bike b = new Bike(); // X
       
       Bike b = new Honda4(); // OK!
       b.run();
        
    }

    @Override
    void run() {
        System.out.println("Running safely!");
    }
    
}
