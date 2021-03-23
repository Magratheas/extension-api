package tech.magratheaai.extensionapi.interaction;

import tech.magratheaai.extensionapi.point.UserInteractionContext;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Service for interaction between extension and UserInteractionContext
 * @author NikitaBolshakov
 * @version 1.0
 */
public final class InteractionService {
    private final List<UserInteractionContext> contexts = new CopyOnWriteArrayList<>();
    private volatile boolean flag = false;

    /**
     * Singleton holder
     */
    private static class InteractionServiceHolder{
        public static final InteractionService interactionService = new InteractionService();
    }

    /**
     * @return InteractionService instance
     */
    public static InteractionService getInstance(){
        return InteractionServiceHolder.interactionService;
    }

    /**
     * @return List of all interaction contexts
     */
    public List<UserInteractionContext> getContexts() {
        return contexts;
    }

    public void addContext(UserInteractionContext context){
        if(!flag)
            contexts.add(context);
        else
            throw new IllegalArgumentException("It is not possible to change the interaction service.");
    }

    public void makeImmutable(){
        flag = true;
    }
}
