package Beginner_DSA.Strings;

public class DNA_Storage {
    public static String method(int n, String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i = i + 2){
            String substring = s.substring(i, i + 2);
            switch (substring) {
                case "00":
                    stringBuilder.append("A");
                    break;
                case "01":
                    stringBuilder.append("T");
                    break;
                case "10":
                    stringBuilder.append("C");
                    break;
                case "11":
                    stringBuilder.append("G");
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }
}
