package com.cognizant.repository;

import com.cognizant.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("FROM Country c WHERE c.name LIKE ?1%")
    List<Country> findCountriesStartingWith(String prefix);

    @Query("SELECT COUNT(c) FROM Country c")
    long countCountries();

    @Query("FROM Country c JOIN FETCH c.states WHERE c.code = ?1")
    Country findCountryWithStates(String code);

    @Query(value = "SELECT * FROM COUNTRY WHERE NAME LIKE ?1%", nativeQuery = true)
    List<Country> findCountriesNative(String prefix);
}
