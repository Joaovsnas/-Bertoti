## Padrão de Projeto: Estratégia(Strategy) - Padrão Comportamental

Quando uma classe precisa implementar diferentes variações de um algoritmo, e essas variações mudam ao longo do tempo, adicionar novas opções ou modificações pode deixar o código inchado, cheio de condicionais, difícil de manter. 

| FUNÇÃO |
|:-------|
| Separar cada variação do algoritmo em sua própria classe. |
| Ter uma interface comum que todas as estratégias implementam, de modo que o cliente (ou contexto) trabalhe com essa interface, não com classes concretas específicas. |
| O contexto possui uma referência para uma estratégia e delega a execução do algoritmo para ela. |
| O cliente decide qual estratégia usar e pode até trocar a estratégia em tempo de execução. |

| QUANDO USAR |
|:-----------------------------|
| Quando você precisa variar algoritmos ou comportamentos dentro de um objeto. |
| Quando há muitos comportamentos similares que diferem apenas em detalhes de implementação. |
| Quando uma classe tem muitos condicionais dizendo “se for este caso, faça isso; se for outro caso, faça aquilo”. Strategy ajuda a eliminar esses condicionais. |
| Quando você quer tornar o código mais flexível, aberto para extensão mas fechado para modificações do código existente. |

| VANTAGENS |
|:----------|
| Permite trocar de algoritmo em tempo de execução. |
| Isola os detalhes de cada algoritmo do restante do sistema. | 
| Reduz duplicação de código, melhora organização. |  
| Facilita manutenção e extensão. |  











