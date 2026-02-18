package week02.package1;

public class Lion {
    public String name;
    String major; // default
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public static boolean isValid(String name, String major, String g) {
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

        return isValidate;
    }

    public void printInfo() {
        System.out.println("아기사자 정보를 출력합니다.");
        System.out.println(
                "이름: " + name + ", 전공: " + major + ", 기수: " + generation
        );
    }
}
