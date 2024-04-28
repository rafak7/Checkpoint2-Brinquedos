package com.fiap.brinquedos.controller;

import com.fiap.brinquedos.entity.Brinquedo;
import com.fiap.brinquedos.service.BrinquedoService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<Brinquedo> listar() {
        return brinquedoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Brinquedo> criarBrinquedo(@RequestBody Brinquedo brinquedo) {
        Brinquedo novoBrinquedo = brinquedoService.salvar(brinquedo);
        return ResponseEntity.ok(novoBrinquedo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> consultarId(@PathVariable Long id) {
        Brinquedo brinquedo = brinquedoService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Brinquedo Não Encontrado"));
        return ResponseEntity.ok(brinquedo);
    }

}
