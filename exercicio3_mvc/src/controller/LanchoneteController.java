package controller;

import model.Pedido;
import model.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LanchoneteController {
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Pedido> pedidos = new ArrayList<>();

    public Produto cadastrarProduto(String nome, String descricao, double preco) {
        Produto produto = new Produto(nome, descricao, preco);
        produtos.add(produto);
        return produto;
    }

    public Pedido criarPedido(LocalDate data) {
        Pedido pedido = new Pedido(data);
        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> listarPedidosPorDia(LocalDate data) {
        return pedidos.stream().filter(p -> p.getData().equals(data)).collect(Collectors.toList());
    }

    public double calcularFaturamento(LocalDate data) {
        return listarPedidosPorDia(data).stream().mapToDouble(Pedido::calcularTotal).sum();
    }
}
