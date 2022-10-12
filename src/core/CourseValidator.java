package core;

import core.exceptions.IllegalCourseAddingActionException;
import core.exceptions.IllegalCourseCategoryException;
import core.exceptions.IllegalCoursePriceException;
import entities.Course;

import java.util.List;

public class CourseValidator {
    public boolean isValid(Course course, List<Course> courses) throws IllegalCourseAddingActionException, IllegalCourseCategoryException, IllegalCoursePriceException {
        for (Course courseItem : courses) {
            if (course.getCourseName().equals(courseItem.getCourseName())) {
                throw new IllegalCourseAddingActionException(course);
            } else if (course.getCourseCategories().equals(courseItem.getCourseCategories())) {
                throw new IllegalCourseCategoryException(course);
            } else if (course.getCoursePrice() < 0) {
                throw new IllegalCoursePriceException(course);
            }

        }

        return true;
    }
}
