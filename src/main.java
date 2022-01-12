public class main {

    public static void main(String args[]) {
        System.out.println(Gender.MALE.getExpectedLife(10));
        System.out.println(Gender.FEMALE.getExpectedLife(12));
    }
}
enum Gender {
    MALE(10){
        @Override
        int getExpectedLife(int workload) {
            return 2 * this.getBASE_LIFE_EXPECTANCY() * workload;
        }
    }, FEMALE(2) {
        @Override
        int getExpectedLife(int workload) {
            return 3 * this.getBASE_LIFE_EXPECTANCY() * workload;
        }
    };

    private final int BASE_LIFE_EXPECTANCY;
    Gender(int value) {this.BASE_LIFE_EXPECTANCY = value;}
    public int getBASE_LIFE_EXPECTANCY() { return this.BASE_LIFE_EXPECTANCY; }
    abstract int getExpectedLife(int workload);
}
