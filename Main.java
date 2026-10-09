import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Revista");
            System.out.println("3 - Pesquisar por Título");
            System.out.println("4 - Excluir Material");
            System.out.println("5 - Listar Tudo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            try {
                int op = Integer.parseInt(sc.nextLine());

                if (op == 0) {
                    System.out.println("Encerrando programa...");
                    break;
                }

                switch (op) {
                    case 1:
                        System.out.print("Título: ");
                        String tLivro = sc.nextLine();
                        System.out.print("Autor: ");
                        String aLivro = sc.nextLine();

                        System.out.println("Gêneros disponíveis:");
                        Genero[] gens = Genero.values();
                        for (int i = 0; i < gens.length; i++) {
                            System.out.println((i + 1) + " - " + gens[i]);
                        }
                        System.out.print("Escolha o gênero (número): ");
                        int gOp = Integer.parseInt(sc.nextLine());

                        if (gOp < 1 || gOp > gens.length) {
                            throw new IllegalArgumentException("Opção de gênero inválida.");
                        }

                        biblio.adicionar(new Livro(tLivro, aLivro, gens[gOp - 1]));
                        break;

                    case 2:
                        System.out.print("Título: ");
                        String tRev = sc.nextLine();
                        System.out.print("Autor/Editora: ");
                        String aRev = sc.nextLine();
                        System.out.print("Número da edição: ");
                        int num = Integer.parseInt(sc.nextLine());

                        biblio.adicionar(new Revista(tRev, aRev, num));
                        break;

                    case 3:
                        System.out.print("Digite o título para buscar: ");
                        String tBusca = sc.nextLine();
                        Material res = biblio.buscar(tBusca);
                        System.out.println("Encontrado -> " + res);
                        break;

                    case 4:
                        System.out.print("Digite o título para excluir: ");
                        String tExc = sc.nextLine();
                        biblio.remover(tExc);
                        break;

                    case 5:
                        biblio.listar();
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (CampoObrigatorioInvalidoException e) {
                System.out.println(e.getMessage());
            } catch (MaterialNaoEncontradoException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada numérica inválida.");
            } catch (IllegalArgumentException | NullPointerException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        sc.close();
    }
}