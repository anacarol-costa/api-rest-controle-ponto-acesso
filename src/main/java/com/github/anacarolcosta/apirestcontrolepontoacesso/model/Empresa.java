package com.github.anacarolcosta.apirestcontrolepontoacesso.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(id, empresa.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
