package projeto.praticaJava.javaPuro.facade;

import projeto.praticaJava.javaPuro.subsistemas.subsistema1.crm.CrmService;
import projeto.praticaJava.javaPuro.subsistemas.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
