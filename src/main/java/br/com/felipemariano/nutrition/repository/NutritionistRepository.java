package br.com.felipemariano.nutrition.repository;

import br.com.felipemariano.nutrition.datasource.model.Nutritionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionistRepository extends JpaRepository<Nutritionist, Long> {

}
