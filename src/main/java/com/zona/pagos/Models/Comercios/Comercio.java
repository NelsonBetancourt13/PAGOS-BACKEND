package com.zona.pagos.Models.Comercios;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "comercio")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private int comercio_codigo;

    @NotNull
    private String comercio_nombre;

    @NotNull
    private String comercio_nit;

    @NotNull
    private String comercio_direccion;
}
