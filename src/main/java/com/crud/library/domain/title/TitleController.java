package com.crud.library.domain.title;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/titles")
public class TitleController {

    @GetMapping
    public List<TitleDto> getTitles() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{titleId}")
    public TitleDto getTitle(@PathVariable int titleId) {
        return new TitleDto();
    }

    @PutMapping
    public TitleDto updateTitle() {
        return new TitleDto();
    }

    @PostMapping
    public void createTitle(TitleDto titleDto) {

    }
}
