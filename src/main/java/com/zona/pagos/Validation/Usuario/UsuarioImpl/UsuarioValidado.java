package com.zona.pagos.Validation.Usuario.UsuarioImpl;

import com.zona.pagos.Models.Usuarios.Usuario;
import com.zona.pagos.Utils.Exception.Exception1;
import com.zona.pagos.Validation.Usuario.Usuarios.UsuarioException;
import org.springframework.stereotype.Component;


@Component
public class UsuarioValidado implements UsuarioException {


    private void messageUsuario(String message)throws Exception1{
        throw new Exception1(message);
    }


    @Override
    public void ValidandoUsuario(Usuario usuario) throws Exception1 {

        if (usuario.getUsuario_nombre()==null){
            this.messageUsuario("Error, digite el nombre de nombre_usuario es obligatorio");
        }

        if (usuario.getUsuario_identificacion()==null){
            this.messageUsuario("Error, digite la identificacion de usuario_identificacion es obligatorio");
        }

        if (usuario.getUsuario_gmail()==null){
            this.messageUsuario("Error, digite el email de usuario_gmail es obligatorio");
        }

    }
}
