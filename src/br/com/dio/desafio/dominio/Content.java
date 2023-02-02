package br.com.dio.desafio.dominio;

public abstract class Content {
    protected static final double xp_default = 10d;

    private String title;
    private String descriptor;
    public abstract double calculatorXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
