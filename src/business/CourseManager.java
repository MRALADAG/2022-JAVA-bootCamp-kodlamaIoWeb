package business;

import core.CourseValidator;
import core.exceptions.IllegalCourseAddingActionException;
import core.exceptions.IllegalCourseCategoryException;
import core.exceptions.IllegalCoursePriceException;
import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;
    private static List<Course> courses = new ArrayList<>();

    private CourseValidator courseValidator;

    public CourseManager(CourseDao courseDao, List<Logger> loggers, CourseValidator courseValidator) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courseValidator = courseValidator;
    }

    public void addCourse(Course course) throws IllegalCourseAddingActionException, IllegalCourseCategoryException, IllegalCoursePriceException {
        if (courseValidator.isValid(course, courses)) {
            courseDao.add(course);
        }

        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseInfo());
        }

    }

    public List<Course> getAllCourses() {
        return courses;
    }
}
