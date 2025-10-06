## Padrão de Projeto: Observador (Observer) 

Quando um objeto precisa notificar automaticamente outros objetos sobre mudanças em seu estado, sem precisar conhecer diretamente quem eles são, o padrão **Observer** é ideal.  
Ele promove um **baixo acoplamento** entre o objeto principal (sujeito/publicador) e os objetos dependentes (observadores/assinantes), permitindo uma comunicação reativa e extensível.

---

| FUNÇÃO |
|:-------|
| Definir uma relação de **um-para-muitos**, onde várias entidades observam um único sujeito. |
| Quando o **sujeito** muda de estado, ele **notifica** automaticamente todos os **observadores registrados**. |
| Cada observador implementa uma **interface comum** (geralmente chamada `Observer`) com um método `update()`, usado para reagir à notificação. |
| O **sujeito (Subject)** mantém uma lista de observadores e fornece métodos para **adicionar**, **remover** e **notificar** todos eles. |
| O padrão promove **desacoplamento**, pois o sujeito não precisa saber o tipo exato ou a lógica dos observadores. |

---

| QUANDO USAR |
|:-------------|
| Quando várias partes do sistema precisam reagir automaticamente a mudanças de estado em um objeto central. |
| Quando se deseja manter baixo acoplamento entre componentes que se comunicam indiretamente. |
| Quando o número de dependentes pode mudar dinamicamente (adicionar/remover observadores em tempo de execução). |
| Quando se quer uma arquitetura mais reativa e extensível, facilitando a adição de novos comportamentos sem alterar o código existente. |

---

| VANTAGENS |
|:-----------|
| **Desacoplamento:** o sujeito não conhece detalhes dos observadores. |
| **Extensibilidade:** novos observadores podem ser adicionados facilmente, sem modificar o sujeito. |
| **Reatividade:** mudanças em um ponto do sistema propagam-se automaticamente. |
| **Organização:** separa lógica de atualização em classes distintas. |

---

