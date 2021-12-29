package liuhui.com.oop.抽象类和接口;

public class Usb implements UsbDisk,UsbInterface {
    //默认链接状态
    private boolean isConnect = false;


    @Override
    public void connect() {
        isConnect = true;
        System.out.println("连接成功");
    }

    @Override
    public String getData(int index) {
        if(!isConnect){
            System.out.println("优盘没有连接");
            return null;
        }
        return DISK_DATA[index];

    }

    @Override
    public void setData(String data) {
        if(!isConnect){
            System.out.println("优盘没有连接");
            return;
        }
        for (int i = 0; i < DISK_DATA.length; i++) {
            if(DISK_DATA[i]==null){
                DISK_DATA[i]=data;
                System.out.println("文件保存成功");
                return;
            }
        }
        System.out.println("文件磁盘已满");

    }
}

