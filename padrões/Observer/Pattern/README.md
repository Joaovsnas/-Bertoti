```mermaid
classDiagram
    direction TB

    class Observador {
        <<interface>>
        +atualizar(msg: String) void
    }

    class Observado {
        <<interface>>
        +registrar(o: Observador) void
        +remover(o: Observador) void
        +notificar(msg: String) void
    }

    class Professor {
        -nome String
        +atualizar(msg: String) void
    }

    class Coordenador {
        -observadores List~Observador~
        +registrar(o: Observador) void
        +remover(o: Observador) void
        +notificar(msg: String) void
    }

    Observador <|.. Professor
    Observado <|.. Coordenador
    Coordenador o-- Observador : "notifica"
