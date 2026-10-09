public class Livro extends Material {
    private Genero genero;

    public Livro(String titulo, String autor, Genero genero) throws CampoObrigatorioInvalidoException {
        super(titulo, autor);
        if (genero == null) {
            throw new CampoObrigatorioInvalidoException("Por favor, preencha todos os campos obrigatórios.");
        }
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "[Livro] " + super.toString() + " | Gênero: " + genero;
    }
}