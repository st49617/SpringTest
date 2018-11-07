/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.cz.testSpring;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author st49617
 */
//@AllArgsConstructor
//@Getter
public class Country {
    private String code;
    private String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    
}