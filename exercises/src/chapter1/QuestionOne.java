package chapter1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description 如果不缺内存，如何使用一个具有库的语言来实现一种排序算法
 * @Author huangxiao
 * @Date 2022-11-27
 */
public class QuestionOne {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println("排序前：" + arrayList);
        Collections.sort(arrayList);
        System.out.println("排序后：" + arrayList);
    }
}
