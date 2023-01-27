public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
            System.out.println(fileSended);

        } else {
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth, puta");
            System.out.println(fileSended);
        }
    }
}
