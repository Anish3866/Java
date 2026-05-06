public class L8Q3 {

    public static void main(String args[]) {

        String s1 = "HelloWorld";
        String s2 = "helloworld";
        
        System.out.println("Character extraction function:-");
        System.out.println("charAt(4): " + s1.charAt(4));

        char ch[] = new char[5];
        s1.getChars(0,5,ch,0);
        System.out.println("getChars(): " + new String(ch));

        char arr[] = s1.toCharArray();
        System.out.println("toCharArray(): " + arr[0]);

        System.out.println("\nString comparision function:-");
        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo(): " + s1.compareTo(s2));

        System.out.println("\nModifying string function:-");
        System.out.println("substring(0,5): " + s1.substring(0,5));
        System.out.println("concat(): " + s1.concat(" Java"));
        System.out.println("replace(): " + s1.replace('o','a'));

    }
}