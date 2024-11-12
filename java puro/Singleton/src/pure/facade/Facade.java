package pure.facade;

import subsystem1.CrmService;
import subsystem2.CepService;

public class Facade {
    public void migrarCliente(String nome, String cep) {
		String cidade = CepService.getInstancia().recuperarCidade(cep);
		String estado = CepService.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
