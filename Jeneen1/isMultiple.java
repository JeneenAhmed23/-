public class isMultiple {
        public static void main(String[] args) {
            long n = 17;
            long m = 4;

            boolean isNMultipleOfM = isMultiple(n, m);
            System.out.println( isNMultipleOfM);
        }

        public static boolean isMultiple(long n, long m) {
            if (n % m==0) {
                return true;
            }

            return false;
        }
    }


