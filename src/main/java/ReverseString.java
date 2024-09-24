public class ReverseString {
    public  String reversString(String string){
        String reverseString  = "";
        if (string == null){
            return null;
        }
        for (int i = string.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }
}
