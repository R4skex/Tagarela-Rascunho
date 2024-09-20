package sistema;

import entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeCadastro {
    static ArrayList<Pais> paisList = new ArrayList<>();
    static ArrayList<Creche> crecheList = new ArrayList<>();
    static ArrayList<Funcionario> funcionarioList = new ArrayList<>();
    static ArrayList<Gerente> gerenteList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você já está cadastrado? (sim/nao)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("nao")) {
            System.out.println("Escolha uma opção para se cadastrar: ");
            System.out.println("1 - Pais");
            System.out.println("2 - Creche");
            System.out.println("3 - Funcionário");
            System.out.println("4 - Gerente");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a linha restante

            switch (opcao) {
                case 1:
                    cadastrarPais(scanner);
                    break;
                case 2:
                    cadastrarCreche(scanner);
                    break;
                case 3:
                    cadastrarFuncionario(scanner);
                    break;
                case 4:
                    cadastrarGerente(scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Sistema de login ainda não implementado.");
        }

        scanner.close();
    }

    public static void cadastrarPais(Scanner scanner) {
        System.out.println("Nome:");
        String nome = scanner.nextLine();
        System.out.println("Endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Cadastrando filho...");
        System.out.println("Nome do filho:");
        String nomeFilho = scanner.nextLine();
        System.out.println("Gênero:");
        String genero = scanner.nextLine();
        System.out.println("Aniversário:");
        String aniversario = scanner.nextLine();
        System.out.println("Tipo Sanguíneo:");
        String tipoSanguineo = scanner.nextLine();
        System.out.println("Alergia (se houver):");
        String alergia = scanner.nextLine();

        Filho filho = new Filho(nomeFilho, genero, aniversario, tipoSanguineo, alergia);
        Pais pais = new Pais(nome, endereco, telefone, email, filho);
        paisList.add(pais);

        System.out.println("Pais e filho cadastrados com sucesso!");
    }

    public static void cadastrarCreche(Scanner scanner) {
        System.out.println("Nome da creche:");
        String nome = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();
        System.out.println("Unidade da creche:");
        String unidade = scanner.nextLine();
    
        System.out.println("Horário de funcionamento (Exemplo: 08:00 - 18:00):");
        String horarioFuncionamento = scanner.nextLine();
    
        while (!horarioFuncionamento.matches("\\d{2}:\\d{2} - \\d{2}:\\d{2}")) {
            System.out.println("Formato inválido! Por favor, insira no formato HH:mm - HH:mm (Exemplo: 08:00 - 18:00):");
            horarioFuncionamento = scanner.nextLine();
        }
    
        Creche creche = new Creche(nome, senha, unidade, horarioFuncionamento);
        crecheList.add(creche);
    
        System.out.println("Creche cadastrada com sucesso!");
    }

    public static void cadastrarFuncionario(Scanner scanner) {
        System.out.println("Nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Classe que atua:");
        String classe = scanner.nextLine();
        System.out.println("Aniversário:");
        String aniversario = scanner.nextLine();
        System.out.println("Horário que trabalha:");
        String horarioTrabalho = scanner.nextLine();
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, classe, aniversario, horarioTrabalho, login, senha);
        funcionarioList.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public static void cadastrarGerente(Scanner scanner) {
        System.out.println("Nome do gerente:");
        String nome = scanner.nextLine();
        System.out.println("Aniversário:");
        String aniversario = scanner.nextLine();
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();

        Gerente gerente = new Gerente(nome, aniversario, login, senha);
        gerenteList.add(gerente);

        System.out.println("Gerente cadastrado com sucesso!");
    }
}
