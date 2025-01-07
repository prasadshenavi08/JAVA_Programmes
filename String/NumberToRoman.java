public class NumberToRoman {
    public static void roman(int no) {
        // 1=I, 5=V, 10=X, 50=L, 100=C, 500=D, 1000=M
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        String[] symbols = {"M", "D", "C", "L", "X", "V", "I"};
        StringBuilder romanNumeral = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (no >= values[i]) {
                romanNumeral.append(symbols[i]);
                no -= values[i];
            }
        }
        System.out.println("Roman numeral: " + romanNumeral.toString());
    }

    public static void main(String[] args) {
        int no = 95;
        roman(no);
    }
}
