package com.turgutguduk.model;

import javax.persistence.*;

/**
 * Created by turgut on 20.03.2016.
 */
@Entity
@Table(name = "Test3")
public class Test3 {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;


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

}
