```mermaid
classDiagram
    direction TB

    class EstrategiaMedia {
        <<interface>>
        +calcularMedia(notas: List~Double~) double
    }

    class MediaSimples {
        +calcularMedia(notas: List~Double~) double
    }

    class MediaPonderada {
        +calcularMedia(notas: List~Double~) double
    }

    EstrategiaMedia <|.. MediaSimples
    EstrategiaMedia <|.. MediaPonderada

