package com.msvc.inventario.service;

import com.msvc.inventario.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Transactional
    public boolean inInStock(String codigoSku) {
        return inventarioRepository.findByCodigoSku(codigoSku).isPresent();
    }

}
