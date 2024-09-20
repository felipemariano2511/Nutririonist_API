package br.com.felipemariano.nutrition.service;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.exception.NutritionistNotFoundException;
import br.com.felipemariano.nutrition.repository.NutritionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SearchNutritionistServiceImplementation {

    @Autowired
    private NutritionistRepository nutritionistRepository;

    public Nutritionist serchForId(Long id) throws NutritionistNotFoundException {
        Optional<Nutritionist> optionalNutritionist = nutritionistRepository.findById(id);

        Nutritionist nutritionist = null;

        if(!optionalNutritionist.isPresent()) {
            throw new NutritionistNotFoundException("Nenhum nutricionista encontrado atrvés do Id: " + id);
        }else{
            nutritionist = optionalNutritionist.get();
        }

        return nutritionist;
    }

    public void deletForId(Long id){
        nutritionistRepository.deleteById(id);
    }

}
