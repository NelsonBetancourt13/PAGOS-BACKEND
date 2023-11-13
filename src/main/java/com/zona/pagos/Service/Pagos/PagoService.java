package com.zona.pagos.Service.Pagos;


import com.zona.pagos.Models.Pagos.Pago;
import com.zona.pagos.Repository.Pagos.PagoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PagoService {


    private PagoRepository pagoRepository;


    public List<Pago>listPago(){
        return pagoRepository.findAll();
    }


    public void savePago(Pago pago) {

        pagoRepository.save(pago);
    }


}
