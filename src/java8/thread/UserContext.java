package java8.thread;

/**
 * Created by liufengfang on 2019/1/24.
 */
public class UserContext {
    public static final ThreadLocal<User> user = ThreadLocal.withInitial(User :: new);
    private ThreadLocal<User> u = new ThreadLocal<>();
    public User getU(){
        if (null == u.get()) {
            User temp = new User();
            return temp;
        }
        return u.get();
    }

    private void setUser(User user1){
        u.set(user1);
    }

}
