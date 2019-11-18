import java.util.ArrayList;

public class UserArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(100);
        list.add("hello");
        list.add(0,"world");
        System.out.println(list);
        String s0 = list.get(0);
        System.out.println(s0);
        list.set(0,"Bit");
        System.out.println(list);

    }
}
