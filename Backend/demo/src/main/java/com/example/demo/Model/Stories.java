package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int story_id;
}