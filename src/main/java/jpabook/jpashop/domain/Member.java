package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded //내장타입을 포함했다.
    private Address address;

    @OneToMany(mappedBy = "member") // 난 매핑된 거울이야. order 테이블의 member에서 ,,
    private List<Order> orders = new ArrayList<>();

}
