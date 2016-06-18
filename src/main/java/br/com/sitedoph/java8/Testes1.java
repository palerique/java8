package br.com.sitedoph.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by paler on 18/06/2016.
 */
public class Testes1 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        palavras.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length()) {
                    return -1;
                }
                if (s1.length() > s2.length()) {
                    return 1;
                }
                return 0;
            }
        });

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }

}
