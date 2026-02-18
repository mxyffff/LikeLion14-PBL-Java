package week02.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("아기사자 이름을 입력해주세요.");
        String name = br.readLine();
        System.out.println("전공을 입력해주세요.");
        String major = br.readLine();
        System.out.println("기수를 입력해주세요.");
        String g = br.readLine();

        System.out.println("입력값 검증을 진행합니다.");

        boolean isValidate = true;

        if (name.trim().isEmpty()) {
            System.out.println("이름은 비어 있을 수 없습니다.");
            isValidate = false;
        }
        if (major.trim().isEmpty()) {
            System.out.println("전공은 비어 있을 수 없습니다.");
            isValidate = false;
        }

        int generation = 0;
        if (g.trim().isEmpty()) {
            System.out.println("기수는 비어 있을 수 없습니다.");
            isValidate = false;
        } else {
            try {
                generation = Integer.parseInt(g);
                if (generation < 1) {
                    System.out.println("기수는 1 이상이어야 합니다.");
                    isValidate = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("기수는 숫자여야 합니다.");
                isValidate = false;
            }
        }

        if (isValidate) {
            System.out.println("모든 입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
            Lion lion = new Lion(name, major, generation);
            System.out.println("아기사자 객체를 성공적으로 생성했습니다.");
        } else return;
    }
}
