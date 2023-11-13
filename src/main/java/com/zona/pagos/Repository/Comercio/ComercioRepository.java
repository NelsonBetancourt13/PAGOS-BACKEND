package com.zona.pagos.Repository.Comercio;

import com.zona.pagos.Models.Comercios.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercioRepository extends JpaRepository<Comercio,Integer>{
}
