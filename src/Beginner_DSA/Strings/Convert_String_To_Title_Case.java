package Beginner_DSA.Strings;

public class Convert_String_To_Title_Case {
    public static void method(String S){
        String[] array = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String string : array){
            if(allUpperCase(string)){
                stringBuilder.append(string).append(" ");
            }else{
                stringBuilder.append(firstLetterUpperCase(string)).append(" ");
            }
        }
        System.out.println(stringBuilder.toString().trim());
    }

    public static boolean allUpperCase(String string){
        for(int i = 0; i < string.length(); i++){
            if(!Character.isUpperCase(string.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static String firstLetterUpperCase(String string){
        return Character.toUpperCase(string.charAt(0)) +
                string.substring(1).toLowerCase();
    }
}
