package io.toolisticon.byoct.jpa.persistenceunitprocessor;

/**
 * Messages used by the {@link PersistenceUnitProcessor}.
 */
public enum PersistenceUnitProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PersistenceUnitProcessorMessages(final String code, final String message) {
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
        PersistenceUnitProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
