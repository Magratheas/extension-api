package tech.magratheaai.extensionapi.interaction;

import tech.magratheaai.extensionapi.point.UserInteractionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for interaction between extension and UserInteractionContext
 * @author NikitaBolshakov
 * @version 1.0
 */
public final class InteractionService {
    private final List<UserInteractionContext> contexts = new ArrayList<>();

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
}
