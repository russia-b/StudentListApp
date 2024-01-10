package ru.esstu;

public class RunTestDatabase extends StudentListTest{
    @Override
    protected StudentList createStudentList() {
        return new StudentListDatabase("jdbc:postgresql://localhost:5432/postgres", "postgres", "ROOTROOT");
    }
}

