package br.com.caelum.estoque.exception;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name = "AutorizacaoFault")
public class AutorizacaoException extends Exception {

	public AutorizacaoException(String msg) {
		super(msg);
	}

	public InfoFault getFaultInfo() {
	    return new InfoFault("Token invalido" , new Date());	}
}
