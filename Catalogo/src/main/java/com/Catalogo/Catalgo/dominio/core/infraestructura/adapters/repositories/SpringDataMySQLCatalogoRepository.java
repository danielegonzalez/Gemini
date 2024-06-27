package com.tu.paquete.infraestructura.adapters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tu.paquete.dominio.core.domain.Catalogo;

public interface SpringDataMySQLCatalogoRepository extends JpaRepository<Catalogo, Long> {
    // Métodos adicionales si es necesario
}
