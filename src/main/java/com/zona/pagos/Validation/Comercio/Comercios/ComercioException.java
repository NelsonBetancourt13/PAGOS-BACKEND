package com.zona.pagos.Validation.Comercio.Comercios;

import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Utils.Exception.Exception1;
import org.springframework.stereotype.Service;

@Service
public interface ComercioException {

    void ValidandoComercio(Comercio comercio)throws Exception1;
}