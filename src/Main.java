import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo ("Curso Java");
        curso1.setDescricao ("Descrição curso Java");
        curso1.setCargaHoraria (8);

        Curso curso2 = new Curso();
        curso2.setTitulo ("Curso Kotlin");
        curso2.setDescricao ("Descrição curso Kotlin");
        curso2.setCargaHoraria (10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo( "Mentoria de ...");
        mentoria.setDescricao("Descrição da mentoria...");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
        // System.out.println(curso2);
        //   System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos" + devCarlos.getConteudoInscritos());

        devCarlos.progredir();
        System.out.println(".");

        System.out.println("Conteúdos Inscritos Carlos" + devCarlos.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Carlos" + devCarlos.getConteudoConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());


        System.out.println("__________________");


        Dev devCarla = new Dev();
        devCarla.setNome("Carla");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carla" + devCarla.getConteudoInscritos());

        devCarla.progredir();
        System.out.println(".");


        System.out.println("Conteúdos Inscritos Carla" + devCarla.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Carla" + devCarla.getConteudoConcluidos());
        System.out.println("XP:" + devCarla.calcularTotalXp());

    }
    }
