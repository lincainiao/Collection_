import java.util.Locale;

public class Test02 {
    public static void main(String[] args) {
        String s1 = "AbBcCcd";
        String s2 = "kdjkghowf";
        Test02 t = new Test02();
        s2 = t.longestNiceSubstring(s1);
        System.out.println(s2);
    }

    public String longestNiceSubstring(String s) {
        if (s.length()<2 ) return "";
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int upper = 0;
            int lower = 0;
            for(int j = i;j<s.length();j++){
                //转换为整数形式
                char c = s.charAt(j);
                if (Character.isUpperCase(c)) upper |= 1 << s.charAt(j)-'A' ;
                else lower |= 1 << s.charAt(j)-'a';
                if (upper == lower && j-i+1 > maxLen){
                    start = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(start,maxLen+start);
    }

}
