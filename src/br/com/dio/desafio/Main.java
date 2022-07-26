package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprendendo os conceitos basicos de Java");
        curso1.setCargaHoraria(8000);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Kotlin");
        curso2.setDescricao("Aprendendo os conceitos basicos de Kotlin");
        curso2.setCargaHoraria(8000);

        System.out.println();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Melhores mentores para te ajudar");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}
