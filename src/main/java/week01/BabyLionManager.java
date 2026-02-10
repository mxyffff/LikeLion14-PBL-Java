package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabyLionManager {
    public static void main(String args[]) throws IOException {
        System.out.print("\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;

        do {
            System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");

            String line = br.readLine();
            n = Integer.parseInt(line);

            if (n < 5) {
                System.out.println("❗️ [오류] 5 이상 입력해주세요.");
            }
        } while (n < 5);

        System.out.println(n);
        String[] arr = new String[n];

        System.out.println("✏️ 아기사자 이름을 입력해주세요.");

        for (int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }

        System.out.println("📋 아기사자 명단을 최종적으로 출력합니다.");
        for (int i=0; i<n; i++) {
            System.out.println("🦁 " + (i+1) + ". " + arr[i]);
        }
    }
}
