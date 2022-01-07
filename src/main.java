public class main {
    public static void main(String args[]) {
        User user = (User) new SuperUser("a",1,2,new int[]{1,2,3});
        SuperUser superUser = (SuperUser) user;
        // user.getPrivileges(); Error
        System.out.println(superUser.getPrivileges());
    }
}
