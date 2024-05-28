package com.brilhante.bijuteria.Repository;

import com.brilhante.bijuteria.Entity.VendasProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendasProdutoRepository extends JpaRepository<VendasProduto, Long>{
}