## Antipadrão de Projeto: Estratégia(Strategy)

| Problemas do Antipadrão |
|:---------------------------|
| Código difícil de manter. |
| Não permite extensibilidade limpa. |
| Propenso a bugs — mudanças afetam várias partes do sistema. |

| Características Comuns do Antipadrão |
|:----------------------------------------|
| Uma única classe com muita lógica de decisão interna. |
| Nenhuma separação de responsabilidade. |
| Dificuldade para testar individualmente cada regra. |

| Desvantagens Práticas |
|:--------------------------|
| Ao adicionar um novo tipo de filme, é necessário alterar a classe `Filme`, afetando os filmes existentes. |
| Não é possível testar individualmente o cálculo de cada tipo de filme. |


