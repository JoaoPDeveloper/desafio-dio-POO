import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curse;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentor;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curse curse1 = new Curse();
        curse1.setTitle("curso java");
        curse1.setDescriptor("descrição curso java");
        curse1.setWorkload(8);

        System.out.println(curse1);

        Curse curse2 = new Curse();
        curse2.setTitle("curso js");
        curse2.setDescriptor("Curso de JavaScript");
        curse2.setWorkload(4);

        System.out.println(curse2);

        Mentor mentor = new Mentor();
        mentor.setTitle("mentoria de Java");
        mentor.setDescriptor("Descrição da mentoria java");
        mentor.setData(LocalDate.now());

        System.out.println(mentor);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescriptor("Descrição do bootcamp Java Developer");
        bootcamp.getContested().add(curse1);
        bootcamp.getContested().add(curse2);
        bootcamp.getContested().add(mentor);

        Dev devJoao = new Dev();
        devJoao.setNome ("Camila");
        devJoao.inscriberBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContestedConclusion());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        devJoao.progress();
        System.out.println("Conteudos Incritos Joao" + devJoao.getContentInscriptions());
        System.out.println("XP " + devJoao.calculatorTotalXp());

        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscriberBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Camila " + devCamila.getContentInscriptions());
        devCamila.progress();
        System.out.println("Conteudos Incritos Camila " + devCamila.getContentInscriptions());
        devCamila.progress();
        System.out.println("Conteudos Incritos Camila " + devCamila.getContestedConclusion());
        devCamila.progress();
        System.out.println("XP " + devCamila.calculatorTotalXp());
    }
}