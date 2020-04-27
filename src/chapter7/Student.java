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
public class Student {
    
    private int age;
    private String name;
    private String id;
    
    public Student(){}
    
    public Student(String name){
        this.name = name;
        this.age = 30;
        this.id = "";
    }
    
    public Student(String name, int age){
        this.name = name;
        this.setAge(age);
        this.id = "";
    }
    
    public Student(String name, int age, String id){
        this.name = name;
        this.setAge(age);
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void setId(String id){
        this.id = id;
    }
    void setAge(int myAge){
        age = myAge;
        if (age<0)
            System.out.println("ATTENTION: invalid negative age");
    }
    
    public void printAge(){
        System.out.println("this student age is: " + age);
    }
    
    public String toString(){
        return("This object's name is " + this.name);
    }
    
    public boolean equals(Student other){
        return id.equals(other.id);
    }
}
