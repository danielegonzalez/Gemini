package com.tu.paquete.infraestructura.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tu.paquete.dominio.core.ports.CatalogoRepository;
import com.tu.paquete.dominio.core.services.CatalogoService;
import com.tu.paquete.infraestructura.adapters.repositories.MySQLCatalogoRepository;

@Configuration
public class BeanConfiguration {

    @Bean
    public CatalogoRepository catalogoRepository() {
        return new MySQLCatalogoRepository();
    }

    @Bean
    public CatalogoService catalogoService(CatalogoRepository catalogoRepository) {
        return new CatalogoService(catalogoRepository);
    }
}
