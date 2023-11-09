package Util.fiap.com;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.YES_OPTION;
import java.util.Scanner;
import Usuario.fiap.com.Usuario;
import Usuario.fiap.com.UsuarioComum;
import Usuario.fiap.com.UsuarioPCD;
import Acessibilidade.fiap.com.Acessibilidade;
import Conta.fiap.com.Conta;

public class Util {

    Scanner teclado = new Scanner(System.in);
    Conta conta = new Conta();

    public void menu() {
        int opcao;

        do {
            opcao = parseInt(showInputDialog(gerarMenu()));
            if (opcao < 1 || opcao > 8) {
                showMessageDialog(null, "Opção inválida");
            } else {
                switch (opcao) {
                    case 1:
                        cadastrar();
                        break;

                    case 2:
                        if (!conta.getClientes().isEmpty()) {
                            boolean loginSucesso = realizarLogin();
                            if (loginSucesso) {
                                showMessageDialog(null, "Login bem-sucedido");
                            } else {
                                showMessageDialog(null, "Email ou senha inválidos. Tente novamente.");
                            }
                        } else {
                            showMessageDialog(null, "Nenhuma conta cadastrada. Crie uma conta primeiro.");
                        }
                        break;

                    case 3:
                        if (!conta.getClientes().isEmpty()) {
                            exibirInformacoes();
                        } else {
                            showMessageDialog(null, "Nenhuma conta cadastrada. Crie uma conta primeiro.");
                        }
                        break;

                    case 4:
                        if (!conta.getClientes().isEmpty()) {
                            String emailExcluir = showInputDialog("Digite o email da conta a ser excluída:");
                            String senhaExcluir = showInputDialog("Digite a senha da conta a ser excluída:");
                            
                            if (conta.login(senhaExcluir, emailExcluir)) {
                                excluirCadastro(emailExcluir);
                            } else {
                                showMessageDialog(null, "Email ou senha incorretos. Exclusão falhou.");
                            }
                        } else {
                            showMessageDialog(null, "Nenhuma conta cadastrada. Crie uma conta primeiro.");
                        }
                        break;

                    case 5:
                    	excluirTodos();
                    	break;
                        
                    case 6:
                    	exibirProdutos();
                        break;
                    	
                        
                }
            }
        } while (opcao != 8);
    }

    private void cadastrar() {
        long cpf;
        String nome, email, senha;

        nome = showInputDialog("Nome");
        cpf = Long.parseLong(showInputDialog("CPF"));
        email = showInputDialog("Email");
        senha = showInputDialog("Escolha sua senha");

        UsuarioPCD clientePCD = new UsuarioPCD(nome, email, cpf, true);

//        if (conta == null) {
//            String emailConta = showInputDialog("Defina o email da conta");
//            String senhaConta = showInputDialog("Defina a senha da conta");
//            conta = new Conta(emailConta, senhaConta);
//        }

        Conta.adicionarCliente(clientePCD);
        
        System.out.println("Conta cadastrada com sucesso.");
        showMessageDialog(null, "Usuário cadastrado com sucesso");
    }


    private boolean realizarLogin() {
        String email = showInputDialog("Digite seu email");
        String senha = showInputDialog("Digite sua senha");

        boolean loginSucesso = conta.login(senha, email);

        return loginSucesso;
    }
    
    private void exibirInformacoes() {
        String informacoesClientes = Conta.getInformacoesClientes();
        showMessageDialog(null, informacoesClientes);
    }
    
    private void excluirCadastro(String emailExcluir) {
        Usuario clienteParaExcluir = conta.buscarClientePorEmail(emailExcluir);
        
        if (clienteParaExcluir != null) {
            int confirmacao = showConfirmDialog(null, "Deseja realmente excluir a conta com o email: " + emailExcluir + "?");

            if (confirmacao == YES_OPTION) {
                conta.removerCliente(clienteParaExcluir);
                showMessageDialog(null, "Cadastro excluído com sucesso");
            }
        } else {
            showMessageDialog(null, "Email não encontrado. Exclusão falhou.");
        }
    }


    private void excluirTodos() {
        int confirmacao = showConfirmDialog(null, "Deseja realmente excluir todos os cadastros?");

        if (confirmacao == YES_OPTION) {
            conta = null;
            showMessageDialog(null, "Cadastro excluído com sucesso");
        }
    }

    private void exibirProdutos() {
        showMessageDialog(null, "Lista de produtos disponíveis: \n1. Produto A \n2. Produto B \n3. Produto C");
    }

    private String gerarMenu() {
        String aux = "Escolha sua opção:\n";
        aux += "1. Realizar cadastro\n";
        aux += "2. Realizar login \n";
        aux += "3. Visualizar contas\n";
        aux += "4. Excluir cadastro\n";
        aux += "5. Excluir todos os cadastros\n";
        aux += "6. Exibir produtos\n";
        aux += "7. Acessibilidade\n";
        aux += "8. Encerrar programa\n";
        return aux;
        
    }
    
}

	
	
	
	
