public class main {
    public static void main(String args[]) {
        SuperUser superUser = new SuperUser("a",1,2,new int[]{1,2,3});
        User user = superUser;
        SuperUser newSuperUser = (SuperUser) user;
        System.out.println(newSuperUser.getprivileges());
    }
}
