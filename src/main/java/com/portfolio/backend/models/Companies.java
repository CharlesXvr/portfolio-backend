package com.portfolio.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity @Getter @Setter
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;

    @OneToMany( mappedBy = "company",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,CascadeType.MERGE
    }) @JsonIgnore
    private Set<CompaniesUsuario> companiesUsuarios;

    public Companies() {

    }
    public Companies(String company) {
        this.company = company;
    }


}
