package one.digitalInnovation.gof.service;

import one.digitalInnovation.gof.model.Cliente;
import org.springframework.stereotype.Component;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
