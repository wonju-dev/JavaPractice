public class main {
    public static void main(String args[]) {
        User user = (User) new SuperUser();
        SuperUser superUser = new SuperUser(); // no Error : 자손 타입의 참조 변수가, 조상 타입의 참조변수가 가리키는 자손 타입 인스턴스를 가리키고 있음

        user.method();
        superUser.method();
        System.out.println(user.id);
        System.out.println(superUser.id);
    }
}
