package br.com.felipemariano.nutrition.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutritionistResorce {
    @JsonProperty("name_nutrionist")
    private String name;

    @JsonProperty("age")
    private String age;

    @JsonProperty("registration_code")
    private String registration_code;

    @JsonProperty("id_patient")
    private String idPatient;

    public NutritionistResorce(String name, String idPatient) {
        this.name = name;
        this.idPatient = idPatient;
    }

    @Override
    public String toString() {
        return "NutritionistResorce{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", registration_code='" + registration_code + '\'' +
                ", idPatient='" + idPatient + '\'' +
                '}';
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegistration_code() {
        return registration_code;
    }

    public void setRegistration_code(String registration_code) {
        this.registration_code = registration_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }
}
