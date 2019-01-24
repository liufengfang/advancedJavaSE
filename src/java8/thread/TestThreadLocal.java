package java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liufengfang on 2019/1/24.
 */
public class TestThreadLocal {
    public static void main(String[] args) {
//        t1();
        t2();
    }

    private static void t1() {
        ThreadLocal<User> user = UserContext.user;

        Runnable task1 = ()-> templetCode(user,"task1");

        Runnable task2 = ()->templetCode(user,"2ksat");

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(task1);
        executor.execute(task2);
    }

    private static void t2() {
        UserContext uc = new UserContext();

        Runnable task1 = ()->{
            User user = uc.getU();
            for (int i = 0; i < 100; i++) {
                int t = user.getCount();
                t++;
                user.setCount(t);
                System.out.println("task1:" + user.getCount());
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = ()->{
            User user = uc.getU();
            for (int i = 0; i < 100; i++) {
                int t = user.getCount();
                t++;
                user.setCount(t);
                System.out.println("2ksat:" + user.getCount());
            }
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(task1);
        executor.execute(task2);
    }

    private static void templetCode(ThreadLocal<User> user,String taskName){
        for (int i = 0; i < 100; i++) {
            int t = user.get().getCount();
            t++;
            user.get().setCount(t);
            System.out.println(taskName + ":" + user.get().getCount());
        }
    }
}
