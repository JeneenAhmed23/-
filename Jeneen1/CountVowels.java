public class CountVowels {
    public static void main(String[] args) {

        String s = "Welcome";
        int vowelCount = countVowels(s);
        System.out.println(vowelCount);
    }

    public static int countVowels(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }

        return count;
    }
}
