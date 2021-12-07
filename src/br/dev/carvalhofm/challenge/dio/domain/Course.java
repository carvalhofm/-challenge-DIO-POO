package br.dev.carvalhofm.challenge.dio.domain;

public class Course extends Contents{
    private int learnload;

    public Course() {
    }

    @Override
    public double xpCalculate() {
        return STANDARD_XP * learnload;
    }

    public int getLearnload() {
        return learnload;
    }

    public void setLearnload(int learnload) {
        this.learnload = learnload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", describle='" + getDescrible() + '\'' +
                ", learnload=" + learnload +
                '}';
    }
}
