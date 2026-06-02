package br.com.raizes.application.service;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public String listarPedidos() {
        return "Listagem de pedidos funcionando.";
    }

    public String criarPedido() {
        return "Pedido criado com status AGUARDANDO_PAGAMENTO.";
    }

    public String atualizarStatus(Long id) {
        return "Status do pedido " + id + " atualizado.";
    }
}