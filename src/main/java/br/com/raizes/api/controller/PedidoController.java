package br.com.raizes.api.controller;

import br.com.raizes.application.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public ResponseEntity<String> listarPedidos() {
        return ResponseEntity.ok(
                pedidoService.listarPedidos()
        );
    }

    @PostMapping
    public ResponseEntity<String> criarPedido() {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(
                        pedidoService.criarPedido()
                );
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<String> atualizarStatus(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                pedidoService.atualizarStatus(id)
        );
    }
}