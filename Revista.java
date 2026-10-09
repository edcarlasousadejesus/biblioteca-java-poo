public class Revista extends Material {
    private int numero;

    public Revista(String titulo, String autor, int numero) throws CampoObrigatorioInvalidoException {
        super(titulo, autor);
        if (numero <= 0) {
            throw new IllegalArgumentException("O número da revista precisa ser maior que zero.");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "[Revista] " + super.toString() + " | Número: " + numero;
    }
}
