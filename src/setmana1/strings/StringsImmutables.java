package setmana1.strings;

public class StringsImmutables {

    public static void main(String[] args) {
        //explicació 1
        String s = "abc";
        String ss = s;
        s = s.concat("def"); //s -----> [] "abcdef"
        s = s.toUpperCase(); //s -----> [] "ABCDEFG"
        s = s.toLowerCase(); //s -----> [] "abcdef"
        s = s.replace('a','e'); //s ---> [] "ebbcdef"

        //explicació 2
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1 == s2);

        String s3 = "java";
        String s4 = "java";
        System.out.println(s3 == s4);

        String s5 = "JDK";
        String s6 = new String("JDK");
        System.out.println(s5 == s6);


    }

}
