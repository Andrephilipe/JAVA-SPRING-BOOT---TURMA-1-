package sef.module5.sample.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
// Diferen�a entre Dias

public class DiferencaDatas {
	
	public static void main(String[] args) throws ParseException {
    	
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse("04-12-2020", fmt);
        LocalDate date2 = LocalDate.parse("04-10-2019", fmt);
        long diferencaEmDias = ChronoUnit.MONTHS.between(date2, date1);        
        
        System.out.println("Diferen�a em dias entre " + date1 + " e " + date2 + " = " + diferencaEmDias);
	}
}
