package tech.magratheaai.extensionapi.update.object;

import com.google.common.base.Defaults;
import lombok.Builder;
import lombok.Singular;


import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
@Builder(toBuilder = true)
public final class Update implements tech.magratheaai.extensionapi.update.Update {
    @Singular("add")
    private final Map<String, Object> updateInfo;

    protected Update(Map<String, Object> updateInfo)
    {
        this.updateInfo = updateInfo;
    }

    @Override
    public Map<String, Object> getUpdateInfo() {
        return updateInfo;
    }

    @Override
    public <T extends Serializable> T getObjectByTag(String tag, Class<T> clazz) {
        if(clazz == null) return null;
        Object obj = updateInfo.get(tag);
        boolean b = clazz.isInstance(obj);
        return b ? ((T) obj) : Defaults.defaultValue(clazz);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Update update = (Update) o;
        return Objects.equals(updateInfo, update.updateInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateInfo);
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateInfo=" + updateInfo +
                '}';
    }
}
