package com.HistoryGrade;

import java.time.LocalDate;

public class Teacher extends Person {
    private String specialite;

    public Teacher(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }
}
