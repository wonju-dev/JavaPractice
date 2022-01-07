public class main {
    public static void main(String args[]) {
        User myUser = new User("wonju", 25, 0);
        SuperUser mySuperUser = new SuperUser("wonju2", 20, 1, new int[] {1,2,3,4});
        User polyUser = new SuperUser("wonju3", 15, 0, new int[]{5,6,7,8});

        System.out.println(myUser.getAge());
        System.out.println(mySuperUser.getprivileges());
        // System.out.println(polyUser.getprivileges());
    }
}
