```mermaid
classDiagram
    direction TB

    class ElementoEscola {
        <<abstract>>
        +getNome() String
        +exibir() void
    }

    class Aluno {
        -nome String
        +getNome() String
        +exibir() void
    }

    class GrupoEscola {
        -nome String
        -elementos List~ElementoEscola~
        +adicionar(e: ElementoEscola) void
        +remover(e: ElementoEscola) void
        +exibir() void
    }

    ElementoEscola <|-- Aluno
    ElementoEscola <|-- GrupoEscola
    GrupoEscola o-- ElementoEscola : "contém *"
