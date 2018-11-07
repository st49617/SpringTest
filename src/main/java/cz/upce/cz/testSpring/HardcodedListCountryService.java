/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.cz.testSpring;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 *
 * @author st49617
 */
@Component
public class HardcodedListCountryService implements CountryService {
    @Override
    public Set<Country> getAllCountries() {
        Set<Country> result = new HashSet<>();
        result.add(new Country("AU", "Australia"));
        result.add(new Country("BR", "Brazil"));
        result.add(new Country("BE", "Belgium"));
        return result;
    }
}

