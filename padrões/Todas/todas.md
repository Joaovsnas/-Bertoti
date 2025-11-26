```mermaid
classDiagram
    direction TB

    %% ===== STRATEGY =====
    class EstrategiaMedia {
        <<interface>>
        +calcularMedia(notas: List~Double~) double
    }

    class MediaSimples {
    }
    class MediaPonderada {
    }

    EstrategiaMedia <|.. MediaSimples
    EstrategiaMedia <|.. MediaPonderada


    %% ===== COMPOSITE =====
    class ElementoEscola {
        <<abstract>>
        +getNome() String
        +exibir() void
    }

    class Aluno {
        -nome String
    }

    class GrupoEscola {
        -nome String
        -elementos List~ElementoEscola~
    }

    ElementoEscola <|-- Aluno
    ElementoEscola <|-- GrupoEscola
    GrupoEscola o-- ElementoEscola : "contém *"


    %% ===== OBSERVER =====
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
    }

    class Coordenador {
        -observadores List~Observador~
    }

    Observador <|.. Professor
    Observado <|.. Coordenador
    Coordenador o-- Observador
