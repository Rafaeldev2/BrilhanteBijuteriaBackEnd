package com.brilhante.bijuteria.Repository;

import com.brilhante.bijuteria.Entity.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{    
    
}
