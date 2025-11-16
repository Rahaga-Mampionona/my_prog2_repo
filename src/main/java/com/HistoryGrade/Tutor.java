package com.HistoryGrade;

import java.time.LocalDate;

public class Tutor extends Person{
    private String relation;

    public Tutor(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, String relation) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }
}
