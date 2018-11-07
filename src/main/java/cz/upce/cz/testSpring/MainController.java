/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.cz.testSpring;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.util.StringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author st49617
 */
@Component
public class MainController {
    @FXML
    public ComboBox<Country> countriesComboBox;
 
    @Autowired
    private CountryService countryService;
 
    @FXML
    public void initialize() {
        countriesComboBox.setConverter(new CountryNameStringConverter());
        countriesComboBox.setItems(FXCollections.observableArrayList(countryService.getAllCountries()));
    }
 
    private static class CountryNameStringConverter extends StringConverter<Country> {
        @Override
        public String toString(Country object) {
            return object.getName();
        }
 
        @Override
        public Country fromString(String string) {
            return null;
        }
    }
}