public class test {
    public static void main(String[] args) {
        String[] str = {"flower", "flight", "flow"};
        char[] charArray = new char[str.length];
        String extractedStr = "" , newStr = "", minimumLengthWord = str[0];
        for(int i = 1; i < str.length; i++) {
            if(minimumLengthWord.length() > str[i].length()) {
                minimumLengthWord = str[i];
            }
        }
        for(int i =0; i< minimumLengthWord.length(); i++) {
            int flag = 0;
            for(int j = 0; j < str.length; j++) {
                extractedStr = str[j];
                charArray[j] = extractedStr.charAt(i);
            }
            for(int k = 1; k < charArray.length; k++) {
                char character = charArray[0];
                if (character != charArray[k]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                newStr += charArray[0];
            }
        }
        System.out.println(newStr);
    }
}
