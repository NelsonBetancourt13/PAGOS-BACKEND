package com.zona.pagos.Service.Comercio;

import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Repository.Comercio.ComercioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ComercioService {

    private ComercioRepository comercioRepository;



    public List<Comercio>getAll(){
        return comercioRepository.findAll();
    }

    public void saveComercio(Comercio comercio){
        comercioRepository.save(comercio);
    }
}
