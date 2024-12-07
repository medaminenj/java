package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Management;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        for (Student student : students) {
            con.accept(student);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        for (Student student : students) {
            if (pre.test(student)) {
                con.accept(student);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        StringBuilder names = new StringBuilder();
        for (Student student : students) {
            names.append(fun.apply(student)).append(", ");
        }

        if (names.length() > 0) {
            names.setLength(names.length() - 2);
        }
        return names.toString();
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}
