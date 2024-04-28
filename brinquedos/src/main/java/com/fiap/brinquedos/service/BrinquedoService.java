package com.fiap.brinquedos.service;


import com.fiap.brinquedos.entity.Brinquedo;
import com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<Brinquedo> listarTodos() {
        return brinquedoRepository.findAll();
    }

    public Optional<Brinquedo> buscarPorId (Long Id) {
        return brinquedoRepository.findById(Id);
    }

    public Brinquedo salvar (Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

}
