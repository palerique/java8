package br.com.sitedoph.java8.aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Created by paler on 19/06/2016.
 */
public class TestesAula4 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        //find any com optional
//        final Optional<Curso> cursoOptional = cursos.stream()
//                                                    .filter(c -> c.getAlunos() >= 100)
//                                                    .findAny();
//
////        cursoOptional.get();
//
//        cursoOptional.ifPresent(c -> System.out.println(c.getNome()));

        //find any com optional diretamente:
        cursos.stream()
              .filter(c -> c.getAlunos() >= 100)
              .findAny().ifPresent(c -> System.out.println(c.getNome()));

        final OptionalDouble average = cursos.stream()
                                             .filter(c -> c.getAlunos() >= 50)
                                             .mapToInt(Curso::getAlunos)
                                             .average();

        cursos.stream()
              .mapToInt(Curso::getAlunos)
              .average()
              .ifPresent(System.out::println);


        final List<Curso> cursoList = cursos.stream()
                                            .filter(c -> c.getAlunos() >= 100)
                                            .collect(Collectors.toList());

        cursos.stream()
              .filter(c -> c.getAlunos() >= 100)
              .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
              .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
    }

}
