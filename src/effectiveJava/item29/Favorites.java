package effectiveJava.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liufengfang on 2018/7/28.
 */
public class Favorites {
    private Map<Class<?>, Object> collectionMap = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (null == type) {
            throw new NullPointerException("Type is null");
        }
        collectionMap.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(collectionMap.get(type));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "abc");
        favorites.putFavorite(Integer.class, 0xcafebabe);
        favorites.putFavorite(Class.class, Favorites.class);

        String str = favorites.getFavorite(String.class);
        Integer integer = favorites.getFavorite(Integer.class);
        Class<?> favoriteClass = favorites.getFavorite(Class.class);

//        System.out.println(favorites.getFavorite(Class.class).getName());
        System.out.println(favoriteClass.getName());

        System.out.printf("%s,%x,%s%n",str,integer,favoriteClass);
    }
}
