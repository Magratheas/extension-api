package tech.magratheaai.extensionapi;

import tech.magratheaai.extensionapi.update.object.Update;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public abstract class InputDataHolder implements Serializable {
    public <T extends InputDataHolder> T translateTo(Class<? extends InputDataHolder> obj)
    {
        Update u = this.toUpdate();
        try {
            InputDataHolder a = obj.getDeclaredConstructor().newInstance();
            InputDataHolder b  = a.fromUpdate(u);
            return (T) b;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public abstract Update toUpdate();
    public abstract InputDataHolder fromUpdate(Update update);
}
