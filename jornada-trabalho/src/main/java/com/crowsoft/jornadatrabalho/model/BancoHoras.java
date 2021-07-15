package com.crowsoft.jornadatrabalho.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {

        private Long idBancoHoras;
        private Long idUsuario;
        private Long idMovimentacao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private BancoHoras.BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qteHorasTrabalhadas;
    private BigDecimal saldo;
}

