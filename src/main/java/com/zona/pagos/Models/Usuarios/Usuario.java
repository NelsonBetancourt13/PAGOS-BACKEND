package com.zona.pagos.Models.Usuarios;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Models.Pagos.Pago;
import com.zona.pagos.Models.Roles.Comercio.Rol_C;
import com.zona.pagos.Models.Roles.Pagador.Rol_P;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String usuario_identificacion;

    @NotNull
    private String usuario_nombre;

    @NotNull
    private String usuario_gmail;

    @OneToOne
    private Rol_P rol_p;

    @OneToOne
    private Rol_C rol_c;

}
