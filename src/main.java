public class main {
    public static void main(String args[]) {
        User user = (User) new SuperUser();
        SuperUser superUser = (SuperUser) user; // no Error : 자손 타입의 참조 변수가, 조상 타입의 참조변수가 가리키는 자손 타입 인스턴스를 가리키고 있음
        SuperUser errorUser = (SuperUser) new User(); // error : 자손 타입의 참조 변수가, 조상 타입의 인스턴스를 가리키고 있음
    }
}
