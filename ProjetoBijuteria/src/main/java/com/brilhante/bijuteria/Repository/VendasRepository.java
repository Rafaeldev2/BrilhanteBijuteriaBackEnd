package com.brilhante.bijuteria.Repository;

import com.brilhante.bijuteria.Entity.Vendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasRepository extends JpaRepository<Vendas, Long>{
}
