package br.com.dio.desafio.dominio;

public class Curse extends Content {
    private int workload;

    @Override
    public double calculatorXp() {
        return xp_default + workload;
    }

    public Curse() {

    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescriptor() + '\'' +
                ", cargaHoraria=" + workload +
                '}';
    }

}
