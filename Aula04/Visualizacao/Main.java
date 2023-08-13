package Aula04.Visualizacao;

import java.util.ArrayList;
import java.util.Scanner;
import Aula04.Modelos.Restaurante;
import Aula04.Modelos.Prato;
import Aula04.Modelos.Pedido;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        ArrayList<Pedido> pedidosAnteriores = new ArrayList<>();
        ArrayList<Pedido> pedidosRecebidos = new ArrayList<>();


        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Restaurante");
            System.out.println("2 - Listar Restaurantes");
            System.out.println("3 - Adicionar Prato a um Restaurante");
            System.out.println("4 - Listar Pratos de um Restaurante");
            System.out.println("5 - Fazer um Pedido");
            System.out.println("6 - Listar Pedidos de um Restaurante");
            System.out.println("7 - Ver Pedidos Anteriores do Cliente");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o nome do restaurante:");
                    String nomeRestaurante = scanner.nextLine();
                    System.out.println("Informe o estado do restaurante:");
                    String estado = scanner.nextLine();
                    System.out.println("Informe o bairro do restaurante:");
                    String bairro = scanner.nextLine();
                    System.out.println("Informe a rua do restaurante:");
                    String rua = scanner.nextLine();
                    System.out.println("Informe o número do restaurante:");
                    String numero = scanner.nextLine();
                    Restaurante novoRestaurante = new Restaurante(nomeRestaurante, estado, bairro, rua, numero);
                    restaurantes.add(novoRestaurante);
                    System.out.println("Restaurante cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.println("Lista de Restaurantes:");
                    for (Restaurante r : restaurantes) {
                        System.out.println("Nome: " + r.getNomeRestaurante());
                        System.out.println("Estado: " + r.getEstado());
                        System.out.println("Bairro: " + r.getBairro());
                        System.out.println("Rua: " + r.getRua());
                        System.out.println("Número: " + r.getNumero());
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("Escolha um restaurante para adicionar o prato:");
                    for (int i = 0; i < restaurantes.size(); i++) {
                        System.out.println((i + 1) + " - " + restaurantes.get(i).getNomeRestaurante());
                    }
                    int escolhaRestaurante = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaRestaurante >= 1 && escolhaRestaurante <= restaurantes.size()) {
                        Restaurante restauranteSelecionado = restaurantes.get(escolhaRestaurante - 1);
                        System.out.println("Informe o nome do prato:");
                        String nomePrato = scanner.nextLine();
                        System.out.println("Informe a descrição do prato:");
                        String descricaoPrato = scanner.nextLine();
                        System.out.println("Informe o valor do prato:");
                        double valorPrato = scanner.nextDouble();
                        Prato novoPrato = new Prato(nomePrato, descricaoPrato, valorPrato);
                        restauranteSelecionado.adicionarPratos(novoPrato);
                        System.out.println("Prato '" + nomePrato + "' adicionado ao restaurante '"
                                + restauranteSelecionado.getNomeRestaurante() + "'.");
                    } else {
                        System.out.println("Escolha inválida de restaurante.");
                    }
                }
                case 4 -> {
                    System.out.println("Escolha um restaurante para listar os pratos:");
                    for (int i = 0; i < restaurantes.size(); i++) {
                        System.out.println((i + 1) + " - " + restaurantes.get(i).getNomeRestaurante());
                    }
                    int escolhaRestauranteListarPratos = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaRestauranteListarPratos >= 1 && escolhaRestauranteListarPratos <= restaurantes.size()) {
                        Restaurante restauranteSelecionado = restaurantes.get(escolhaRestauranteListarPratos - 1);
                        restauranteSelecionado.listarPratos();
                    } else {
                        System.out.println("Escolha inválida de restaurante.");
                    }
                }
                case 5 -> {
                    System.out.println("Escolha um restaurante para fazer o pedido:");
                    for (int i = 0; i < restaurantes.size(); i++) {
                        System.out.println((i + 1) + " - " + restaurantes.get(i).getNomeRestaurante());
                    }
                    int escolhaRestaurantePedido = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaRestaurantePedido >= 1 && escolhaRestaurantePedido <= restaurantes.size()) {
                        Restaurante restauranteSelecionado = restaurantes.get(escolhaRestaurantePedido - 1);
                        System.out.println("Informe o bairro de entrega:");
                        String bairroEntrega = scanner.nextLine();
                        System.out.println("Informe a rua de entrega:");
                        String ruaEntrega = scanner.nextLine();
                        System.out.println("Informe o número de entrega:");
                        String numeroEntrega = scanner.nextLine();

                        Pedido novoPedido = new Pedido(bairroEntrega, ruaEntrega, numeroEntrega, 0, restauranteSelecionado);

                        // Adicionar o pedido ao restaurante
                        restauranteSelecionado.adicionarPedido(novoPedido);

                        System.out.println("Escolha os pratos para o pedido (digite 0 para finalizar):");
                        while (true) {
                            restauranteSelecionado.listarPratos();
                            int escolhaPrato = scanner.nextInt();
                            scanner.nextLine();
                            if (escolhaPrato == 0) {
                                break;
                            } else if (escolhaPrato >= 1 && escolhaPrato <= restauranteSelecionado.getPratos().size()) {
                                Prato pratoSelecionado = restauranteSelecionado.getPratos().get(escolhaPrato - 1);
                                novoPedido.adicionarPrato(pratoSelecionado);
                                novoPedido.setValorTotal(novoPedido.getValorTotal() + pratoSelecionado.getValor());
                                System.out.println("Prato '" + pratoSelecionado.getNomePrato() + "' adicionado ao pedido.");
                            } else {
                                System.out.println("Escolha inválida de prato.");
                            }
                        }

                        pedidosAnteriores.add(novoPedido);
                        System.out.println("Pedido realizado com sucesso!");
                        pedidosRecebidos.add(novoPedido);

                    } else {
                        System.out.println("Escolha inválida de restaurante.");
                    }
                }
                case 6 -> {
                    System.out.println("Escolha um restaurante para listar os pedidos:");
                    for (int i = 0; i < restaurantes.size(); i++) {
                        System.out.println((i + 1) + " - " + restaurantes.get(i).getNomeRestaurante());
                    }
                    int escolhaRestauranteListarPedidos = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    if (escolhaRestauranteListarPedidos >= 1 && escolhaRestauranteListarPedidos <= restaurantes.size()) {
                        Restaurante restauranteSelecionado = restaurantes.get(escolhaRestauranteListarPedidos - 1);
                        restauranteSelecionado.listarPedidosRecebidos(); // Usar o novo método para listar pedidos
                    } else {
                        System.out.println("Escolha inválida de restaurante.");
                    }
                }
                case 7 -> {
                    System.out.println("Pedidos anteriores do cliente:");
                    for (Pedido pedidoAnterior : pedidosAnteriores) {
                        System.out.println("Restaurante: " + pedidoAnterior.getRestaurante().getNomeRestaurante());
                        System.out.println("Bairro de entrega: " + pedidoAnterior.getBairroEntrega());
                        System.out.println("Rua de entrega: " + pedidoAnterior.getRuaEntrega());
                        System.out.println("Número de entrega: " + pedidoAnterior.getNumeroEntrega());
                        System.out.println("Valor total: " + pedidoAnterior.getValorTotal());

                        System.out.println("Pratos pedidos:");
                        for (Prato prato : pedidoAnterior.getPratosPedidos()) {
                            System.out.println("- " + prato.getNomePrato() + " (" + prato.getValor() + ")");
                        }

                        System.out.println("==============");
                    }
                }
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}
