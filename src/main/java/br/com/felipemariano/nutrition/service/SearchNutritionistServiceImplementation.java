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

    public Nutritionist searchForId(Long id) throws NutritionistNotFoundException {
        Optional<Nutritionist> optionalNutritionist = getOptional(id);

        Nutritionist nutritionist = null;

        if(!optionalNutritionist.isPresent()) {
            throw new NutritionistNotFoundException("Nenhum nutricionista encontrado através do Id: " + id);
        }else{
            nutritionist = optionalNutritionist.get();
        }

        return nutritionist;
    }

    private Optional<Nutritionist> getOptional(Long id) {
        Optional<Nutritionist> optionalNutritionist = nutritionistRepository.findById(id);

        return optionalNutritionist;
    }

    public void deleteForId(Long id) throws NutritionistNotFoundException {
        Optional<Nutritionist> optionalNutritionist = getOptional(id);
        if(!optionalNutritionist.isPresent()) {
            throw new NutritionistNotFoundException("Nenhum nutricionista encontrado através do Id: " + id);
        }else{
            nutritionistRepository.delete(optionalNutritionist.get());
        }


    }

}
