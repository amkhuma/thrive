public class IsValidString
{
    public static String isValidStr(String str){
        int numOfOpeningBrackets = 0;
        int numOfClosingBrackets = 0;

        for (char temp : str.toCharArray()){
            if (temp == '{')
                numOfOpeningBrackets++;
            else if (temp == '}')
                numOfClosingBrackets++;
        }

        String isValidStr = numOfOpeningBrackets == numOfClosingBrackets ? "valid" : "invalid";
        return isValidStr;
    }

    public static void main(String[] args) {
        System.out.println(isValidStr("}{{}}}{}{}"));
        System.out.println(isValidStr("{{{}}}"));
        System.out.println(isValidStr("{{}}}{"));
    }
}