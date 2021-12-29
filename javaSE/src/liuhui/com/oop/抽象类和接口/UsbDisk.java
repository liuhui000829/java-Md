package liuhui.com.oop.抽象类和接口;

public interface UsbDisk {
    /**
     * 存放数据的数组
     */
    String [] DISK_DATA = new String[10];

    /**
     * 根据数据下标获取数据
     * @param index 下标
     * @return
     */
    String getData(int index);

    /**
     * 找到空闲的位置存放数据
     * @param data
     */
    void setData(String data);
}
