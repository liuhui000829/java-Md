package liuhui.com.高级特性.集合;

import java.util.LinkedList;
/**
 * LinkedList
 * @author Thinkpad
 * 增
 * 		addFirst()
 * 		addLast()
 * 删
 * 		removeFirst()
 * 		removeLast()
 * 查	getFirst()
 *  * 	getLast()
 *
 */

public class TestLinkList {
    public static void main(String[] args) {
        LinkedList petList = new LinkedList();

        petList.add(new Pet("二哈1",3));
        petList.add(new Pet("二哈2",3));
        petList.add(new Pet("二哈3",3));
        petList.add(1);
        petList.add(2);


        // 在头部添加一个
       /* petList.addFirst(new Pet("二哈4",3));*/

       /* System.out.println("获取第一个"+petList.getFirst());
        System.out.println("获取最后一个"+petList.getLast());
        System.out.println("删除第一个"+petList.removeFirst());
        System.out.println("删除最后一个"+petList.removeLast());*/

        // lambda表达式
        petList.forEach(System.out::println);
    }
}
