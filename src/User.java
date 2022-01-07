public class User {
    private String username;
    private int age;
    private int grade;

    User(){
        this("no name", 0, 0);
    }

    User(String username, int age, int grade){
        this.username =username;
        this.age = age;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
}
