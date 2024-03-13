package nextstep.member.domain;

import nextstep.auth.application.UserDetails;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Member implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String password;
    private Integer age;

    public Member() {
    }

    public Member(String email, String password, Integer age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public void update(Member member) {
        this.email = member.email;
        this.password = member.password;
        this.age = member.age;
    }

    @Override
    public String getMemberEmail() {
        return email;
    }

    @Override
    public boolean isEqualPassword(String password) {
        return Objects.equals(this.password, password);
    }
}
