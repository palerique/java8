package br.com.sitedoph.java8.aula2;

/**
 * Created by paler on 18/06/2016.
 */
public class TestesThreads {

    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//        }).start();

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }

}
