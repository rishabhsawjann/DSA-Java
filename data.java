// Class representing a Student
class Student {
    int rollNo;
    String name;
    float marks;

    Student(int r, String n, float m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void displayStudentInfo() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

// Class representing a Teacher
class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    void displayTeacherInfo() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

// Class representing a Course
class Course {
    String courseName;
    Teacher teacher;      // Each course has a teacher
    Student[] students;   // Array of students in the course

    Course(String cName, Teacher t, Student[] sList) {
        courseName = cName;
        teacher = t;
        students = sList;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        teacher.displayTeacherInfo();
        System.out.println("Students enrolled:");
        for (Student s : students) {
            s.displayStudentInfo();
        }
    }
}

// Driver class
public class data {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student(101, "Rishabh", 92.5f);
        Student s2 = new Student(102, "Anita", 88.0f);
        Student s3 = new Student(103, "Vikram", 75.5f);

        // Create teacher object
        Teacher t1 = new Teacher("Mr. Sharma", "Math");

        // Array of students for the course
        Student[] mathStudents = { s1, s2, s3 };

        // Create course object
        Course mathCourse = new Course("Mathematics", t1, mathStudents);

        // Display course details
        mathCourse.displayCourseInfo();
    }
}
