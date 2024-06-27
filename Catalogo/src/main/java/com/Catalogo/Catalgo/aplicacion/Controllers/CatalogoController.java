package com.tu.paquete.aplicacion.controllers;

import org.springframework.web.bind.annotation.*;
import com.tu.paquete.dominio.core.services.CatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
    
    private final CatalogoService catalogoService;

    public CatalogoController(CatalogoService catalogoService) {
        this.catalogoService = catalogoService;
    }

    // Define tus endpoints aquí
}
