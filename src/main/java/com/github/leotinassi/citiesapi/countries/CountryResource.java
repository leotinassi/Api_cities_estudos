package com.github.leotinassi.citiesapi.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Country> getcountriId(@PathVariable Long id){
        return repository.findById(id);
    }

}
