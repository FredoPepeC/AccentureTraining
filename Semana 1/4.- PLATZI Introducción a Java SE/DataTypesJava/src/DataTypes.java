public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.567567567;
        float nF = 123.456F;

        var salary = 1000; // INT
        var pension = salary * 0.03; // DOUBLE
        var totalSalary = salary - pension; // DOUBLE
        System.out.println(totalSalary);

    }
}
