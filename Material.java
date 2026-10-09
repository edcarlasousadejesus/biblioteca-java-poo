public abstract class Material {
    private String titulo;
    private String autor;

    public Material(String titulo, String autor) throws CampoObrigatorioInvalidoException {
        if (titulo == null || titulo.trim().isEmpty() || autor == null || autor.trim().isEmpty()) {
            throw new CampoObrigatorioInvalidoException("Por favor, preencha todos os campos obrigatórios.");
        }
        this.titulo = titulo.trim();
        this.autor = autor.trim();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}
