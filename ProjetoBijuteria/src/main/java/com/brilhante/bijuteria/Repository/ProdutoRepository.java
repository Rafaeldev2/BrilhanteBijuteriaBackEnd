package com.brilhante.bijuteria.Repository;

import com.brilhante.bijuteria.Entity.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
      List <Produto> findByNome(String nome);
}