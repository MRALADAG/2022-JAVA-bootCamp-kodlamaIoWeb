import business.CourseManager;
import core.CourseValidator;
import core.exceptions.IllegalCourseAddingActionException;
import core.exceptions.IllegalCourseCategoryException;
import core.exceptions.IllegalCoursePriceException;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.CourseDao;
import dataAccess.HibernateCourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalCourseAddingActionException, IllegalCourseCategoryException, IllegalCoursePriceException {
        Course course = new Course(1, "İleri Seviye Scala Kursu", "SCALA", "Engin", "DEMİROĞ", "Yazılım Geliştirme", 49);
        Course course2 = new Course(2, "İleri Seviye Scala Kursu", "SCALA", "Mustafa Murat", "COŞKUN", "Yazılım Test", 49);
        Course course3 = new Course(3, "İleri Seviye JAVA Kursu", "JAVA", "Atıl", "SAMANCIOĞLU", "Yazılım Geliştirme", 49);
        Course course4 = new Course(4, "İleri Seviye kotlin Kursu", "KOTLIN", "Serhat", "YILMAZ", "Yazılım Mimarisi", -1);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        CourseDao courseDao = new HibernateCourseDao();

        CourseValidator courseValidator = new CourseValidator();

        CourseManager courseManager = new CourseManager(courseDao, loggers, courseValidator);
        courseManager.addCourse(course);

//        courseManager.addCourse(course2);
//        courseManager.addCourse(course3);
        courseManager.addCourse(course4);
    }
}
