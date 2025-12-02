import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Michel");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos para Michel: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos concluídos para Michel: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("=======================================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Miguel");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos para Miguel: " + dev.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos para Miguel: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }

}
