package br.com.felipemariano.nutrition.exception;

public class NutritionistResorceException extends Exception{
    public NutritionistResorceException() {
    }

    public NutritionistResorceException(String message) {
        super(message);
    }

    public NutritionistResorceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutritionistResorceException(Throwable cause) {
        super(cause);
    }

    public NutritionistResorceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
