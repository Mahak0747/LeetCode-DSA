class Solution {
    public String multiply(String num1, String num2) {
        // If either number is "0", the result is "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] result = new int[num1.length() + num2.length()];

        // Start multiplying from the back of each string
        for (int i = num1.length() - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';

            for (int j = num2.length() - 1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';

                int sum = n1 * n2 + result[i + j + 1];

                result[i + j + 1] = sum % 10; // current digit
                result[i + j] += sum / 10;    // carry to the left digit
            }
        }

        // Convert the result array to a string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
