package com.crud.library.domain.title;

import com.crud.library.domain.copy.Copy;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public class TitleDto {
    private int id;
    private String title;
    private String author;
    private LocalDate releaseDate;
    private List<Copy> copies;
}
