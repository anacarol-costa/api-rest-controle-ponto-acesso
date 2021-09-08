package com.github.anacarolcosta.apirestcontrolepontoacesso.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TipoData {
    @Id
    private long id;
    private String descricao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TipoData tipoData = (TipoData) o;
        return Objects.equals(id, tipoData.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
