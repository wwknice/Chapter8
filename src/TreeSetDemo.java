import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("地理");
        set.add("历史");
        set.add("asdd");
        set.add("ASDD");
        System.out.println(set);
        //set.clear();
        System.out.println(set.pollFirst());
        System.out.println(set);
    }
}
