package br.com.caelum.estoque.adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DataAdapter extends XmlAdapter<String, Date>{

	private static final String PATTERN = "dd/MM/yyyy";
	
	
	public Date unmarshal(String dateString) throws ParseException{
		return new SimpleDateFormat(PATTERN).parse(dateString);
	}
	
	public String marshal(Date date) 	{
		return new SimpleDateFormat(PATTERN).format(date);
	}

}
