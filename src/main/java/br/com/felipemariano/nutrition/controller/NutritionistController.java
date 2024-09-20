package br.com.felipemariano.nutrition.controller;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.repository.NutritionistRepository;
import br.com.felipemariano.nutrition.resource.model.NutritionistResorce;
import br.com.felipemariano.nutrition.service.NutritionistRegistrationServiceImplementation;
import br.com.felipemariano.nutrition.service.SearchNutritionistsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class NutritionistController {

    @Autowired
    private SearchNutritionistsServiceImplementation serviceSearch;

    @Autowired
    private NutritionistRegistrationServiceImplementation serviceRegister;

    @GetMapping(path = "/nutritionists")
    public List<Nutritionist> getAllNutritionists() {

        return serviceSearch.searchAllNutritionists();
    }

    @GetMapping(path = "/nutritionist/id/{id}")
    public Optional<Nutritionist> searchNutritionistForId(@PathVariable(name = "id", required = true) Long id) {
        return nutritionistRepository.findById(id);
    }

    @PostMapping(path = "/nutritionist/save")
    public void saveNutritionist(@RequestBody NutritionistResorce nutritionistResorce){

        serviceRegister.register(nutritionistResorce);
    }

    @DeleteMapping(path = "/nutritionist/delete/{id}")
    public void deleteNutritionist(@PathVariable (name = "id", required = true) Long id){
        nutritionistRepository.deleteById(id);
    }
}
