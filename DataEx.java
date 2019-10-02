package com.ExercicioDatas;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataEx {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		// Data 1 para quantidade de Sábados e Domingos
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.YEAR, 2019);
		Date data1 = cal.getTime();
		//Data 2 para quantidade de Sábados e Domingos
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.YEAR, 2019);
		Date data2 = cal.getTime();
		
		// Que dia Cai a data ??/??/????
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.YEAR, 2019);
		Date data = cal.getTime();
		
		System.out.println("Quantidade de Sábados e Domingos: "+Data.qtdSabadoEDomingo(data1, data2));
		
		// Que dia Cai a data ??/??/????
		int dia = Data.caiDiaDaSemana(data);
		if (dia == 1)
			System.out.println("Domingo");
		else if (dia == 2)
			System.out.println("Segunda-Feira");
		else if (dia == 3)
			System.out.println("Terça-Feira");
		else if (dia == 4)
			System.out.println("Quarta-Feira");
		else if (dia == 5)
			System.out.println("Quinta-Feira");
		else if (dia == 6)
			System.out.println("Sexta-Feira");
		else 
			System.out.println("Sábado");
		entrada.close();
	}
}
