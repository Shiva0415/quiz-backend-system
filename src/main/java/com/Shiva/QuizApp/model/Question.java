package com.Shiva.QuizApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// This class called  Component or Entity
@Entity // This class represents a table in the database
@Data // Getter/ Setter/ Constructor
public class Question {

    @Id //“This field is the PRIMARY KEY”
    @GeneratedValue(strategy = GenerationType.IDENTITY) //“Database will automatically generate ID” -> for inserting in serial like1, 2, 3
    private int id;

    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String difficulty;
    private String category;
}