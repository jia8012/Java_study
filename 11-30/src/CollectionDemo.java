import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());   //0
        System.out.println(list.isEmpty());   //true
        list.add("我");
        list.add("爱");
        list.add("你");
        list.add("Java");
        System.out.println(list.size());    //4
        System.out.println(list.isEmpty());   //false
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));    //[我,爱,你,Java]
        for (String s: list) {
            System.out.println(s);
        }
        list.remove("你");
        for (String s : list) {
            System.out.println(s);
        }
        list.clear();   //清空元素
        System.out.println(list.size());  //0
        System.out.println(list.isEmpty());   //true


    }
}
