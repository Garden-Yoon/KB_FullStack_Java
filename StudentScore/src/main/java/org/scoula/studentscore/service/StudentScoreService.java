package org.scoula.studentscore.service;

import org.scoula.lib.cli.ui.Input;
import org.scoula.studentscore.domain.StudentScores;

public class StudentScoreService {
    StudentScores studentScores = StudentScores.getInstance();

    // 메뉴 1 : 학생 수 입력
    public void initScores(){
        int studentNum = Input.getInt("학생수> ");
        // studentNum과 점수 배열의 크기를 할당
        studentScores.setStudentNum(studentNum);
    }

    // 메뉴 2 : 점수 입력
    public void getScores(){
        // 기존에 저장되어 있는 학생들의 점수 리스트를 가져옴
        int [] scores = studentScores.getScores();

        // 점수 리스트를 돌면서 사용자한테 입력받은 점수를 넣어줌
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }

    // 메뉴 3 : 점수 출력
    public void printScores() {
        // 기존에 저장되어있는 학생들의 점수 리스트를 가져옴
        int [] scores = studentScores.getScores();

        // 점수 리스트를 돌면서 각각의 점수들을 출력해줌
        for (int i = 0; i < scores.length; i++) {
            System.out.print("score[" + i + "]: " + scores[i]);
            System.out.println();
        }
    }

    // 메뉴 4 : 점수 분석
    public void analize(){
        // 기존에 저장되어있는 학생들의 점수 리스트를 가져옴
        int [] scores = studentScores.getScores();
        int max = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {
            max = (max<scores[i]) ? scores[i] : max;
            sum += scores[i];
        }

        // 학생 관련 정보를 studentScores에서 싱글톤으로 관리하고 있으므로 해당 방법으로 접근해야 함
        avg = (double) sum / studentScores.getStudentNum();

        System.out.println("최고 점수 : " + max);
        System.out.println("평균 점수 : " + avg);
    }

}
