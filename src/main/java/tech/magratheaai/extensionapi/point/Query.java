package tech.magratheaai.extensionapi.point;

/**
 * @author NikitaBolshakov
 * @version 1.0
 */
public interface Query<U,T> {
    T execute(U source);
}
