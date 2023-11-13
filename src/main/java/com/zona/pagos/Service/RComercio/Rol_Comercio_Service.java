package com.zona.pagos.Service.RComercio;

import com.zona.pagos.Models.Roles.Comercio.Rol_C;
import com.zona.pagos.Repository.RComercio.Rol_Comercio_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Rol_Comercio_Service {


    private Rol_Comercio_Repository rolComercioRepository;


    public List<Rol_C>getList(){
        return rolComercioRepository.findAll();
    }

    public void saveRolComercio(Rol_C rolC){
        rolComercioRepository.save(rolC);
    }
}
