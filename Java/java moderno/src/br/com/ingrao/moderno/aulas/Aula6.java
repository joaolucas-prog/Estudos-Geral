package br.com.ingrao.moderno.aulas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula6 {
	// nova api data
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);

		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());

		LocalDate proximaOlimpiada = olimpiadasRio.plusYears(4);//apenas data

		System.out.println(proximaOlimpiada);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valor = proximaOlimpiada.format(formatador);
		System.out.println(valor);

		LocalDateTime agora = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));//data e hora
		
		System.out.println(agora.getHour()-1 + " horas");
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		System.out.println(agora.format(formatador2));
		agora.toLocalDate();//transformando para localDate
		
		LocalTime intervalo = LocalTime.of(16, 44);//apenas hora
		System.out.println(intervalo);
		
	
	}
}
