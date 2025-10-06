## AntiPattern: Uso incorreto do Composite – Padrão Estrutural

O padrão **Composite** é poderoso para representar hierarquias e estruturas em árvore,  
mas o uso inadequado pode gerar classes inchadas, alto acoplamento e operações incoerentes entre folhas e compostos.

---

| PROBLEMA |
|:-----------|
| Interfaces genéricas demais, forçando folhas a implementar métodos que não fazem sentido. |
| Estruturas hierárquicas muito profundas e difíceis de navegar. |
| Confusão entre responsabilidades das folhas e dos compostos. |
| Operações recursivas custosas em estruturas grandes. |

---

| SINTOMAS |
|:-----------|
| Métodos com implementação vazia em várias subclasses. |
| Árvores muito complexas, difíceis de compreender e depurar. |
| Dificuldade em aplicar regras específicas a tipos diferentes de nó. |
| Recursões lentas ou loops infinitos em composições mal estruturadas. |

---

| CAUSAS |
|:---------|
| Definição de uma interface comum muito genérica ou mal pensada. |
| Tentativa de usar Composite em estruturas que não exigem hierarquia real. |
| Falta de diferenciação entre comportamento de folhas e de nós compostos. |
| Recursão sem critérios claros ou sem controle de profundidade. |

---

| CONSEQUÊNCIAS |
|:----------------|
| Aumento da complexidade de manutenção. |
| Código ilegível e com muitos métodos sem uso. |
| Dificuldade para depurar e entender a lógica de composição. |
| Possibilidade de *stack overflow* em operações recursivas. |

---

| COMO EVITAR |
|:--------------|
| Só use Composite quando houver real necessidade de representar hierarquias. |
| Mantenha a interface comum minimalista — apenas o que todos os elementos realmente compartilham. |
| Evite operações recursivas desnecessárias ou muito profundas. |
| Diferencie claramente folhas e compostos em suas responsabilidades. |
| Valide a estrutura da árvore e proteja contra loops acidentais. |
