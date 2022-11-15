import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNadilson = new Dev();
        devNadilson.setNome("Nadilson");
        devNadilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (Nadilson): " + devNadilson.getConteudosInscritos());

        devNadilson.progredir();
        devNadilson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos (Nadilson): " + devNadilson.getConteudosInscritos());
        System.out.println("Conteúdos concluídos (Nadilson): " + devNadilson.getConteudosConcluidos());
        System.out.println("XP: " + devNadilson.calcularTotalXP());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (João): " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos (João): " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos (João): " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }
}
