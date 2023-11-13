package com.zona.pagos.Repository.RComercio;

import com.zona.pagos.Models.Roles.Comercio.Rol_C;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rol_Comercio_Repository extends JpaRepository<Rol_C,Integer> {
}
