package com.zona.pagos.Controller.R_Comercio;

import com.zona.pagos.Models.Roles.Comercio.Rol_C;
import com.zona.pagos.Repository.RComercio.Rol_Comercio_Repository;
import com.zona.pagos.Service.RComercio.Rol_Comercio_Service;
import com.zona.pagos.Utils.Exception.Exception1;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor
@RestController
@RequestMapping(value = "api/Prueba/Consulta/Rol_Comercio")

public class Rol_Comercio_Controller {

    private Rol_Comercio_Service rolComercioService;

    private Rol_Comercio_Repository rolComercioRepository;


    @GetMapping("")
    public ResponseEntity<List<Rol_C>> getList(){
        Map<String, Object> response=new HashMap<>();
        List<Rol_C>list = rolComercioService.getList();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }

    }


    @PostMapping("")
    public ResponseEntity<?>saveRolComercio(@RequestBody Rol_C rolC)throws Exception1 {
        Map<String,Object>response=new HashMap<>();
        this.rolComercioService.saveRolComercio(rolC);
        response.put("Mensaje","El Rol ha sido creado  ".concat("con exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
