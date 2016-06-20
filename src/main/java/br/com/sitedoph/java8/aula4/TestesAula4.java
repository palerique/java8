package br.com.sitedoph.java8.aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        //cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.stream()
              .filter(c -> c.getAlunos() >= 100)
              .forEach(c -> System.out.println(c.getNome()));

        //O stream não altera a coleção inicial!
        //Se imprimir o curso utilizando a variável cursos ela não estará filtrada!

        //Com expressões lambda:
//        cursos.stream()
//              .filter(c -> c.getAlunos() >= 100)
//              .map(c -> c.getAlunos())
//              .forEach(total -> System.out.println(total));

        //Com method Reference
        cursos.stream()
              .filter(c -> c.getAlunos() >= 100)
              .map(Curso::getAlunos)
              .forEach(System.out::println);

        //Convertendo em Stream de String
        cursos.stream()
              .filter(c -> c.getAlunos() >= 100)
              .map(Curso::getNome)
              .forEach(System.out::println);

        cursos.stream()
              .filter(c -> c.getAlunos() > 50)
//              .map(c -> c.getAlunos())
              .map(Curso::getAlunos)
//              .forEach(x -> System.out.println(x));
              .forEach(System.out::println);

        //Somando com o mapToInt
        final int sum = cursos.stream()
                              .filter(c -> c.getAlunos() >= 100)
                              .mapToInt(Curso::getAlunos)
                              .sum();

        System.out.println(sum);

        //Iria imprimir o toString() ---> //cursos.forEach(System.out::println);
        //cursos.forEach(c -> System.out.println(c.getNome()));

    }

}
