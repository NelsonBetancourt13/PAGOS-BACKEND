package com.zona.pagos.Controller.Pagos;


import com.zona.pagos.Models.Pagos.Pago;
import com.zona.pagos.Repository.Pagos.PagoRepository;
import com.zona.pagos.Service.Pagos.PagoService;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Pagoss.PagoImpl.PagoValidado;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping(value = "api/Prueba/Consulta/pago")
@RestController
@AllArgsConstructor
public class PagoController {


    private PagoService pagoService;

    private PagoValidado pagoValidado;

    private PagoRepository pagoRepository;


    @GetMapping("")
    public ResponseEntity<List<Pago>>getList(){
        Map<String, Object>response=new HashMap<>();
        List<Pago>list = pagoService.listPago();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }

    }


    @PostMapping("")
    public ResponseEntity<?>savePago(@RequestBody Pago pago)throws Exception1{

        Map<String,Object>response=new HashMap<>();
        this.pagoValidado.ValidandoPago(pago);
        this.pagoService.savePago(pago);
        response.put("Mensaje","El pago ha sido realizado  ".concat("con exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }








}
