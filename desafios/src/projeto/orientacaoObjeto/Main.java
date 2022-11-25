package projeto.orientacaoObjeto;


import projeto.orientacaoObjeto.dominio.Bootcamp;
import projeto.orientacaoObjeto.dominio.Curso;
import projeto.orientacaoObjeto.dominio.Dev;
import projeto.orientacaoObjeto.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();
        curso1.setTituloConteudo("Curso Java");
        curso1.setDescricaoConteudo("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTituloConteudo("Curso de JavaScript");
        curso2.setDescricaoConteudo("Descrição do Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTituloConteudo("Mentoria de Java");
        mentoria.setDescricaoConteudo("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Mislaine");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mislaine: "+dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos Mislaine: "+dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mislaine: "+dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularXP());
        dev1.progredir();
        System.out.println("*------------------------*");

        Dev dev2= new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: "+dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Progredindo...");
        System.out.println("Conteúdos Inscritos Camila: "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: "+dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularXP());
    }
}
