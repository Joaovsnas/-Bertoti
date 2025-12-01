```mermaid
classDiagram
    %% Interface alvo
    class Target {
        <<interface>>
        +executar(dado String) void
    }

    %% Adaptee A
    class AdapteeA {
        +processar(valor String) void
    }

    %% Adaptee B
    class AdapteeB {
        +run(texto String) void
    }

    %% Adapter ruim
    class BadAdapter {
        -AdapteeA a
        -AdapteeB b
        +BadAdapter(AdapteeA, AdapteeB)
        +executar(dado String) void
    }

    %% Cliente
    class Main {
        +main(args String[]) void
    }

    %% Relacionamentos
    Target <|.. BadAdapter : implementa
    BadAdapter --> AdapteeA : usa indevidamente
    BadAdapter --> AdapteeB : usa indevidamente
    Main --> Target : usa
