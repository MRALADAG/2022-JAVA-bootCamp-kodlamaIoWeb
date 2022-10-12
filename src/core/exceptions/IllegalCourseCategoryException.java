package core.exceptions;

import entities.Course;

public class IllegalCourseCategoryException extends Exception{
    private static final String ALERT = "Daha önce aynı kategori isimiyle kurs eklenmiştir!";

    public IllegalCourseCategoryException() {
    }

    public IllegalCourseCategoryException(String message) {
        super(message);
    }

    public IllegalCourseCategoryException(Course course) {
        super("\n " + ALERT + " Kurs : " + course.getCourseName());
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
