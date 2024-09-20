package br.com.felipemariano.nutrition.service;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.repository.NutritionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchNutritionistsServiceImplementation {

    @Autowired
    private NutritionistRepository nutritionistRepository;

    public List<Nutritionist> searchAllNutritionists() {

        return nutritionistRepository.findAll();
    }
}
