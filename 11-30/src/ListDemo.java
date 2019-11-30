import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("Java SE");
        list.add("Java Web");
        list.add("Java EE");

        //添加元素
        list.add("C");

        //按照添加顺序打印
        System.out.println(list);

        System.out.println("---------------------------");
        list.remove(3);
        System.out.println(list);

        //类似数组下标访问
        System.out.println(list.get(0));

        System.out.println(list);

        list.set(0,"C++");
        System.out.println(list);

        //截取部分
        List<String> subList = list.subList(1,3);
        System.out.println(subList);

        System.out.println("-------------------");
        //重新构造
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list2);

        List<String> list3 = new LinkedList<>(list);
        System.out.println(list3);

        //引用的转换
        ArrayList<String> list4 = (ArrayList<String>)list2;
        System.out.println(list4);

        LinkedList<String> list5 = (LinkedList<String>)list3;
        System.out.println(list5);

    }
}
