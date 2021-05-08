import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo02 {
    public static void main(String[] args) {


        LinkedList<Object> list01 = new LinkedList<>(); //数组列表
        // 1 增加
        list01.add("zhengsan");
        list01.add("lisi");
        list01.add("wangwu");
        System.out.println(list01);
        // 2 删除
        list01.remove(1);
        System.out.println(list01);
        // 3 修改
        list01.set(1,"xiaowu");
        System.out.println(list01);
        // 4 查询
        for (Object L : list01){
            System.out.println(L + "\t");
        }
        //  5 求长度
        System.out.println(list01.size());
       /* // 6 清空
        list01.clear();
        System.out.println(list01.size());
        System.out.println(list01.isEmpty());
        */
        // 7 addALL()
        ArrayList<Object> list02 = new ArrayList<>();
        list02.add(111);
        list02.add(222);
        list01.addAll(1,list02);
        System.out.println(list01);

        //将数据 111 添加到list 的末尾5


    }

}
