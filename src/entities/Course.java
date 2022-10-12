package entities;

public class Course {

    private int id;
    private String courseName;
    private String courseTechnologyType;
    private String lecturerName;
    private String lecturerSurName;
    private String courseCategories;
    private double coursePrice;

    public Course(int id, String courseName, String courseTechnologyType, String lecturerName, String lecturerSurName, String courseCategories, double coursePrice) {
        this.setId(id);
        this.setCourseName(courseName);
        this.setCourseTechnologyType(courseTechnologyType);
        this.setLecturerName(lecturerName);
        this.setLecturerSurName(lecturerSurName);
        this.setCourseCategories(courseCategories);
        this.setCoursePrice(coursePrice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTechnologyType() {
        return courseTechnologyType;
    }

    public void setCourseTechnologyType(String courseTechnologyType) {
        this.courseTechnologyType = courseTechnologyType;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerSurName() {
        return lecturerSurName;
    }

    public void setLecturerSurName(String lecturerSurName) {
        this.lecturerSurName = lecturerSurName;
    }

    public String getCourseCategories() {
        return courseCategories;
    }

    public void setCourseCategories(String courseCategories) {
        this.courseCategories = courseCategories;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseInfo() {
        return "\nid : " + id + ", course name : " + courseName +
                ", course subject : " + courseTechnologyType + ", lecturer name : " + lecturerName + " " + lecturerSurName
                + ", course category : " + courseCategories;
    }
}
