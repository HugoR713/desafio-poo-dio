package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        //========================================== CURSOS ==========================================================//


        String s = "\n";
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java" + s);
        curso1.setDescricao("Aprendendo os conceitos basicos de Java" + s);
        curso1.setCargaHoraria(80);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Kotlin" + s);
        curso2.setDescricao( "Aprendendo os conceitos basicos de Kotlin" + s);
        curso2.setCargaHoraria(80);


        Curso curso3 = new Curso();
        curso3.setTitulo( "Objectve-C" + s);
        curso3.setDescricao("Aprendendo os conceitos basicos de objective-C" + s);
        curso3.setCargaHoraria(80);


        Curso curso4 = new Curso();
        curso4.setTitulo( "Swift" + s);
        curso4.setDescricao( "Aprendendo os conceitos basicos de Swift" + s);
        curso4.setCargaHoraria(80);


        Curso curso5 = new Curso();
        curso5.setTitulo("Spring Boot" + s);
        curso5.setDescricao("Aprendendo os conceitos basicos de Spring Boot" + s);
        curso5.setCargaHoraria(70);


        Curso curso6 = new Curso();
        curso6.setTitulo( "Postman" + s);
        curso6.setDescricao( "Aprendendo os conceitos basicos de Postman" + s);
        curso6.setCargaHoraria(60);


        Curso curso7 = new Curso();
        curso7.setTitulo( "Banco de dados" + s);
        curso7.setDescricao("Aprendendo os conceitos basicos de Banco de Dados" + s);
        curso7.setCargaHoraria(75);


        Curso curso8 = new Curso();
        curso8.setTitulo( "Mock" + s);
        curso8.setDescricao("Aprendendo os conceitos basicos de Mock" + s);
        curso8.setCargaHoraria(45);


        Curso curso9 = new Curso();
        curso9.setTitulo("Devops" + s);
        curso9.setDescricao("Aprendendo os conceitos basicos de Devops" + s);
        curso9.setCargaHoraria(65);


        Curso curso10 = new Curso();
        curso10.setTitulo("Padroes de Projetos" + s);
        curso10.setDescricao("Aprendendo os conceitos basicos de Padroes de Projetos" + s);
        curso10.setCargaHoraria(35);



        //========================================= MENTORIAS ========================================================//



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java" + s);
        mentoria1.setDescricao("Melhores mentores para te ajudar a ser um desenvolvedor Java" + s);
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Devops" + s);
        mentoria2.setDescricao("Profissionais qualificados, dando algumas dicas de Devops" + s);
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("API" + s);
        mentoria3.setDescricao("Aprendendo mais sobre Testes em API" + s);
        mentoria3.setData(LocalDate.now());

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("IOS" + s);
        mentoria4.setDescricao("Conhecendo a linguagem para dispositivos Apple" + s);
        mentoria4.setData(LocalDate.now());

        Mentoria mentoria5 = new Mentoria();
        mentoria5.setTitulo("Mentoria de kotlin" + s);
        mentoria5.setDescricao("Melhores mentores para te ajudar a ser um desenvolvedor kotlin" + s);
        mentoria5.setData(LocalDate.now());



        //========================================= BOOTCAMPS ========================================================//



        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer" + s);
        bootcamp1.setDescricao("Conhecimentos em Java, Spring Boot e Mock" + s);
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso5);
        bootcamp1.getConteudos().add(curso8);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Kotlin Developer" + s);
        bootcamp2.setDescricao("Conhecimentos em kotlin, Spring Boot e Postman " + s);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso5);
        bootcamp2.getConteudos().add(curso6);
        bootcamp2.getConteudos().add(mentoria3);
        bootcamp2.getConteudos().add(mentoria5);

        Bootcamp bootcamp3 = new Bootcamp();
        bootcamp3.setNome("Bootcamp Desenvolvimento IOS" + s);
        bootcamp3.setDescricao("Conhecimentos em Objective-C, Swift " + s);
        bootcamp3.getConteudos().add(curso3);
        bootcamp3.getConteudos().add(curso4);
        bootcamp3.getConteudos().add(mentoria4);

        Bootcamp bootcamp4 = new Bootcamp();
        bootcamp4.setNome("Bootcamp Devops" + s);
        bootcamp4.setDescricao("Conhecimentos em Banco de Dados, Devops, Padroes de Projetos " + s);
        bootcamp4.getConteudos().add(curso9);
        bootcamp4.getConteudos().add(curso10);
        bootcamp4.getConteudos().add(curso7);
        bootcamp4.getConteudos().add(mentoria2);



        //============================================ Dev ===========================================================//



        Dev devHugo = new Dev();
        devHugo.setNome("Hugo Ribeiro");
        devHugo.inscreverBootcamp(bootcamp1);
        devHugo.progredir();
        devHugo.progredir();

        System.out.println("===== Dev Hugo Ribeiro =====" + s + s + "***Conteudos inscritos*** " + s +  devHugo.getConteudosInscritos() + s );
        System.out.println( "***Conteudos Concluidos*** " + s + devHugo.getConteudosConcluidos() + s);
        System.out.println( "XP: " + s + devHugo.calcularTotalXp() + s);


        Dev devAndrea = new Dev();
        devAndrea.setNome("Andrea Bonfim");
        devAndrea.inscreverBootcamp(bootcamp2);
        devAndrea.inscreverBootcamp(bootcamp3);
        devAndrea.progredir();

        System.out.println("===== Dev Andrea Bonfim =====" + s + s + "***Conteudos inscritos*** " + s +  devAndrea.getConteudosInscritos() + s );
        System.out.println( "***Conteudos Concluidos*** " + s + devAndrea.getConteudosConcluidos() + s);
        System.out.println( "XP: " + s + devAndrea.calcularTotalXp() + s);


        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo Benevides");
        devGustavo.inscreverBootcamp(bootcamp4);

        System.out.println("===== Dev Gustavo Benevides =====" + s + s + "***Conteudos inscritos*** " + s +  devGustavo.getConteudosInscritos() + s );
        System.out.println( "***Conteudos Concluidos*** " + s + devGustavo.getConteudosConcluidos() + s);
        System.out.println( "XP: " + s + devGustavo.calcularTotalXp() + s);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas Ferreira");
        devDouglas.inscreverBootcamp(bootcamp3);

        System.out.println("===== Dev Douglas Ferreira =====" + s + s +  "***Conteudos inscritos*** " + s + devDouglas.getConteudosInscritos() + s );
        System.out.println( "***Conteudos Concluidos*** " + s + devDouglas.getConteudosConcluidos() + s);
        System.out.println( "XP: " + s + devDouglas.calcularTotalXp() + s);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego Zitto");

        System.out.println("===== Dev Diego Zitto =====" + s + s + "***Conteudos inscritos*** " + s + devDiego.getConteudosInscritos() + s );
        System.out.println( "***Conteudos Concluidos*** " + s + devDiego.getConteudosConcluidos() + s);
        System.out.println( "XP: " + s + devDiego.calcularTotalXp() + s);












    }
}
