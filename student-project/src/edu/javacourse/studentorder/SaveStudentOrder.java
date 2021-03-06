package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Address;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.time.LocalDate;

/**
 * @author BR
 */
public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder s = buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderID(id);
        so.setMarriageCertificateID("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        so.setMarriageOffice("Отдел ЗАГС");

        Address address = new Address("195000", "Заневский пр.", "12", "", "124");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич",
                LocalDate.of(1997, 8, 24));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (10000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции № " + id);
        husband.setStudentID("" + (10000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алексеевна",
                LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (20000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции № " + id);
        wife.setStudentID("" + (20000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child = new Child("Петрова", "Ирина", "Викторовна",
                LocalDate.of(2018, 6, 29));
        child.setCertificateNumber("" + (30000 + id));
        child.setIssueDate(LocalDate.of(2018, 7, 19));
        child.setIssueDepartment("Отдел ЗАГС № " + id);
        child.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.setChild(child);

        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderID());
    }
}