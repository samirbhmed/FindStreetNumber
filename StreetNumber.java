public class StreetNumber {
    public static void main(String[] args) {
        System.out.println(findStreetNumber("Avenue Bourguiba 90"));
    }

    private static int findStreetNumber(String value) {
        value = value.trim();
        int j = -1;
        if (isNumber(value.charAt(0))) {
            j = 0;
            while (isNumber(value.charAt(j))) {
                j++;
            }
            return Integer.parseInt(value.substring(0, j));
        } else if (isNumber(value.charAt(value.length() - 1))) {
            j = value.length() - 2;
            while (isNumber(value.charAt(j))) {
                j--;
            }
            return Integer.parseInt(value.substring(j + 1, value.length()));
        }
        return j;
    }

    private static boolean isNumber(char c) {
        return (int) c >= 48 && (int) c <= 58;
    }
}