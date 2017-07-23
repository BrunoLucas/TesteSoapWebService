package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEstoqueWS {

	
	public static void main(String[] args) {
		EstoqueWS implementacaoWS = new EstoqueWS();
//		RelatorioService relatorioService = new RelatorioService();
		String URL = "http://localhost:8080/estoquews";
//		String URL = "http://localhost:8080/relatorioWS";
		
		System.out.println("EstoqueWS rodando: " + URL);

		//associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWS);
//		Endpoint.publish(URL, relatorioService);
	}
}
