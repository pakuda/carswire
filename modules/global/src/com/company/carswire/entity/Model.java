package com.company.carswire.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARSWIRE_MODEL")
@Entity(name = "carswire_Model")
public class Model extends StandardEntity {
    private static final long serialVersionUID = 6122767245579811406L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "YEAR_FROM")
    protected Integer yearFrom;

    @Column(name = "YEAR_TO")
    protected String yearTo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BRAND_ID")
    protected Model brand;

    public Model getBrand() {
        return brand;
    }

    public void setBrand(Model brand) {
        this.brand = brand;
    }

    public String getYearTo() {
        return yearTo;
    }

    public void setYearTo(String yearTo) {
        this.yearTo = yearTo;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}