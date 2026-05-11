/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jitesh.schoolbackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 *
 * @author Sonam Srivastava
 */
@Document(collection = "students")
@Data
public class Student {
@Id
    private String id;
    private String name;
    private String grade;
    private String email;
}
