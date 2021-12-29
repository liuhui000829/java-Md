package liuhui.com.高级特性.集合;

import java.util.*;

// 泛型
public class constraintTest {
    public static void main(String[] args) {
        constraintCustomTest();
    }

    // 泛型的基本使用
    public static void constraintBasicUsage(){
        List<Pet> petList = new ArrayList<Pet>();
        petList.add(new Pet("二哈1", 2));
        petList.add(new Pet("二哈2", 3));
        petList.add(new Pet("二哈3", 4));

        petList.forEach(item -> {
            System.out.println("姓名是:" + item.getName() + "     年龄是:" + item.getAge());
        });

        Map<String, Pet> petListMap = new HashMap<String, Pet>();
        petListMap.put("001", new Pet("二哈1", 2));
        petListMap.put("002", new Pet("二哈1", 3));
        petListMap.put("003", new Pet("二哈1", 4));

        // lambda 表达式遍历
        petListMap.forEach((k, v) -> {
            System.out.println(k + " " + v.getName() + " " + v.getAge());
        });

        //泛型不能是基本数据类型
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.forEach(v -> {
            System.out.println(v);
        });
    }

    // 自定义泛型
    public static void constraintCustomTest() {
        // String 类型的泛型
        Pet2<String> pet1 = new Pet2<String>("泛型二哈5", 2, "001");
        Pet2<String> pet2 = new Pet2<String>("泛型二哈4", 2, "002");
        Pet2<String> pet3 = new Pet2<String>("泛型二哈3", 2, "003");


        // int 类型的泛型
        Pet2<Integer> pet4 = new Pet2<Integer>("泛型二哈2", 2, 111);
        Pet2<Integer> pet5 = new Pet2<Integer>("泛型二哈1", 2, 222);
        Pet2<Integer> pet6 = new Pet2<Integer>("泛型二哈0", 2, 333);



        ArrayList<Pet2> pet2ArrayList=new ArrayList<Pet2>();
        pet2ArrayList.add(pet1);
        pet2ArrayList.add(pet2);
        pet2ArrayList.add(pet3);

        pet2ArrayList.add(pet4);
        pet2ArrayList.add(pet5);
        pet2ArrayList.add(pet6);

        // 对象的排序
        Collections.sort(pet2ArrayList);

        pet2ArrayList.forEach(v->{
            System.out.println(v.getName()+" "+v.getAge()+" "+v.getId());
        });


    }
    /**
     * Collections 的常用方法
     * 	创建工具类
     * 		1.构造私有化
     * 		2.工具方法-全部静态
     *
     * @author Thinkpad
     *
     */
    public static void collectionsUtilTest(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        // System.out.println(Collections.min(arrayList));     // 1
        // System.out.println(Collections.max(arrayList));     // 5
        Collections.sort(arrayList);                           // 排序后为12345

        // 二叉查询
        Object obj= Collections.binarySearch(arrayList,3);
        System.out.println(obj);

        arrayList.forEach(System.out::println);




    }
}
