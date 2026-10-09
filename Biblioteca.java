import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> listaMateriais = new ArrayList<>();

    public void adicionar(Material item) {
        if (item == null) {
            throw new NullPointerException("Material inválido.");
        }
        listaMateriais.add(item);
        System.out.println("Novo material cadastrado com sucesso!");
    }

    public Material buscar(String titulo) throws MaterialNaoEncontradoException {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título para busca não pode ser vazio.");
        }

        for (Material m : listaMateriais) {
            if (m.getTitulo().equalsIgnoreCase(titulo.trim())) {
                return m;
            }
        }
        throw new MaterialNaoEncontradoException("Material não foi encontrado.");
    }

    public void remover(String titulo) throws MaterialNaoEncontradoException {
        Material achado = buscar(titulo);
        listaMateriais.remove(achado);
        System.out.println("Material excluído com sucesso!");
    }

    public void listar() {
        if (listaMateriais.isEmpty()) {
            System.out.println("Nenhum material na biblioteca.");
            return;
        }

        System.out.println("\n--- Lista da Biblioteca ---");
        for (Material m : listaMateriais) {
            System.out.println(m);
        }
    }
}