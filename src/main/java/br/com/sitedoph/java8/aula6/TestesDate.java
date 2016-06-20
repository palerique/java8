package br.com.sitedoph.java8.aula6;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by paler on 20/06/2016.
 */
public class TestesDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        LocalDate vinteESinco = LocalDate.of(2099, Month.JANUARY, 25);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasRio);
        Period periodo2 = Period.between(hoje, vinteESinco);

        System.out.println(periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);

        System.out.println(olimpiadasRio);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatada = proximasOlimpiadas.format(formatter);
        System.out.println(formatada);

        DateTimeFormatter formatterComHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterComHora));

        YearMonth mes = YearMonth.now();

        LocalTime intervalo = LocalTime.of(15, 30);

        System.out.println(intervalo);
    }
}
