/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public abstract class Student implements Entertainable {

    @Override
    public void sing() {
     
        System.out.println("Show me your money !");
    }

    public abstract void dance();
//    @Override
//    public void dance() {
//    
//        System.out.println("Gangnam Style");
//        System.out.println(Entertainable.PRINCIPLE);
//    }
    
}
