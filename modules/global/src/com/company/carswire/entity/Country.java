package com.company.carswire.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "CARSWIRE_COUNTRY")
@Entity(name = "carswire_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = 3577544735906422938L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "ISO_CODE")
    protected String isoCode;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}