# Sistema de Ouvidoria em Java

## 1. Visão Geral
Este projeto consiste no desenvolvimento da camada lógica de um Sistema de Ouvidoria utilizando a Linguagem de Programação Java. O objetivo principal é gerenciar manifestações registradas por cidadãos/usuários através de um menu interativo via console.

## 2. Estrutura e Conceitos de POO Aplicados
* **Encapsulamento:** A classe `Manifestacao` possui atributos privados (`id`, `titulo`, `descricao`, `tipo`) expostos de forma controlada através de métodos *getters*.
* **Armazenamento Dinâmico:** Uso da classe `ArrayList<Manifestacao>` para manter os registros salvos em memória durante a execução.
* **Auto-incremento:** Identificador único (`id`) gerado automaticamente a cada nova instância.

## 3. Funcionalidades (CRUD)
* **Cadastro:** Adiciona novas manifestações ao `ArrayList`.
* **Listagem Geral:** Exibe todas as manifestações cadastradas.
* **Listagem Filtrada:** Filtra manifestações por tipo (Reclamação, Elogio, Sugestão, Denúncia).
* **Exclusão:** Remove uma manifestação do `ArrayList` através do seu ID.

## 4. Como Executar
1. Abra o projeto no **IntelliJ IDEA**.
2. Navegue até o arquivo `src/Main.java`.
3. Clique no ícone de play verde ao lado de `public class Main` e selecione **Run 'Main.main()'**.
4. Interaja com o sistema utilizando os números do menu no console.