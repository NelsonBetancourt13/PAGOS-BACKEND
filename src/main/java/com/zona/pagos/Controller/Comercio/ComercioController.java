package com.zona.pagos.Controller.Comercio;


import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Repository.Comercio.ComercioRepository;
import com.zona.pagos.Service.Comercio.ComercioService;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Comercio.ComercioImpl.ComercioValidado;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "api/Prueba/Consulta/comercio")
@AllArgsConstructor
@RestController
public class ComercioController {


    private ComercioService comercioService;

    private ComercioValidado comercioValidado;

    private ComercioRepository comercioRepository;


    @GetMapping("")
    public ResponseEntity<List<Comercio>> getList(){
        Map<String, Object> response=new HashMap<>();
        List<Comercio>list = comercioService.getAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }

    }


    @PostMapping("")
    public ResponseEntity<?>saveComercio(@RequestBody Comercio comercio)throws Exception1 {
        Map<String,Object>response=new HashMap<>();
        this.comercioValidado.ValidandoComercio(comercio);
        this.comercioService.saveComercio(comercio);
        response.put("Mensaje","El Comercio ha sido realizado  ".concat("con exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
