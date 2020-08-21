/**
 * @author BR
 */
public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
                //continue;
                break;
            }

            AnswerWeeding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }


    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWeeding checkWedding(StudentOrder so) {
        return AnswerWeeding.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        return AnswerChildren.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return AnswerStudent.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Почта отправлена");
    }
}
