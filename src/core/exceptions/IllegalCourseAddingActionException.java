package core.exceptions;

import entities.Course;

public class IllegalCourseAddingActionException extends Exception {

    private static final String ALERT = "Daha önce aynı isimle kurs eklenmiştir!";


    public IllegalCourseAddingActionException() {
    }

    public IllegalCourseAddingActionException(String message) {
        super(message);
    }

    public IllegalCourseAddingActionException(Course course) {
        super("\n " + ALERT + " Kurs : " + course.getCourseName());
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
