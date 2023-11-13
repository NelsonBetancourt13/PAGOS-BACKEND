package com.zona.pagos.Validation.Usuario.Usuarios;

import com.zona.pagos.Models.Usuarios.Usuario;
import com.zona.pagos.Utils.Exception.Exception1;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioException {

    void ValidandoUsuario (Usuario usuario)throws Exception1;
}
