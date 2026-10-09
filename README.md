# 📚 Sistema de Gerenciamento de Biblioteca

Projeto prático em **Java** desenvolvido para a Fase 2 da disciplina de Programação Orientada a Objetos (POO). O sistema simula o gerenciamento de uma biblioteca, permitindo cadastrar, listar, pesquisar e remover livros e revistas.

---

## 🛠️ Tecnologias e Conceitos de POO

* **Linguagem:** Java (JDK 26)
* **IDE:** IntelliJ IDEA
* **Abstração & Herança:** Classe base abstrata `Material` e subclasses `Livro` e `Revista`.
* **Polimorfismo:** Manipulação unificada dos materiais via `ArrayList<Material>`.
* **Encapsulamento:** Atributos privados com métodos *getters* e *setters*.
* **Enumerações:** Utilização da enum `Genero` para categorização de livros.
* **Tratamento de Exceções:** 
  * Customizadas: `MaterialNaoEncontradoException` e `CampoObrigatorioInvalidoException`.
  * Nativas: `NumberFormatException`, `IllegalArgumentException` e `NullPointerException`.

---

## 📂 Estrutura do Projeto

```text
src/
├── Biblioteca.java
├── CampoObrigatorioInvalidoException.java
├── Genero.java
├── Livro.java
├── Main.java
├── Material.java
├── MaterialNaoEncontradoException.java
└── Revista.java
