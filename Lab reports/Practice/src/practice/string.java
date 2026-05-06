public class string {
    public static void main(String[] args)
    {
        String s1="Anish";
        String s2="Gautam";
        String s3="anish";
        String s4="  gautam";
        String s5=s3+s4;
        String s6="";
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.concat(s2));
        System.out.println(s5);
        System.out.println(s5.isEmpty());
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(3));
        
    }
}
