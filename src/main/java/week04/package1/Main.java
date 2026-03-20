package week04.package1;

import week04.role.Lion;
import week04.role.Role;
import week04.role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Step1: List 기초
public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // List: 아기사자와 운영진 객체 저장할 동적 배열
        List<Role> members = new ArrayList<>();

        boolean running = true;

        while (true) {
            System.out.println("══════ 🦁 멤버 관리 시스템 ══════");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("\n── 📝 멤버 등록 ──");
                System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                int roleChoice = sc.nextInt();
                sc.nextLine();

                System.out.print("👤 이름: ");
                String name = sc.nextLine();

                // 중복 검사: List 순회
                boolean isDuplicate = false;

                for (Role member : members) {
                    if (member.getName().equals(name)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("❌ 등록 실패: 이미 존재하는 이름입니다.\n");
                    continue;
                }

                System.out.print("🎓 전공: ");
                String major = sc.nextLine();

                System.out.print("📌 기수: ");
                int generation = sc.nextInt();
                sc.nextLine();

                System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
                String part = sc.nextLine();

                Role member;
                if (roleChoice == 1) {
                    System.out.print("🆔 학번: ");
                    String studentId = sc.nextLine();
                    member = new Lion(name, major, generation, part, studentId);
                } else {
                    System.out.print("⭐ 직책 (대표/부대표/파트장/멘토): ");
                    String position = sc.nextLine();
                    member = new Staff(name, major, generation, part, position);
                }

                // List 추가
                members.add(member);
                System.out.println("✅ 등록 완료: " + name + "\n");

            } else if (choice == 2) {
                System.out.println("\n── 📋 전체 멤버 목록 ──");

                if (members.isEmpty()) {
                    System.out.println("📭 등록된 멤버가 없습니다.\n");
                    continue;
                }

                int index = 1;
                for (Role member : members) {
                    System.out.println(index + ". [" + member.roleName() + "] " + member.getName() + " - " + member.getGeneration()+ "기");
                    index++;
                }
                System.out.println("📊 총 " + members.size() + "명\n");

            } else if (choice == 3) {
                System.out.println("\n── 🔍 이름으로 검색 ──");

                System.out.print("검색할 이름: ");
                String searchName = sc.nextLine();

                // 리스트 순회하며 이름 비교
                Role found = null;
                for (Role member : members) {
                    if (member.getName().equals(searchName)) {
                        found = member;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("🔎 검색 결과 없음\n");
                } else {
                    System.out.println("\n✨ [검색 결과]");
                    System.out.println("🎭 역할: " + found.roleName());
                    System.out.println(found.getInfo());
                    System.out.println("📝 과제 제출 가능 여부: " + (found.canSubmitAssignment() ? "✅ 가능" : "❌ 불가능"));
                    System.out.println();
                }
            } else if (choice == 4) {
                running = false;
                System.out.println("👋 프로그램을 종료합니다.");
            } else {
                System.out.println("⚠️ 잘못된 입력입니다.\n");
            }
        }
    }
}
