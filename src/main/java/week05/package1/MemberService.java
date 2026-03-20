package week05.package1;

// 멤버 관련 비즈니스 로직을 처리하는 역할
// 중복 확인 후 멤버 등록, 이름으로 검색, 전체 멤버 조회 기능

import week05.role.Role;

import java.util.List;

// [문제점] Repository를 직접 생성하고 있다 (강한 결합)
// Repository 구현체를 바꾸려면 이 코드를 수정해야 한다
// 테스트할 때 가짜 저장소로 교체하기 어렵다
public class MemberService {
    // 문제: Repository를 직접 생성 (강한 결합)
    private MemberRespository respository = new MemberRespository();

    // 중복 확인 후 멤버 등록
    public boolean register(Role member) {
        if (respository.existsByName(member.getName())) {
            return false;
        }
        respository.save(member);
        return true;
    }

    // 이름으로 검색
    public Role searchByName(String name){
        return respository.findByName(name);
    }

    // 전체 멤버 조회
    public List<Role> getAllMembers() {
        return respository.findAll();
    }

    public boolean isEmpty() {
        return respository.findAll().isEmpty();
    }
}
