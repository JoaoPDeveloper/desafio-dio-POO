package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentor extends Content {

    private LocalDate data;


    @Override
    public double calculatorXp() {
        return xp_default + 20d;
    }

    public Mentor() {

    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescriptor() + '\'' +
                ", data=" + data +
                '}';
    }

}
