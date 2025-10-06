## Padrão de Projeto: Composite 

Quando você quer representar hierarquias de objetos (estruturas em árvore) e deseja que clientes tratem componentes simples e compostos de forma uniforme, o padrão **Composite** é ideal.  
Ele permite compor objetos em estrutura de árvore, de modo que o cliente interaja com objetos simples ou compostos via a mesma interface.

---

| FUNÇÃO |
|:-------|
| Definir uma interface comum para componentes simples (folhas) e compostos. |
| Permitir que objetos compostos mantenham uma coleção de componentes filhos (folhas ou outros compostos). |
| Implementar operações recursivas: componentes compostos delegam chamadas aos seus filhos e agregam resultados. |
| O cliente manipula todos os objetos via a interface comum, sem distinguir folhas ou compostos. |

---

| QUANDO USAR |
|:-------------|
| Quando você tem estruturas de objetos hierárquicas em árvore (árvores de componentes). |
| Quando deseja tratar componentes simples e compostos de maneira uniforme. |
| Quando precisa que novos tipos de componente (folha ou composto) possam ser adicionados sem modificar código cliente. |
| Quando operações com recursão sobre os elementos são naturais (soma, travessia, processamento agregado). |

---

| VANTAGENS |
|:-----------|
| Simplifica o código cliente — ele interage com uma interface comum. |
| Facilita a composição dinâmica de objetos (montagem de árvores). |
| Permite extensão com novos tipos de nodes sem alterar o código cliente. |
| Suporta recursão e operações agregadas de forma elegante. |

---
