package week02.package2;

import week02.package1.Lion;

public class step3 {
    public static void main(String args[]) {
        System.out.println("🦁 아기사자 객체를 생성합니다.");
        Lion lion = new Lion("이다겸", "디지털미디어학과", 13);
        lion.printInfo();

        System.out.println("\n📌 Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("👉 name 필드 값을 변경합니다.");
        lion.name = "김다겸";
        System.out.println("✅ public 필드 접근 성공");
        lion.printInfo();

        System.out.println("\n📌 Step 3-2. default 필드 접근을 시도합니다.");
        System.out.println("👉 major 필드 값을 변경하려고 시도합니다.");
        //lion.major = "소프트웨어융합학과"; // 컴파일 에러 발생 (다른 패키지)

        System.out.println("\n📌 Step 3-3. private 필드 접근을 시도합니다.");
        System.out.println("👉 generation 필드 값을 변경하려고 시도합니다.");
        //lion.generation = 14; // 컴파일 에러 발생 (private 접근 제한)

        System.out.println("\n📌 접근 제어자에 따른 필드 접근 실험을 종료합니다.");
    }
}
