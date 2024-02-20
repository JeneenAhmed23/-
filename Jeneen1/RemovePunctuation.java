public class RemovePunctuation {
    public static void main(String[] args) {
        String string = "Let’s try, Mike!";
        String  result= removePunctuation(string);
        System.out.println(string);
        System.out.println(result);
    }
    public static String removePunctuation(String string) {
        StringBuilder w = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                w.append(c);
            }
        }
        return w.toString();
    }
}
