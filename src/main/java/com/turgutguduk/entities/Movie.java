package com.turgutguduk.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by turgut on 22.03.2016.
 */



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private
    Long id;
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

}

