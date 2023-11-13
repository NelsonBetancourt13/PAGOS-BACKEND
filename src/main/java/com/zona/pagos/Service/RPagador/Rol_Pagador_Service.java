package com.zona.pagos.Service.RPagador;

import com.zona.pagos.Models.Roles.Pagador.Rol_P;
import com.zona.pagos.Repository.RPagador.Rol_Pagador_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class Rol_Pagador_Service {

    private Rol_Pagador_Repository rolPagadorRepository;


    public List<Rol_P> listPago(){
        return rolPagadorRepository.findAll();
    }


    public void saveRolPagador(Rol_P rolP) {
        rolPagadorRepository.save(rolP);

    }

}
