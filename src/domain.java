public class domain {
    private String username;
    private Integer password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public domain(String username, Integer password) {
        this.username = username;
        this.password = password;
    }
}
