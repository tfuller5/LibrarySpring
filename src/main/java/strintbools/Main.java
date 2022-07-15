package strintbools;

public class Main {
    public static void main(String[] args) {
        String tryconvert = "242345";
        int this_is_an_integer = 2342;
        boolean sdlijfslkdf = true;

        // STRING -> INT
        int parsed = Integer.parseInt(tryconvert);
        // INT -> STRING
        String this_is_a_string = Integer.toString(this_is_an_integer);
        //System.out.println(this_is_a_string);

        StrIntBool strIntBool = new StrIntBool("apple", 100, true);


        String result =  strIntBool.toString();
        System.out.println(result);


        StrIntBool strIntBool1 = new StrIntBool("banana", 90, true);

        // abananae, 95,

        strIntBool.addAChosenWordAndAppend(strIntBool1);
    }
}
