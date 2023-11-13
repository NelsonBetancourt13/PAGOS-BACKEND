 package com.zona.pagos.Models.Roles.Comercio;

import com.zona.pagos.Models.Pagos.Pago;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


 @Getter
@Setter
@Entity
@Table(name = "rol_comercio")
public class Rol_C {


     @OneToMany
     private Set<Pago> pagos=new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comercio")
    private String Name;


}
