/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

/**
 *
 * @author MSI
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        Student s1 = new Student();
        s1.setName("Swapon Saha");
        String n1 = s1.getName();
        System.out.print(n1 + "\n");
        System.out.print("---------------- \n");
        System.out.print("---------------- \n");
        // university Student Call
        University student = new University();
        student.studetInfo("City University", 1100114889, true, "01718853209");
        System.out.print(student.student());
    }
    
}
