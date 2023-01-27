public class Functions {

    /**
     * Descripción: Esta función calcula el área de un circulo con un valor
     *
     * @param radio Es la longitud adimensional del radio
     * @return devuelve el área del círculo
     * */
    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
    }
}
