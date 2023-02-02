package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descriptor;
    private final LocalDate dataInitial = LocalDate.now();
    private final LocalDate dataFinal;
    private Set<Dev> devsInscriptions;
    private Set<Content> contested;

    public Bootcamp() {
        this.dataFinal = this.dataInitial.plusDays(45L);
        this.devsInscriptions = new HashSet<>();
        this.contested = new LinkedHashSet<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public LocalDate getDataInitial() {
        return this.dataInitial;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public Set<Dev> getDevsInscriptions() {
        return this.devsInscriptions;
    }

    public void setDevsInscriptions(Set<Dev> devsInscriptions) {
        this.devsInscriptions = devsInscriptions;
    }

    public Set<Content> getContested() {
        return this.contested;
    }

    public void setContested(Set<Content> contested) {
        this.contested = contested;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Bootcamp bootcamp = (Bootcamp)o;
            return Objects.equals(this.nome, bootcamp.nome) && Objects.equals(this.descriptor, bootcamp.descriptor) && Objects.equals(this.dataInitial, bootcamp.dataInitial) && Objects.equals(this.dataFinal, bootcamp.dataFinal) && Objects.equals(this.devsInscriptions, bootcamp.devsInscriptions) && Objects.equals(this.contested, bootcamp.contested);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.nome, this.descriptor, this.dataInitial, this.dataFinal, this.devsInscriptions, this.contested);
    }

    public Calendar getDevInscriptions() {
        return null;
    }
}