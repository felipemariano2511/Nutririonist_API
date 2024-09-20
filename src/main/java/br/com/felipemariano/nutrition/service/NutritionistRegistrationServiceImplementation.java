package br.com.felipemariano.nutrition.service;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.exception.NutritionistResorceException;
import br.com.felipemariano.nutrition.repository.NutritionistRepository;
import br.com.felipemariano.nutrition.resource.model.NutritionistResorce;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
@Service
public class NutritionistRegistrationServiceImplementation {

    private static final Logger LOG = LoggerFactory.getLogger(String.valueOf(NutritionistRegistrationServiceImplementation.class));

    @Autowired
    private NutritionistRepository nutritionistRepository;

    @Autowired
    private NutritionistConversor service;

    public void register(NutritionistResorce nutritionistResorce){

        Nutritionist nutritionist = null;
        try {
            nutritionist = service.conversor(nutritionistResorce);
            nutritionistRepository.saveAndFlush(nutritionist);
        } catch (NutritionistResorceException e) {
            LOG.error("Error ao salvar o nutricionista: " + e.getMessage(), e);
        }
    }
}
