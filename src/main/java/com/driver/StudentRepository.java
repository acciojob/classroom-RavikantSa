package com.driver;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class StudentRepository {
    // Hashmap for student
    public HashMap<String,Student> studentDb = new HashMap<>();

    // hashmap for teacher
    public HashMap<String,Teacher> teacherDb = new HashMap<>();

    // Hashmap for student and teacher connect
    public HashMap<String, List<String>> studentTeacherDb = new HashMap<>();




    public void addStudentFromDb(Student student){
        studentDb.put(student.getName() , student);
    }

    public void addTeacherFromDb(Teacher teacher){
        teacherDb.put(teacher.getName(),teacher);
    }

    public void addStudentTeacherPairFromDb(String student, String teacher){
        if(studentDb.containsKey(student) && teacherDb.containsKey(teacher)){
            List<String> studentsOfTeacher = new ArrayList<>();
            if(studentTeacherDb.containsKey(teacher)){
                studentsOfTeacher = studentTeacherDb.get(teacher);
            }
            studentsOfTeacher.add(student);
            studentTeacherDb.put(teacher,studentsOfTeacher);
        }
    }

    public Student getStudentByNameFromDb(String studentName){
        return studentDb.getOrDefault(studentName, null);

    }

    public Teacher getTeacherByNameFromDb(String teacherName){
        return teacherDb.getOrDefault(teacherName, null);

    }

    public List<String> getStudentsByTeacherNameFromDb(String teacher){
        List<String> studentsList = new ArrayList<>();
        if(studentTeacherDb.containsKey(teacher)){
            studentsList = studentTeacherDb.get(teacher);
        }
        return studentsList;
    }

    public List<String> getAllStudentsFromDb(){
        return new ArrayList<>(studentDb.keySet());
    }

    public void deleteTeacherByNameFromDb(String teacher){

        List<String> students = new ArrayList<>();
        if(studentTeacherDb.containsKey(teacher)){
            students = studentTeacherDb.get(teacher);

            for(String student: students){
                if(studentDb.containsKey(student)){
                    studentDb.remove(student);
                }
            }
            studentTeacherDb.remove(teacher);
        }
        if(teacherDb.containsKey(teacher)){
            teacherDb.remove(teacher);
        }
    }

    public void deleteAllTeachersFromDb(){

        HashSet<String> studentSet = new HashSet<>();

        teacherDb = new HashMap<>();

        for(String teacher: studentTeacherDb.keySet()){
            for(String student: studentTeacherDb.get(teacher)){
                studentSet.add(student);
            }
        }

        for(String student: studentSet){
            if(studentDb.containsKey(student)){
                studentDb.remove(student);
            }
        }
        studentTeacherDb = new HashMap<>();
    }
}
