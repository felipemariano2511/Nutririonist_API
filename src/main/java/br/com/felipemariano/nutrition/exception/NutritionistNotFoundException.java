package br.com.felipemariano.nutrition.exception;

public class NutritionistNotFoundException extends Exception{

    public NutritionistNotFoundException() {
    }

    public NutritionistNotFoundException(String message) {
        super(message);
    }

    public NutritionistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutritionistNotFoundException(Throwable cause) {
        super(cause);
    }

    public NutritionistNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
