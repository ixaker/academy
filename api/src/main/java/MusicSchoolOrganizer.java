import java.util.List;

/**
 * Created by v.golub on 21.11.2015.
 */
public interface MusicSchoolOrganizer {
    void addNewStudent(Student student, SchoolClass schoolClass);
    void deleteStudentFromClass(Student student, SchoolClass schoolClass);
    List<Student> getAllStudents();
    List<Student> getStudentsFromClass(SchoolClass schoolClass);
    void schedulePerformance(Performance performance);
}
