package io.toolisticon.byoct.jpa.persistencepropertyprocessor;

/**
 * Messages used by the {@link PersistencePropertyProcessor}.
 */
public enum PersistencePropertyProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PersistencePropertyProcessorMessages(final String code, final String message) {
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
        PersistencePropertyProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
