package br.com.sitedoph.java8.aula2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paler on 18/06/2016.
 */
public class Testes {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

//        palavras.sort((s1, s2) -> {
//            if (s1.length() < s2.length()) {
//                return -1;
//            }
//            if (s1.length() > s2.length()) {
//                return 1;
//            }
//            return 0;
//        });

        //resumindo em uma única linha!!!
//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Sendo ainda mais direto:
        palavras.sort((s1, s2) -> s1.length() - s2.length());

        palavras.forEach(s -> System.out.println(s));

        //Não compila:
        //Object o = s -> System.out.println(s);

    }

}
