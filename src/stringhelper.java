public class stringhelper {

    public static boolean isPalindrome(String text){

    return false;
}

public static int countLetters(String text, char search){

        char[] textArray = text.toCharArray();
        int count = 0;

    for (int i = 0; i < textArray.length; i++) {
        if (textArray[i]==search){
            count++;
    }
    }
    return -1;
    }
}
