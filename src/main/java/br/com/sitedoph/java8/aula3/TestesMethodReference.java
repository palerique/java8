package br.com.sitedoph.java8.aula3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by paler on 18/06/2016.
 */
public class TestesMethodReference {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        //resumindo em uma única linha!!!
//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Sendo ainda mais direto:
        //palavras.sort((s1, s2) -> s1.length() - s2.length());

//        //Escrevendo da forma mais verborrágica para entender melhor:
//        final Function<String, Integer> stringIntegerFunction = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };
//        //que poderia ser escrito assim:
//        //        final Function<String, Integer> stringIntegerFunction = s -> s.length();
//        final Comparator<String> stringComparatorUsingFunction = Comparator.comparing(stringIntegerFunction);
//        palavras.sort(stringComparatorUsingFunction);

        //Utilizando simplificando um pouco mais:
//        palavras.sort(Comparator.comparing(s -> s.length()));

        //Utilizando method reference:
        //palavras.sort(Comparator.comparing(s -> s.length()));
        //palavras.sort(Comparator.comparing(String::length));
        //com import estático:
        palavras.sort(comparing(String::length));

        //O trecho acima pode ser lido:
        //ordene a coleção de palavras comparando utilizando o método length de String!
        //palavras.sort(comparing(String::length));

        //palavras.sort(String.CASE_INSENSITIVE_ORDER);

        //utilizando method reference para imprimir:
        palavras.forEach(System.out::println);

    }

}
