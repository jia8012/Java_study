public class JavacSmart {
    public static void main(String[] args) {
        String s = "hello";
        s += " ";
        s += "world";
        System.out.println(s);

        String s1 = "abc";
        String s2 = "bbc";
        String s3 = "abcd";
        String s4 = "一";
        String s5 = "二";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.compareTo(s5));
    }
}
