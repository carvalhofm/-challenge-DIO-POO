package br.dev.carvalhofm.challenge.dio.domain;

import java.time.LocalDate;

public class Mentoring extends Contents {

    private LocalDate date;

    public Mentoring() {
    }

    @Override
    public double xpCalculate() {
        return STANDARD_XP + 200d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", describle='" + getDescrible() + '\'' +
                ", date=" + date +
                '}';
    }
}
