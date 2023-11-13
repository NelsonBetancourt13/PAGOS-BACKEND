package com.zona.pagos.Validation.Comercio.ComercioImpl;

import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Comercio.Comercios.ComercioException;
import org.springframework.stereotype.Component;

@Component
public class ComercioValidado implements ComercioException {


    private void messagePago(String message)throws Exception1{
        throw new Exception1(message);
    }

    @Override
    public void ValidandoComercio(Comercio comercio) throws Exception1 {

        if (comercio.getComercio_nombre()==null){
            this.messagePago("Error, digite el nombre del comercio_nombre es obligatorio");
        }

        if (comercio.getComercio_direccion()==null){
            this.messagePago("Error, digite la direccion del comercio_direccion es obligatorio");
        }

        if (comercio.getComercio_codigo()<0){
            this.messagePago("Error, digite el codigo del comercio_codigo es obligatorio");
        }

        if (comercio.getComercio_nit()==null){
            this.messagePago("Error, digite el nit del comercio_nit es obligatorio");
        }

    }
}
