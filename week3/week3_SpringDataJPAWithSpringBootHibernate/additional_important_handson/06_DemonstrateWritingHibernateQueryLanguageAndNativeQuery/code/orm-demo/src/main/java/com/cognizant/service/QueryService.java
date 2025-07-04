package com.cognizant.service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

    private final CountryRepository countryRepository;

    public QueryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void runQueries() {
        System.out.println("=== Countries starting with 'I' ===");
        countryRepository.findCountriesStartingWith("I").forEach(System.out::println);

        System.out.println("=== Count of Countries ===");
        System.out.println(countryRepository.countCountries());

        System.out.println("=== Country with states (fetch join) ===");
        Country country = countryRepository.findCountryWithStates("IN");
        System.out.println(country);
        country.getStates().forEach(System.out::println);

        System.out.println("=== Native query for countries starting with 'U' ===");
        countryRepository.findCountriesNative("U").forEach(System.out::println);
    }
}
