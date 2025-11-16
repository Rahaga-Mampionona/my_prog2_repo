package com.HistoryGrade;

public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher enseignant;

    public Course(int id, String label, int credits, Teacher enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public int getId() { return id; }
    public String getLabel() { return label; }
    public int getCredits() { return credits; }
    public Teacher getEnseignant() { return enseignant; }
}

