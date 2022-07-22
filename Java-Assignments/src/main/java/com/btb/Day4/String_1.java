package com.btb.Day4;

//import org.apache.commons.lang3.ObjectUtils;

public class String_1 {
    public static void main(String[] args) {
        String str1 = "HCL";
        String str2 = "hcl";
        System.out.println(str1 == str2);   //case sensitive
        System.out.println(str1.equalsIgnoreCase(str2));    //ignore case sensitivity

        String str3 = new String("HCL");
        System.out.println(str1 == str3);

        String str4 = new String("HCL");
        System.out.println(str3.equals(str4));

        String str5 = "This is a test.";
        char[] c1 = str5.toCharArray();
        String str6 = "";
        str6 = str6.copyValueOf(c1, 0, 10);
        System.out.println(str6);
        str6 = str6.concat(" HCL.");
        System.out.println(str6);

        for (char c : c1){
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println(str5.replace(" ", "--"));

        String str7 = String.join(" ", "3", "2", "1","BOOM!");
        System.out.println(str7);
    }
}
