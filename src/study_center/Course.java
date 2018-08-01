package study_center;

public class Course {
    private String courseName;
    private String courseDuration;

    public Course(String courseName, String courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return String.valueOf(courseDuration);
    }

    public void setCourseDuration(String courseDuration) {
        switch (this.courseDuration = courseDuration) {
        }
    }

    public int getCoursesDuration() {
        return 0;
    }
}
