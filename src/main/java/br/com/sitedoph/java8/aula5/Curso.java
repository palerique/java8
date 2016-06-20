package br.com.sitedoph.java8.aula5;

/**
 * Created by paler on 19/06/2016.
 */
public class Curso {

    private String nome;
    private int alunos;


    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}
