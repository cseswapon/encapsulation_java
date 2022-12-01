/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;
/**
 * @author Swapon Kumar Saha
 */
public class University {
    private String uni_name;
    int stu_id;
    boolean is_student;
    String number;
    
    public void studetInfo(String name, int id, boolean student, String number){
        this.uni_name = name;
        this.stu_id = id;
        this.is_student = student;
        this.number = number;
    }
    
    public String student(){
        return  "University Name:" + " " + this.uni_name +
                "\n" + "Student ID:" + " " + this.stu_id + 
                "\n" + "IS Student:" + " " + this.is_student+
                "\n" + "Phone Number:"+" "+this.number;
    }
}
