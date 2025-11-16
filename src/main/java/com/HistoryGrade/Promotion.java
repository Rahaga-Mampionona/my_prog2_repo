package com.HistoryGrade;

import java.util.Set;

public class Promotion {
    private String nom;
    private Set<String> groupes;

    public Promotion(String nom, Set<String> groupes) {
        this.nom = nom;
        this.groupes = groupes;
    }

    public String getNom() {
        return nom;
    }

    public Set<String> getGroupes() {
        return groupes;
    }
}
