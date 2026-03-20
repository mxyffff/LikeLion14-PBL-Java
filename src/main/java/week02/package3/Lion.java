package week02.package3;

public class Lion {
    public String name;
    String major; // default
    private int generation;

    public Lion(String name, String major, int generation) {
        if (name == null || name.isEmpty()) {
            System.out.println("❌ 이름은 비어 있을 수 없습니다. 객체 생성이 취소됩니다.");
            return;
        }

        if (major == null || major.isEmpty()) {
            System.out.println("❌ 전공은 비어 있을 수 없습니다. 객체 생성이 취소됩니다.");
            return;
        }

        if (generation <= 0) {
            System.out.println("❌ 기수는 1 이상이어야 합니다. 객체 생성이 취소됩니다.");
            return;
        }

        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public void printInfo() {
        System.out.println("아기사자 정보를 출력합니다.");
        System.out.println(
                "이름: " + name + ", 전공: " + major + ", 기수: " + generation
        );
    }

    public void changeName(String newName) {
        System.out.println("이름 변경 요청을 받았습니다.");

        if (newName == null || newName.isEmpty()) {
            System.out.println("이름은 비어 있을 수 없습니다. 변경이 취소됩니다.");
            return;
        }

        this.name = newName;
        System.out.println("이름이 성공적으로 변경되었습니다.");
    }
    public void changeMajor(String newMajor) {
        System.out.println("전공 변경 요청을 받았습니다.");

        if (newMajor == null || newMajor.isEmpty()) {
            System.out.println("전공은 비어 있을 수 없습니다. 변경이 취소됩니다.");
            return;
        }

        this.major = newMajor;
        System.out.println("전공이 성공적으로 변경되었습니다.");
    }
    public void changeGeneration(int newGeneration) {
        System.out.println("기수 변경 요청을 받았습니다.");

        if (newGeneration <= 0) {
            System.out.println("기수는 1 이상이어야 합니다. 변경이 취소됩니다.");
            return;
        }

        this.generation = newGeneration;
        System.out.println("기수가 성공적으로 변경되었습니다.");
    }

}
