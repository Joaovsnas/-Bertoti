Existem três diferenças notaveis quando se compara a organização e programação de software, sendo elas tempo, escala e  compensações em jogo.

Quando se projeta algo na engenharia de software é necesaria a atenção maior em relação ao tempo e as eventualidades de possiveis mudanças.

Por outro lado em organizações de engenharia de software estamos mais preocupados com a escala e a eficiencia, seja para o software ou para a organização que estamos produzindo.

Os engenheiros de software são solicitados a tomar decisões mais complexas e com riscos maiores, gerados com base em estimatimas de tempo e crescimento imprecisos.



3 Exemplos de Trade-offs
- Custos X Qualidade -   quanto maior a qualidade maior será exigido em custo;
- Usabilidade X Funcionalidade - quanto maior o numero de funcionalidades maior será a sua complexidade, dificultando assim a usabilidade;
- Segurança X Desempenho - quanto maior for a segurança de um sistema mais comsumo sera feito, podendo piorar seu desempenho.


Teste - Loja

Criando a classe cliente:

public class Cliente {
    private String nome;
    private String nivel;

    public Cliente(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }
}
////////////////////////////////////////////////////////////////////////////////////

Criando a loja e exemplificando alguns clientes e niveis :

import java.util.HashMap;
import java.util.Map;

public class Loja {
    private Map<String, Cliente> clientes;

    public Loja() {
        clientes = new HashMap<>();

        clientes.put("Joao", new Cliente("Joao", "Ouro"));
        clientes.put("Maria", new Cliente("Maria", "Prata"));
        clientes.put("José", new Cliente("José", "Bronze"));
    }

    public String consultaNivelCliente(String nome) {
        Cliente cliente = clientes.get(nome);
        if (cliente != null) {
            return "O nível do cliente " + cliente.getNome() + " é: " + cliente.getNivel();
        } else {
            return "Cliente não encontrado.";
        }
    }
}
///////////////////////////////////////////////////////////////////////////////////

Testando com clientes existentes e nao existentes:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    @Test
    public void testConsultaNivelCliente_ClienteExistente() {
        Loja loja = new Loja();
        String resultado = loja.consultaNivelCliente("Joao");
        assertEquals("O nível do cliente João é: Ouro", resultado);
    }

    @Test
    public void testConsultaNivelCliente_ClienteInexistente() {
        Loja loja = new Loja();
        String resultado = loja.consultaNivelCliente("Carlos");
        assertEquals("Cliente não encontrado.", resultado);
    }

    @Test
    public void testConsultaNivelCliente_CaseSensitive() {
        Loja loja = new Loja();
        String resultado = loja.consultaNivelCliente("maria");
        assertEquals("Cliente não encontrado.", resultado);
    }
}
//////////////////////////////////////////////////////////////////////////////
