package Beginner_DSA.Strings;

//Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        scanner.nextLine();
//        while(t-- > 0){
//            String S = scanner.nextLine();
//            method(S);
//        }
public class Add_One {
    public static void method(String string){
            StringBuilder sb = new StringBuilder(string);
            for(int i = string.length() - 1; i >= 0; i--) {
                int digit = string.charAt(i) - '0';
                if(digit < 9) {
                    sb.setCharAt(i, (char) (digit + 1 + '0'));
                    break;
                }else {
                    sb.setCharAt(i, '0');
                    if (i == 0) {
                        sb.insert(0, '1');
                    }
                }
            }
        System.out.println(sb);
    }
}
