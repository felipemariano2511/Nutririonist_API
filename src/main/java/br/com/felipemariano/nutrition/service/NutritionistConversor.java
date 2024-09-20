package br.com.felipemariano.nutrition.service;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import br.com.felipemariano.nutrition.exception.NutritionistResorceException;
import br.com.felipemariano.nutrition.resource.model.NutritionistResorce;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class NutritionistConversor {

    public Nutritionist conversor(NutritionistResorce nutritionistResorce) throws NutritionistResorceException {
        try {
            Nutritionist nutritionist = new Nutritionist();

            Long idPatient = checkIdPatient(nutritionistResorce.getIdPatient());

            LocalDate age = checkAge(nutritionistResorce.getAge());

            nutritionist.setIdPatient(idPatient);
            nutritionist.setAge(age);
            nutritionist.setRegistrationCode(nutritionistResorce.getRegistration_code());
            nutritionist.setName(nutritionistResorce.getName());

            return nutritionist;

        } catch (Exception e) {
            throw new NutritionistResorceException("Falha ao converter Resorce para Entidade. resorce: " + nutritionistResorce);
        }

    }
    private Long checkIdPatient(String idPatient){
        return Long.parseLong(idPatient);
    }

    private LocalDate checkAge(String age){
        return LocalDate.parse(age);
    }
}
