package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {

        if (input == null || input.length() == 0) {
            return -1;
        }

        String numbers = input
                .replaceAll("[^\\d]", " ")
                .trim()
                .replaceAll(" +", "");

        if (numbers.length() == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < numbers.length(); i++) {
            String num = numbers.substring(i, i + 1);
            sum += Integer.parseInt(num);
        }

        return sum;
    }

}
