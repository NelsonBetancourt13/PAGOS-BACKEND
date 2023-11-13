package com.zona.pagos.Controller.Usuario;


import com.zona.pagos.Models.Usuarios.Usuario;
import com.zona.pagos.Repository.Usuario.UsuarioRepository;
import com.zona.pagos.Service.Usuario.UsuarioService;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Usuario.UsuarioImpl.UsuarioValidado;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "api/Prueba/Consulta/usuario")
@AllArgsConstructor
@RestController
public class UsuarioController {


    private UsuarioService usuarioService;

    private UsuarioValidado usuarioValidado;

    private UsuarioRepository usuarioRepository;


    @GetMapping("")
    public ResponseEntity<List<Usuario>> getList(){
        Map<String, Object> response=new HashMap<>();
        List<Usuario>list = usuarioService.getAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }

    }


    @PostMapping("")
    public ResponseEntity<?>saveUsuario(@RequestBody Usuario usuario)throws Exception1 {

        Map<String,Object>response=new HashMap<>();
        this.usuarioValidado.ValidandoUsuario(usuario);
        this.usuarioService.saveUser(usuario);
        response.put("Mensaje","El usuario ha sido creado  ".concat("con exito"));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
