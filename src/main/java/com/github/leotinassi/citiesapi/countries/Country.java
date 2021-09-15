package com.github.leotinassi.citiesapi.countries;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "pais")
// a entidade chama Country mas a tabela no qual esta sendo feito o mapeamento com o banco é a tabela pais.

public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen; // se a entendidade for o mesmo nome da coluna não é necessario mapear

    public Country() {

    }
}
