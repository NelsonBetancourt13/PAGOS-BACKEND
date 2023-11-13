package com.zona.pagos.Service.Usuario;

import com.zona.pagos.Models.Usuarios.Usuario;
import com.zona.pagos.Repository.Usuario.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;


    public List<Usuario>getAll(){
        return usuarioRepository.findAll();
    }


    public void saveUser(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
