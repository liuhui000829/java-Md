package liuhui.com.高级特性.集合;


import java.util.Objects;

public class Pet2<D> implements Comparable<Pet2>{

    public String name;
    public int age;
    public D id;

    public Pet2(String name, int age, D id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Pet2() {

    }

    public D getId() {
        return id;
    }

    public void setId(D id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet2<?> pet2 = (Pet2<?>) o;
        return age == pet2.age && Objects.equals(name, pet2.name) && Objects.equals(id, pet2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public String toString() {
        return "Pet2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }


    /**
     * 使用当前对象和传入的对象进行比较，返回
     * 	负值  传入的对象大于当前对象
     * 	整值  传入的对象小于当前对象
     * 	0   传入的对象等于当前对象
     */
    @Override
    public int compareTo(Pet2 o) {
        if(this.age>o.getAge()) {
            return 1;
        }
        if(this.age<o.getAge()) {
            return -1;
        }

        //如果年龄相同，则比较名称字符串的大小
        return name.compareTo(o.getName());

    }





}

