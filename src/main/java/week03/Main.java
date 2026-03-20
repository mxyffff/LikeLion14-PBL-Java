package week03;

import week03.role.Lion;
import week03.role.Role;
import week03.role.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 아기사자 정보 입력
        System.out.println("══════ 🦁 아기사자 정보 입력 ══════");
        System.out.print("👤 이름: ");
        String lionName = scanner.nextLine();

        System.out.print("🎓 전공: ");
        String lionMajor = scanner.nextLine();

        System.out.print("📌 기수: ");
        int lionGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
        String lionPart = scanner.nextLine();

        System.out.print("🆔 학번: ");
        String studentId = scanner.nextLine();

        // 운영진 정보 입력
        System.out.println("\n══════ 🧑‍💼 운영진 정보 입력 ══════");
        System.out.print("👤 이름: ");
        String staffName = scanner.nextLine();

        System.out.print("🎓 전공: ");
        String staffMajor = scanner.nextLine();

        System.out.print("📌 기수: ");
        int staffGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
        String staffPart = scanner.nextLine();

        System.out.print("⭐ 직책 (대표/부대표/파트장/멘토): ");
        String position = scanner.nextLine();

        System.out.println("\n══════ 📋 결과 출력 ══════\n");

        Role lion = new Lion(lionName, lionMajor, lionGeneration, lionPart, studentId);
        Role staff = new Staff(staffName, staffMajor, staffGeneration, staffPart, position);

        run(lion);
        run(staff);
    }

    private static void run(Role role) {
        System.out.println("🎭 역할: " + role.roleName());
        System.out.println(role.getInfo());
        System.out.println("📝 과제 제출 가능 여부: " + (role.canSubmitAssignment() ? "✅ 가능" : "❌ 불가능"));
        System.out.println("──────────────────────");
    }
}
