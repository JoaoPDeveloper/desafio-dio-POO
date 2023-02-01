import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome ("Camila");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Joao" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Incritos Joao" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Incritos Joao" + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("XP" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Camila " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Incritos Camila " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Incritos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP" + devCamila.calcularTotalXp());
    }
}