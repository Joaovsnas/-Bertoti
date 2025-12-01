```mermaid
classDiagram
    %% Interface alvo (Target)
    class Player {
        <<interface>>
        +reproduzir(arquivo String) void
    }

    %% Classe legada (Adaptee)
    class AdvancedPlayer {
        -tocarArquivo(nomeArquivo String) void
        +tocarArquivo(nomeArquivo String)
    }

    %% Adapter
    class PlayerAdapter {
        -AdvancedPlayer advancedPlayer
        +PlayerAdapter(AdvancedPlayer)
        +reproduzir(arquivo String) void
    }

    %% Cliente
    class Main {
        +main(args String[]) void
    }

    %% Relacionamentos
    Player <|.. PlayerAdapter : implementa
    PlayerAdapter --> AdvancedPlayer : adapta
    Main --> Player : usa
