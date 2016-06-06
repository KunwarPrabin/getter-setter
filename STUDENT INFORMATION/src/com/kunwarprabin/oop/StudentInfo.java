/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.oop;

import com.kunwarprabin.oop.entity.Student;

/**
 *
 * @author OWNER
 */
public class StudentInfo {
    
    public static void main(String [] args)
    {
        Student student = new Student();
        
        student.setId(1);
        student.setFirstName("Prabin");
        student.setLastName("Kunwar");
        student.setEmail("kunwar.prabin@gmail.com");
        student.setContactNo("9849716596");
        student.setStatus(true);
        
        System.out.println(student.getFullName());
        System.out.println(student.getEmail());
        System.out.println(student.getContactNo());
        System.out.println(student.isStatus());
    }
    
}
