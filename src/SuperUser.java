public class SuperUser extends User{

    private int[] privileges;

    SuperUser(String username, int age, int grade, int[] privileges){
        super(username, age, grade);
        this.privileges = privileges;
    }

    public String getprivileges(){
        String result = "";
        for (int privilege : privileges) {
            result += Integer.toString(privilege) + ',';
        }
        return result;
    }
}
