package com.crowsoft.jornadatrabalho.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@Audited
public class JornadaTrabalho {

   @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
