package com.tu.paquete.dominio.core.services;

import com.tu.paquete.dominio.core.ports.CatalogoRepository;

public class CatalogoService {
    
    private final CatalogoRepository catalogoRepository;

    public CatalogoService(CatalogoRepository catalogoRepository) {
        this.catalogoRepository = catalogoRepository;
    }

    // Implementa la lógica del servicio
}
