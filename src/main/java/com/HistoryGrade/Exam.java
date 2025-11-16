package com.HistoryGrade;

import java.time.Instant;

public class Exam {
    private int id;
    private String titre;
    private Course cours;
    private Instant dateHeure;
    private int coefficient;

    public Exam(int id, String titre, Course cours, Instant dateHeure, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Course getCours() {
        return cours;
    }

    public Instant getDateHeure() {
        return dateHeure;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
