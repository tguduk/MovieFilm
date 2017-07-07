package com.turgutguduk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    private String name;
    private String category;
    private String point;
    private String createYear;
}
