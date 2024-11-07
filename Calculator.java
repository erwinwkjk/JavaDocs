public class Calculator {

    /**
     * Menambahkan dua angka integer.
     *
     * @param firstNumber angka pertama untuk dijumlahkan
     * @param secondNumber angka kedua untuk dijumlahkan
     * @return hasil penjumlahan dari firstNumber dan secondNumber
     */
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Mengurangi angka kedua dari angka pertama.
     *
     * @param firstNumber angka yang akan dikurangi
     * @param secondNumber angka yang akan mengurangi
     * @return hasil pengurangan firstNumber dikurangi secondNumber
     */
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);

        System.out.println("Hasil Penjumlahan: " + sum);
        System.out.println("Hasil Pengurangan: " + difference);
    }
}
