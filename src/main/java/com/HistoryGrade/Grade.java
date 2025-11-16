package com.HistoryGrade;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student etudiant;
    private Exam examen;

    private static class GradeChange {
        double valeur;
        Instant date;
        String motif;
        public GradeChange(double valeur, Instant date, String motif) {
            this.valeur = valeur;
            this.date = date;
            this.motif = motif;
        }
    }

    private List<GradeChange> historique = new ArrayList<>();

    public Grade(Student etudiant, Exam examen, double valeurInitiale, Instant date) {
        this.etudiant = etudiant;
        this.examen = examen;
        historique.add(new GradeChange(valeurInitiale, date, "Note initiale"));
    }

    public void updateGrade(double nouvelleValeur, Instant date, String motif) {
        historique.add(new GradeChange(nouvelleValeur, date, motif));
    }


    public double getValeurAt(Instant t) {
        return historique.stream()
                .filter(gc -> !gc.date.isAfter(t))
                .reduce((first, second) -> second)
                .map(gc -> gc.valeur)
                .orElse(0.0);
    }

    public Student getEtudiant() {
        return etudiant;
    }

    public Exam getExamen() {
        return examen;
    }
}
