package composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoEscola implements ElementoEscola {
    private String nome;
    private List<ElementoEscola> elementos = new ArrayList<>();

    public GrupoEscola(String nome) {
        this.nome = nome;
    }

    public void adicionar(ElementoEscola elemento) {
        elementos.add(elemento);
    }

    @Override
    public void exibir() {
        System.out.println(nome);
        for (ElementoEscola e : elementos) {
            e.exibir();
        }
    }
}
