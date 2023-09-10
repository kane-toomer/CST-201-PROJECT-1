public class Driver {
    public static void main(String[] args) {
        // MyString Objects
        System.out.println("");
        MyString str1 = new MyString("This was a lot of typing.");
        MyString str2 = new MyString("My hands are starting to hurt.");
        MyString str3 = new MyString("I hope I do not get carpal tunnel.");
        System.out.println("MyString Objects: ");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("");

        // Test for length()
        System.out.println("length() Method: ");
        System.out.println("str1 length: " + str1.length());
        System.out.println("str2 length: " + str2.length());
        System.out.println("str3 length: " + str3.length());
        System.out.println("");

        // Test for toString()
        System.out.println("toString() Method: ");
        System.out.println("str1: " + str1.toString());
        System.out.println("str2: " + str2.toString());
        System.out.println("str3: " + str3.toString());
        System.out.println("");

        // Test for concat()
        System.out.println("concat() Method: ");
        MyString concatenated = str1.concat(str2);
        System.out.println("Concatenated: " + concatenated.toString());
        System.out.println("");

        // Test for equals()
        System.out.println("equals() Method: ");
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str2 equals str3: " + str2.equals(str3));
        System.out.println("");

        // Test for compareTo()
        System.out.println("compareTo() Method: ");
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str2 compareTo str3: " + str2.compareTo(str3));
        System.out.println("");

        // Test for get()
        System.out.println("get() Method: ");
        System.out.println("Character at index 2 in str1: " + str1.get(2));
        System.out.println("Character at index 6 in str2: " + str2.get(6));
        System.out.println("Character at index 9 in str3: " + str3.get(9));
        System.out.println("");

        // Test for toUpper() and toLower()
        System.out.println("toUpper() and toLower() Methods: ");
        System.out.println("str1 toUpper: " + str1.toUpper().toString());
        System.out.println("str1 toLower: " + str1.toLower().toString());
        System.out.println("");
        System.out.println("str2 toUpper: " + str2.toUpper().toString());
        System.out.println("str2 toLower: " + str2.toLower().toString());
        System.out.println("");
        System.out.println("str3 toUpper: " + str3.toUpper().toString());
        System.out.println("str3 toLower: " + str3.toLower().toString());
        System.out.println("");

        // Test for substring()
        System.out.println("substring() Method: ");
        System.out.println("Substring of str1 from index 1: " + str1.substring(1).toString());
        System.out.println("Substring of str1 from index 1 to 3: " + str1.substring(1, 3).toString());
        System.out.println("");
        System.out.println("Substring of str2 from index 1: " + str2.substring(1).toString());
        System.out.println("Substring of str2 from index 1 to 3: " + str2.substring(1, 3).toString());
        System.out.println("");
        System.out.println("Substring of str3 from index 1: " + str3.substring(1).toString());
        System.out.println("Substring of str3 from index 1 to 3: " + str3.substring(1, 3).toString());
        System.out.println("");

        // Test for indexOf() and lastIndexOf()
        System.out.println("indexOf() and lastIndexOf() Methods: ");
        MyString searchString = new MyString("i");
        System.out.println("Index of 'i' in str1: " + str1.indexOf(searchString));
        System.out.println("Last index of 'i' in str1: " + str1.lastIndexOf(searchString));
        System.out.println("");
    }
}
