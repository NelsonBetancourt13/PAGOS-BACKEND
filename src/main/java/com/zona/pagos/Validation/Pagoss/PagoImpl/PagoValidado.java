package com.zona.pagos.Validation.Pagoss.PagoImpl;

import com.zona.pagos.Models.Pagos.Pago;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Pagoss.Pagos.PagoException;
import org.springframework.stereotype.Component;

@Component
public class PagoValidado implements PagoException {


    private void messagePago(String message)throws Exception1{
        throw new Exception1(message);
    }



    @Override
    public void ValidandoPago(Pago pago) throws Exception1 {


        if (pago.getTrans_codigo()<0){
            this.messagePago("Error, digite el codigo de Trasn_codigo es obligatorio");
        }

        if (pago.getTrans_medio_pago()<0){
            this.messagePago("Error, digite el pago de Trasn_medio_pago es obligatorio");
        }

        if (pago.getTrans_estado()<0){
            this.messagePago("Error, digite el estado de Trasn_estado es obligatorio");
        }

        if (pago.getTrans_total()<0){
            this.messagePago("Error, digite el total de Trasn_total es obligatorio");
        }

        if (pago.getTrans_fecha()==null){
            this.messagePago("Error, digite la fecha  de Trasn_fecha es obligatorio");
        }

        if (pago.getTrans_concepto()==null){
            this.messagePago("Error, digite el concepto  de Trasn_concepto es obligatorio");
        }

    }
}
