package com.zona.pagos.Controller.R_Pagador;

import com.zona.pagos.Models.Roles.Pagador.Rol_P;
import com.zona.pagos.Repository.RPagador.Rol_Pagador_Repository;
import com.zona.pagos.Service.RPagador.Rol_Pagador_Service;
import com.zona.pagos.Utils.Exception.Exception1;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping(value = "api/Prueba/Consulta/Rol_Pagador")
public class Rol_Pagador_Controller {

    private Rol_Pagador_Service rolPagadorService;

    private Rol_Pagador_Repository rolPagadorRepository;



    @GetMapping("")
    public ResponseEntity<List<Rol_P>> getList(){
        Map<String, Object> response=new HashMap<>();
        List<Rol_P>list = rolPagadorService.listPago();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }

    }


    @PostMapping("")
    public ResponseEntity<?>saveRolPagador(@RequestBody Rol_P rolP)throws Exception1 {
        Map<String,Object>response=new HashMap<>();
        this.rolPagadorService.saveRolPagador(rolP);
        response.put("Mensaje","El Rol ha sido creado  ".concat("con exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }




}
