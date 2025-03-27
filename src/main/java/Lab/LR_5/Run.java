package Lab.LR_5;

import Lab.LR_5.db.DatabaseManager;
import Lab.LR_5.model.Student;
import Lab.LR_5.service.StudentService;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        if (!doesTableExist()) {
            System.out.println("Table not found. Please initialize the database manually.");
        }

        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        List<Student> students = studentService.getStudentsByMonth(month);
        if (students.isEmpty()) {
            System.out.println("No students born in this month.");
        } else {
            System.out.println("Students born in the " + month + "-th month:");
            students.forEach(System.out::println);
        }
    }

    private static boolean doesTableExist() {
        try (Connection conn = DatabaseManager.connect()) {
            DatabaseMetaData metaData = conn.getMetaData();
            var resultSet = metaData.getTables(null, null, "students", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
