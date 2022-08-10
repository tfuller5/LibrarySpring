import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //int[] alternative = {1, 2, 3, 4, 5};
        // public class subclass extends java.lang.String  {
        //}

        Integer x = 5;

        String m = "m";
        String letterI = "i";
        String n = "n";
        String a = "a";
        String l = "l";

        // class: ArrayList and String
        ArrayList<String> words = new ArrayList();
        Object myob = new Object();
        System.out.println(">>>> " + words.getClass().getDeclaredMethods());
        System.out.println(">>>> " + words.getClass().getSuperclass().getDeclaredFields());

        System.out.println(">>>> " + words.getClass().getSuperclass().getSuperclass());
        System.out.println(">>>> " + words.getClass().getSuperclass().getSuperclass().getSuperclass());
        System.out.println(">>>> " + words.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass());


        words.add(m);
        words.add(letterI);
        words.add(n);
        words.add(a);
        words.add(l);

        //homework 10th aug
        //look at declare methods - same as below
        //look at getDeclaredFields - same as below
        //look at Objects (baseline)


        // class: StringBuilder
        StringBuilder buildme = new StringBuilder();

        // class: System
        System.out.println(buildme);
        System.out.println("##############");
        String minal = "minal";
        System.out.println(minal.charAt(-1));

        for (int i = 0; i < 5; i--) {
            // string called minal
            // backwards
            // m should go to l
            System.out.println("The for loop is repeating "+ i);
            System.out.println("String builder: " + buildme.append(words.get(i)));
            //System.out.println("Regular System Out 1: " + words.get(i));
            System.out.println("Regular System Out 2: " + words.get(i));

        }
        System.out.println(buildme.appendCodePoint(1));





        // StringBuilder is a class
        // StringBuilder has a method called append, which takes a string argument!








        String name = "minal";

        String readClass = name.getClass().getName();
        System.out.println(readClass);


        System.out.println(buildme.getClass().getName());
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(Arrays.toString(array));
    }
}
