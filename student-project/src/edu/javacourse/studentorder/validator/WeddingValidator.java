package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWeeding;
import edu.javacourse.studentorder.domain.StudentOrder;

/**
 * @author BR
 */
public class WeddingValidator {
    public AnswerWeeding checkWedding(StudentOrder so) {
        System.out.println("Weeding запущен");
        return new AnswerWeeding();
    }
}
