public class Casting {
    public static void main(String[] args) {
        int dogsQuantity = 30;
        double monthlyDogs = dogsQuantity / 12.0;
// monthlyDogs: 2.5 (pero no es posible, ¡no rescatamos medio perrito!)

        int estimatedMonthlyDogs = (int) monthlyDogs;
// estimatedMonthlyDogs: 2

// Recuerda que el casteo no redondea, solo quita los decimales:
        Math.sqrt(3); // 1.7320508075688772

    }
}
