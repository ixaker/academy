import java.util.List;


public interface MusicSchoolOrganizer {
    void addNewStudent(Student student, SchoolClass schoolClass);
    void deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
}
