package io.toolisticon.byoct.jpa.persistencecontextsprocessor;

/**
 * Messages used by the {@link PersistenceContextsProcessor}.
 */
public enum PersistenceContextsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PersistenceContextsProcessorMessages(final String code, final String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return (printMessageCodes ? "[" + this.code + "] : " : "") + this.message;
    }

    public static void setPrintMessageCodes(final boolean printMessageCodes) {
        PersistenceContextsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
