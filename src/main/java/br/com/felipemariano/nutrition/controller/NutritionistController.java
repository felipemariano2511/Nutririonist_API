package br.com.felipemariano.nutrition.controller;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.exception.NutritionistNotFoundException;
import br.com.felipemariano.nutrition.resource.model.NutritionistResorce;
import br.com.felipemariano.nutrition.service.NutritionistRegistrationServiceImplementation;
import br.com.felipemariano.nutrition.service.SearchNutritionistServiceImplementation;
import br.com.felipemariano.nutrition.service.SearchNutritionistsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NutritionistController {

    @Autowired
    private SearchNutritionistsServiceImplementation serviceSearch;

    @Autowired
    private NutritionistRegistrationServiceImplementation serviceRegister;

    @Autowired
    private SearchNutritionistServiceImplementation serviceSearchForId;

    @GetMapping(path = "/nutritionists")
    public List<Nutritionist> getAllNutritionists() {

        return serviceSearch.searchAllNutritionists();
    }

    @GetMapping(path = "/nutritionist/id/{id}")
    public Nutritionist searchNutritionistForId(@PathVariable(name = "id", required = true) Long id) throws NutritionistNotFoundException {
        return serviceSearchForId.searchForId(id);
    }

    @PostMapping(path = "/nutritionist/save")
    public void saveNutritionist(@RequestBody NutritionistResorce nutritionistResorce){

        serviceRegister.register(nutritionistResorce);
    }

    @DeleteMapping(path = "/nutritionist/delete/{id}")
    public void deleteNutritionist(@PathVariable (name = "id", required = true) Long id) throws NutritionistNotFoundException {
        serviceSearchForId.deleteForId(id);
    }
}
