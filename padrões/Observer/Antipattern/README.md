## AntiPattern: Uso incorreto do Observer – Padrão Comportamental

O padrão **Observer** é útil quando vários objetos precisam ser notificados sobre mudanças em outro objeto.  
Mas quando usado incorretamente ou de forma excessiva, pode gerar forte acoplamento indireto, notificações redundantes e dificuldade de manutenção.

---

| PROBLEMA |
|:----------|
| O uso exagerado de observadores leva a uma rede de notificações difícil de entender e depurar. |
| Observadores podem executar lógica pesada, tornando o sistema lento e imprevisível. |
| O sujeito (observable) notifica todos os observadores mesmo quando as mudanças não são relevantes. |
| O gerenciamento incorreto de inscrição e remoção de observadores gera vazamentos de memória. |

---

| SINTOMAS |
|:----------|
| Mudanças em um objeto causam efeitos inesperados em partes distantes do sistema. |
| Dificuldade em rastrear quem está ouvindo o quê. |
| Sequência de atualizações imprevisível. |
| Performance degradada por notificações em cascata. |
| Observadores esquecidos (não removidos) continuam recebendo eventos desnecessários. |

---

| CAUSAS |
|:--------|
| Falta de critérios claros sobre o que deve gerar uma notificação. |
| Observadores realizando tarefas complexas no método `update()`. |
| Mistura de responsabilidades — sujeito e observadores compartilham lógica de negócio. |
| Ausência de gerenciamento de ciclo de vida dos observadores. |

---

| CONSEQUÊNCIAS |
|:----------------|
| Dificuldade de manutenção e rastreamento de erros. |
| Possibilidade de *loops* de notificações infinitas. |
| Código mais lento e imprevisível. |
| Aumento do acoplamento indireto e da complexidade cognitiva. |

---

| COMO EVITAR |
|:--------------|
| Certifique-se de que o evento notificado realmente seja relevante. |
| Use filas, *event buses* ou *event dispatchers* para controle centralizado de eventos complexos. |
| Mantenha as operações em `update()` curtas e sem lógica de negócio. |
| Garanta que observadores sejam removidos quando não forem mais necessários. |
| Utilize ferramentas de *logging* e *debugging* de eventos para rastrear dependências. |
