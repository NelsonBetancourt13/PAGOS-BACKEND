package com.zona.pagos.Models.Pagos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zona.pagos.Models.Comercios.Comercio;
import com.zona.pagos.Models.Roles.Pagador.Rol_P;
import com.zona.pagos.Models.Usuarios.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private int trans_codigo;

    @NotNull
    private int trans_medio_pago;

    @NotNull
    private int trans_estado;

    @NotNull
    private float trans_total;

    @NotNull
    private String trans_fecha;

    @NotNull
    private String trans_concepto;


}
