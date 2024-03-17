package nextstep.auth.application;

import java.util.Objects;

public class LoginMember implements UserDetails {
    private String email;
    private String password;

    public LoginMember(String email) {
        this.email = email;
    }

    public LoginMember(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public boolean isEqualPassword(String password) {
        return Objects.equals(this.password, password);
    }
}
