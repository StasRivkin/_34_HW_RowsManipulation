package telran.infra;

import telran.interfaces.Action;

import java.lang.reflect.Method;

public class Execute {
    public static final String PACKAGE = "telran.model.";
    public static void execute(String fileFrom, String fileTo, String actionName) {
        try {
            Class<?> clazz = Class.forName(PACKAGE + actionName);
            Action action = (Action) clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("action", String.class, String.class)
                    .invoke(action, fileFrom, fileTo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
