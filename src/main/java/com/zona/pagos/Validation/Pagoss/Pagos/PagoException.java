package com.zona.pagos.Validation.Pagoss.Pagos;

import com.zona.pagos.Models.Pagos.Pago;
import com.zona.pagos.Utils.Exception.Exception1;
import org.springframework.stereotype.Service;

@Service
public interface PagoException {

    void ValidandoPago (Pago pago)throws Exception1;
}
