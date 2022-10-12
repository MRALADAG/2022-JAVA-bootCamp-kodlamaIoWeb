package core.exceptions;

import entities.Course;

public class IllegalCoursePriceException extends Exception {

    private static final String ALERT = "Kurs fiyatı sıfırdan küçük olamaz!";

    public IllegalCoursePriceException() {
    }

    public IllegalCoursePriceException(String message) {
        super(message);
    }

    public IllegalCoursePriceException(Course course) {
        super("\n " + ALERT + " Kurs : " + course.getCourseName());
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
