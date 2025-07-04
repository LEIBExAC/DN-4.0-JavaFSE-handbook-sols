package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryService {
    @Autowired private CountryRepository repo;

    public Country findByCode(String code) { return repo.findById(code).orElse(null); }
    public Country addCountry(Country c) { return repo.save(c); }
    public Country updateCountry(Country c) { return repo.save(c); }
    public void deleteCountry(String code) { repo.deleteById(code); }
    public List<Country> searchByName(String part) {
        return repo.findByNameContainingIgnoreCase(part);
    }
}
