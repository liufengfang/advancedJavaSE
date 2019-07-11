package designPatterns.proxyPattern;

/**
 *  ��̬����
 * Created by liufengfang on 2019/7/11.
 */
public class StaticProxy {

    public static void main(String[] args) {
        AdminProxy ap = new AdminProxy(new Admin());
        ap.doSomething();

        AdminProxy2 ap2 = new AdminProxy2();
        ap2.doSomething();
    }
}

interface Manager {
    void doSomething();
}

class Admin implements Manager{

    @Override
    public void doSomething() {
        System.out.println("����Admin����doSomething��");
    }

}

class AdminProxy implements Manager{

    Admin admin;

    public AdminProxy(Admin admin){
        this.admin = admin;
    }

    @Override
    public void doSomething() {
        System.out.println("----��ʼ��----");
        admin.doSomething();
        System.out.println("----������----");
    }

}

class AdminProxy2 extends Admin{

    @Override
    public void doSomething() {
        System.out.println("----2��ʼ��----");
        super.doSomething();
        System.out.println("----2������----");
    }

}