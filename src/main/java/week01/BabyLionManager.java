package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabyLionManager {
    public static void main(String args[]) throws IOException {
        System.out.print("\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lionNum;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");
            String line = br.readLine();

            try {
                lionNum = Integer.parseInt(line);
                if (lionNum < 5) {
                    System.out.println("❗️ [오류] 5 이상 입력해주세요.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("❗️ [오류] 숫자만 입력할 수 있습니다.");
                continue;
            }

            String[] lions = new String[lionNum];

            System.out.println("✏️ 아기사자 이름을 입력해주세요.");

            String name;
            boolean isDuplicate;
            for (int i = 0; i< lionNum; i++) {
                isDuplicate = false;
                name = br.readLine().trim();

                if (name.isEmpty()) {
                    System.out.println("⚠️ 이름이 비어있습니다. 다시 입력해주세요.");
                    i--;
                    continue;
                }

                for (int j = 0; j < i; j++) {
                    if (name.equals(lions[j])) {
                        System.out.println("⚠️ 이미 등록된 이름입니다. 다시 입력해주세요.");
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    i--;
                    continue;
                }
                lions[i] = name;
            }

            System.out.println("📋 아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i< lionNum; i++) {
                System.out.println("🦁 " + (i+1) + ". " + lions[i]);
            }
            while (true) {
                System.out.println("===================");
                System.out.println("⛔️ 프로그램을 종료하려면 'exit'를 입력하세요.");
                System.out.println("🔁️ 계속 아기사자를 등록하려면 'restart'를 입력하세요.");

                String cmd = br.readLine().trim();
                if ("exit".equals(cmd)) {
                    System.out.println("👋 아기사자 명단 관리 프로그램을 종료합니다.");
                    isRunning = false;
                    break;
                } else if ("restart".equals(cmd)) {
                    System.out.println("🔁 초기 화면으로 돌아갑니다.\n===================");
                    break;
                } else {
                    System.out.println("❓ 알 수 없는 명령입니다. 다시 입력해주세요.");
                    continue;
                }
            }
        }
    }
}
