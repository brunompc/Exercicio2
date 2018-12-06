
package empresaxpto.p2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaXPTOP2 {

    List<Cliente> clientes = new ArrayList<>();
    List<Funcionario> funcionarios = new ArrayList<>();
    List<Tarefa> tarefas = new ArrayList<>();

    void adicionarCliente(Cliente c) {
        clientes.add(c);
    }
    
    void contratarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    // relatorio com a lista de Clientes e os seus dados
    void relatorio1() {
        
    }
}
