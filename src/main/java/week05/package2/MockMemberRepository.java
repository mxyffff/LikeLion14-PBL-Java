package week05.package2;

// 테스트/데모용 Mock 저장소
// 항상 고정된 더미 데이터를 반환한다.
// 실제 저장은 하지 않는다.

import week05.role.Lion;
import week05.role.Role;

import java.util.ArrayList;
import java.util.List;

// [학습 포인트]
// Main에서 MemoryMemberRepository 대신 이 클래스로 교체하면,
// Service 코드는 전혀 수정하지 않아도 동작이 달라진다.
// → 이것이 인터페이스 기반 설계와 DI의 장점!
public class MockMemberRepository implements MemberRepository{
    private List<Role> dummyMembers;

    public MockMemberRepository() {
        dummyMembers = new ArrayList<>();
        dummyMembers.add(new Lion("이다겸", "디지털미디어학과", 13, "백엔드", "운영진"));
        dummyMembers.add(new Lion("김다겸", "디지털미디어학과", 14, "백엔드", "2022111266"));
        dummyMembers.add(new Lion("박다겸", "디지털미디어학과", 14, "백엔드", "2023111266"));
        System.out.println("🧪 [Mock] 더미 데이터 " + dummyMembers.size() + "개가 준비되었습니다.");
    }

    @Override
    public void save(Role member) {
        System.out.println("🧪 [Mock] 저장 요청됨 (실제 저장 안 함): " + member.getName());
    }

    @Override
    public Role findByName(String name) {
        for (Role member : dummyMembers) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public List<Role> findAll() {
        return dummyMembers;
    }

    @Override
    public boolean existsByName(String name) {
        for (Role member : dummyMembers) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
