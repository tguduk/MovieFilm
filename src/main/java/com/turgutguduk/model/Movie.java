package com.turgutguduk.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by turgut on 22.03.2016.
 */


@Entity
@Table(name = "movie")
public class Movie implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private
    int id;
    @Column(name="name")
    private
    String name;
    @Column(name="category")
    private
    String category;
    @Column(name="point")
    private
    String point;
    @Column(name="create_year")
    private
    String createYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getCreateYear() {
        return createYear;
    }

    public void setCreateYear(String createYear) {
        this.createYear = createYear;
    }
}

