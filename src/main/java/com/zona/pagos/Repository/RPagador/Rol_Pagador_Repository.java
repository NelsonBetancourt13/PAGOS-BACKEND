package com.zona.pagos.Repository.RPagador;

import com.zona.pagos.Models.Roles.Pagador.Rol_P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rol_Pagador_Repository extends JpaRepository<Rol_P,Integer> {
}
