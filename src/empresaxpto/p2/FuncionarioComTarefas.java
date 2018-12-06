
package empresaxpto.p2;

import java.util.ArrayList;
import java.util.List;

public abstract class FuncionarioComTarefas extends Funcionario {
    
    List<Tarefa> tarefas;
    
    FuncionarioComTarefas(String nome, int salarioBase) {
        super(nome, salarioBase);
        tarefas = new ArrayList<>();
    }
    
    void atribuirTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
}
