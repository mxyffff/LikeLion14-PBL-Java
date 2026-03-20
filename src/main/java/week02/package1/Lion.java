package week02.package1;

public class Lion {
    public String name;
    String major;
    private int generation;

    // 아기사자 객체를 생성하고 기본 정보를 초기화
    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    // Step 2-1: 검증 로직을 Lion 클래스로 이동
    public boolean isValid() {
        if (name == null || name.isEmpty()) {
            System.out.println("❌ 이름이 비어 있습니다.");
            return false;
        }

        if (major == null || major.isEmpty()) {
            System.out.println("❌ 전공이 비어 있습니다.");
            return false;
        }

        if (generation <= 0) {
            System.out.println("❌ 기수는 1 이상이어야 합니다.");
            return false;
        }

        return true;
    }

    // 아기사자의 기수를 새로운 값으로 변경
    public void updateGeneration(int newGeneration) {
        if (newGeneration <= 0) {
            System.out.println("❌ 기수는 1 이상이어야 합니다.");
            return;
        }

        this.generation = newGeneration;
        System.out.println("✅ 기수가 성공적으로 변경되었습니다.");
        printInfo();
    }

    // 현재 아기사자 정보를 콘솔에 출력
    public void printInfo() {
        System.out.println("🦁 아기사자 정보를 출력합니다.");
        System.out.println(
                "👤 이름: " + name +
                        " | 🎓 전공: " + major +
                        " | 📌 기수: " + generation
        );
    }
}