package org.jianzhichun.model.spi;

import java.util.*;

/**
 * @author : zao
 * @date 2020/7/19 14:50
 */
public class Spi {

    public static final Formula FORMULA = getService(Formula.class);
    public static final Http HTTP = getService(Http.class);
    public static final Json JSON = getService(Json.class);

    private static <T> T getService(Class<T> clazz) {
        Iterator<T> iterator = ServiceLoader.load(clazz).iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        } else {
            return null;
        }
    }
}
