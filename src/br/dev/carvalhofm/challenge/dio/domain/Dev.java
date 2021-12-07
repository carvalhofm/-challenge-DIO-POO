package br.dev.carvalhofm.challenge.dio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Contents> contentsRegisted = new LinkedHashSet<>();
    private Set<Contents> contentsConcluded = new LinkedHashSet<>();

    public void bootcampRegister (Bootcamp bootcamp){
        this.contentsRegisted.addAll(bootcamp.getContents());
        bootcamp.getDevRegistered().add(this);
    }
    public void progress(){
        Optional<Contents> contents = this.contentsRegisted.stream().findFirst();
        if (contents.isPresent()){
            this.contentsConcluded.add(contents.get());
            this.contentsRegisted.remove(contents.get());
        }else {
            System.err.println("You are not registered for any content.");
        }
    }
    public double xpCalculate(){
       return this.contentsConcluded
               .stream()
               .mapToDouble(Contents::xpCalculate)
               .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getContentsRegisted() {
        return contentsRegisted;
    }

    public void setContentsRegisted(Set<Contents> contentsRegisted) {
        this.contentsRegisted = contentsRegisted;
    }

    public Set<Contents> getContentsConcluded() {
        return contentsConcluded;
    }

    public void setContentsConcluded(Set<Contents> contentsConcluded) {
        this.contentsConcluded = contentsConcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsRegisted, dev.contentsRegisted) && Objects.equals(contentsConcluded, dev.contentsConcluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsRegisted, contentsConcluded);
    }
}
