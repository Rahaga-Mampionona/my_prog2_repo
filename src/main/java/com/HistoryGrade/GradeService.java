package com.HistoryGrade;

import java.time.Instant;
import java.util.List;

public class GradeService {
    private List<Grade> notes;

    public GradeService(List<Grade> notes) {
        this.notes = notes;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return notes.stream()
                .filter(g -> g.getEtudiant().equals(student) && g.getExamen().equals(exam))
                .map(g -> g.getValeurAt(t))
                .findFirst()
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double numerateur = 0;
        double denominateur = 0;

        for (Grade g : notes) {

            if (g.getEtudiant().equals(student) && g.getExamen().getCours().equals(course)) {
                double valeur = g.getValeurAt(t);
                int coef = g.getExamen().getCoefficient();

                numerateur += valeur * coef;
                denominateur += coef;
            }
        }

        if (denominateur == 0) {
            return 0;
        } else {
            return numerateur / denominateur;
        }
    }

}
