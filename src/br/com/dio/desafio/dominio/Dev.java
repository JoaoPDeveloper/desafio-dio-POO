package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Content> contentInscriptions = new LinkedHashSet<>();
    private Set<Content> contestedConclusion = new LinkedHashSet<>();

    public Dev(){

    }
    public void inscriberBootcamp(Bootcamp bootcamp){
        this.contentInscriptions.addAll(bootcamp.getContested());
        bootcamp.getDevInscriptions();
    }
    public void progress(){
        Optional<Content> content = this.contentInscriptions.stream().findFirst();
        if (content.isPresent()){
            this.contestedConclusion.add(content.get());
            this.contentInscriptions.remove((content.get()));
        }  else {
            System.err.println("Você não está Matriculado em nenhum Conteudo!");
        }
    }
    public double calculatorTotalXp(){
        return this.contestedConclusion.stream().mapToDouble(Content::calculatorXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Content> getContentInscriptions() {
        return contentInscriptions;
    }

    public void setContentInscriptions(Set<Content> contentInscriptions) {
        this.contentInscriptions = contentInscriptions;
    }

    public Set<Content> getContestedConclusion() {
        return contestedConclusion;
    }

    public void setContestedConclusion(Set<Content> contestedConclusion) {
        this.contestedConclusion = contestedConclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contentInscriptions, dev.contentInscriptions) && Objects.equals(contestedConclusion, dev.contestedConclusion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contentInscriptions, contestedConclusion);
    }
}

