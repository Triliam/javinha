import model.Categoria;
import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        int qtdProdutoCadastro;
        int codProd;
        String nomeProd;
        double precoProd;
        int qtdProd;
        int codCate;
        String nomeCate;
        int addP;
        int delP;


        //  Categoria categoria = new Categoria(42, "Livro");
        // Produto produto = new Produto(3, "O guia", 30.00, 24, categoria);
        // lista.add(produto);
        //  System.out.println(lista);
        // System.out.println(produto);
        // produto.entradaEstoque(5);
        //  System.out.println(produto);
        // System.out.println(produto.getQuantidade());
        //  produto.saidaEstoque(2);
        // System.out.println(produto);
        // System.out.println(produto.getQuantidade());

        System.out.println("Quantos tipos de produto deseja cadastrar?");
        qtdProdutoCadastro = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < qtdProdutoCadastro; i++) {

            System.out.println("Digite o codigo da categoria do produto " + (i + 1));
            codCate = Integer.parseInt(scan.nextLine());

            System.out.println("Digite o nome da categoria do produto " + (i + 1));
            nomeCate = scan.nextLine();

            System.out.println("Digite o codigo do produto " + (i + 1));
            codProd = Integer.parseInt(scan.nextLine());

            System.out.println("Digite o nome do produto " + (i + 1));
            nomeProd = scan.nextLine();

            System.out.println("Digite o preço do produto " + (i + 1));
            precoProd = Double.parseDouble(scan.nextLine());

            System.out.println("Digite a quantidade do produto " + (i + 1));
            qtdProd = Integer.parseInt(scan.nextLine());

            Categoria categoria1 = new Categoria(codCate, nomeCate);
            Produto produto1 = new Produto(codProd, nomeProd, precoProd, qtdProd, categoria1);
            lista.add(produto1);

            System.out.println("Se quiser adicionar mais desse produto no estoque, digite a quantidade do produto, se não quiser adicionar basta digitar 0. Produto: " + (i + 1));
            addP = Integer.parseInt(scan.nextLine());
            produto1.entradaEstoque(addP);

            System.out.println("Se quiser remover uma quantidade desse produto do estoque, digite a quantidade do produto, se não quiser remover basta digitar 0. Produto: " + (i + 1));
            delP = Integer.parseInt(scan.nextLine());
            produto1.saidaEstoque(delP);
        }

        System.out.println("Saída dos produtos adicionados na lista: ");
        System.out.println(lista);
        System.out.println();
        System.out.println("Saída apenas do status da quantidade de cada produto: ");
        int count = 1;
        for (Produto saldo : lista) {
            System.out.println("A quantidade em estoque do produto " + (count++) + " :" + saldo.getNome() + " é: " + saldo.getQuantidade());
        }


        boolean menu = true;

        while (menu) {
            System.out.println();
            System.out.println("Se deseja adicionar produtos no estoque - Digite 1. Se deseja remover produtos do estoque - Digite 2. Para sair digite 0 ");
            int add = Integer.parseInt(scan.nextLine());

            if (add == 0) {
                menu = false;
            }

            if (add == 1) {
                int indice = 1;
                System.out.println("Segue abaixo a lista de todos os produtos cadastrados: ");
                for (Produto itens : lista) {
                    System.out.println("Contém: " + itens.getQuantidade() + " unidades do produto: " + itens.getNome() + " no estoque. O número desse produto é: " + indice++);
                }

                System.out.println("Qual produto deseja adicionar no estoque? Selecione pelo número do produto: ");
                int produto = Integer.parseInt(scan.next());
                Produto produtoEscolhido = lista.get((produto) - 1);
                System.out.println("Qual quantidade de " + produtoEscolhido.getNome() + " deseja add no estoque? ");
                int qtdP = Integer.parseInt(scan.next());
                produtoEscolhido.entradaEstoque(qtdP);
            }
            if (add == 2) {
                int indice = 1;
                System.out.println("Segue abaixo a lista de todos os produtos cadastrados: ");
                for (Produto itens : lista) {
                    System.out.println("Contém: " + itens.getQuantidade() + " unidades do produto: " + itens.getNome() + " no estoque. O número desse produto é: " + indice++);
                }

                System.out.println("Qual produto deseja remover no estoque? Selecione pelo número do produto: ");
                int produto = Integer.parseInt(scan.next());
                Produto produtoEscolhido = lista.get((produto) - 1);
                System.out.println("Qual quantidade de " + produtoEscolhido.getNome() + " deseja remover do estoque? ");
                int qtdP = Integer.parseInt(scan.next());
                produtoEscolhido.saidaEstoque(qtdP);
            }

            System.out.println("Lista atualizada de produtos: ");
            int count1 = 1;
            for (Produto saldo : lista) {
                System.out.println("A quantidade em estoque do produto " + (count1++) + " - " + saldo.getNome() + " é: " + saldo.getQuantidade());
            }
        }
    }
}




