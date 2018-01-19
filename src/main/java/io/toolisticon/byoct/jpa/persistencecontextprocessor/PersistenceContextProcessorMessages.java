package io.toolisticon.byoct.jpa.persistencecontextprocessor;

/**
 * Messages used by the {@link PersistenceContextProcessor}.
 */
public enum PersistenceContextProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PersistenceContextProcessorMessages(final String code, final String message) {
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
        PersistenceContextProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
