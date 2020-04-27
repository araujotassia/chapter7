/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Tassia Camoes Araujo &lt;araujot@vanier.college&gt;
 */
public class Chapter7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student tassia = new Student("Tassia Camoes Araujo");
        Student john = new Student("John Davis",-10);
        
        System.out.println("First student created: " + tassia.getName());
        System.out.println("Age of first " + tassia.getAge());
        tassia.setAge(40);
        
        System.out.println("Age of tassia " + tassia.getAge());

        System.out.println("Second student created: " + john.getName());
        System.out.println("Age of second " + john.getAge());
        
        tassia.printAge();
        
        System.out.println("Print first: " + tassia);
        System.out.println("Print second: " + john);
        System.out.println("Print first: " + tassia);
        
        System.out.println("Are tassia and John equal?" + tassia.equals(john));
        tassia.setId("100");
        System.out.println("Are tassia and John equal?" + tassia.equals(john));
        

    }    
    
}
