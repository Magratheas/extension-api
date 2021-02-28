package tech.magratheaai.extensionapi;



import tech.magratheaai.extensionapi.update.object.Update;

import java.lang.reflect.InvocationTargetException;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public abstract class ModuleInputContextObject {
    public <T extends ModuleInputContextObject> T translateTo(Class<? extends ModuleInputContextObject> obj)
    {
        Update u = this.toUpdate();
        try {
            ModuleInputContextObject a = obj.getDeclaredConstructor().newInstance();
            ModuleInputContextObject b  = a.fromUpdate(u);
            return (T) b;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public abstract Update toUpdate();
    public abstract ModuleInputContextObject fromUpdate(Update update);
}
