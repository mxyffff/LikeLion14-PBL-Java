package week05.package1;

import week05.role.Role;

import java.util.ArrayList;
import java.util.List;

// 멤버 데이터를 저장하고 조회하는 역할
// 멤버 저장, 이름으로 검색, 전체 조회, 이름 중복 확인 기능
public class MemberRespository {
    private List<Role> members = new ArrayList<>();

    // 저장
    public void save(Role member) {
        members.add(member);
    }

    // 이름으로 검색
    public Role findByName(String name) {
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    // 전체 조회
    public List<Role> findAll() {
        return members;
    }

    // 이름 중복 확인
    public boolean existsByName(String name) {
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
