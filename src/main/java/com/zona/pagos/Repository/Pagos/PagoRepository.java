package com.zona.pagos.Repository.Pagos;

import com.zona.pagos.Models.Pagos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago,Integer> {
}
