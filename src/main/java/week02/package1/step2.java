package week02.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class step2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("아기사자 이름을 입력해주세요.");
        String name = br.readLine();
        System.out.println("전공을 입력해주세요.");
        String major = br.readLine();
        System.out.println("기수를 입력해주세요.");
        String g = br.readLine();

        boolean isValidate = Lion.isValid(name, major, g);

        if (!isValidate) {
            System.out.println("잘못된 아기사자 정보입니다.");
            return;
        } else {
            int generation = Integer.parseInt(g.trim());
            System.out.println("모든 입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
            Lion lion = new Lion(name, major, generation);
            System.out.println("아기사자 객체를 성공적으로 생성했습니다.");
            lion.printInfo();
        }
    }
}
