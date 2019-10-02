package com.ExercicioDatas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Data {

	public static List<Date> diasDoMesAno(int mes, int ano) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.YEAR, ano);
		int qtdDiasMes = 0;

		// INCLUIR SE O ANO É BISSEXTO
		if (mes == 1)
			qtdDiasMes = calendario.getLeastMaximum(Calendar.DAY_OF_MONTH);
		else {
			qtdDiasMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		}

		List<Date> listaDias = new ArrayList<Date>();

		for (int i = 1; i <= qtdDiasMes; i++) {
			calendario.set(Calendar.DATE, i);
			calendario.set(Calendar.MONTH, mes);
			calendario.set(Calendar.YEAR, ano);
			Date hoje = calendario.getTime();
			listaDias.add(hoje);
		}
		return listaDias;
	}

	public static long diferencaSecond(Date data1, Date data2) {

		long secInicio = data1.getTime();
		long secFinal = data2.getTime();
		long diferenca = (secFinal - secInicio) / 1000;
		return diferenca;

	}

	public static double diferencaEmDias(Date data1, Date data2) {
		double result = 0;
		long diferenca = data2.getTime() - data1.getTime();
		double diferencaEmDias = (diferenca / 1000) / 60 / 60 / 24;
		long horasRestantes = (diferenca / 1000) / 60 / 60 % 24;
		result = diferencaEmDias + (horasRestantes / 24d);
		return result;

	}

	public static int qtdSabadoEDomingo(Date data1, Date data2) {
		int qtd = (int) diferencaEmDias(data1, data2);
		System.out.println("Diferença em dias: "+qtd);
		
		int qtdSabDom = (qtd / 7) + (qtd / 7);
		
		
		return qtdSabDom;

	}
	public static int caiDiaDaSemana (Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		return day;
	} 

}
