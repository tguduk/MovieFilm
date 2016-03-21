package com.turgutguduk.model.test2;

import javax.persistence.*;

/**
 * Created by turgut on 19.03.2016.
 */
@Entity
@Table(name = "Test2")
public class Test2 {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Column(name = "employees_number")
    private Integer emplNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmplNumber() {
        return emplNumber;
    }

    public void setEmplNumber(Integer emplNumber) {
        this.emplNumber = emplNumber;
    }
}
