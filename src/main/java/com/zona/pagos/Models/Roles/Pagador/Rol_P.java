 package com.zona.pagos.Models.Roles.Pagador;

import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Models.Pagos.Pago;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Rol_Pagador")
public class Rol_P {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Pagador")
    private String Name;




    @OneToMany
    private Set<Pago> pagos=new HashSet<>();

    @OneToOne
    private Comercio comercio;

}
