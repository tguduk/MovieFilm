package com.turgutguduk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO implements Serializable {
    private static final long serialVersionUID = -7451782375099149601L;
    private String name;
    private String category;
    private String point;
    private String createYear;
}
