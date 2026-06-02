package br.com.raizes.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @PostMapping
    public ResponseEntity<String> processarPagamento() {
        return ResponseEntity.ok("Pagamento mock processado com sucesso.");
    }
}