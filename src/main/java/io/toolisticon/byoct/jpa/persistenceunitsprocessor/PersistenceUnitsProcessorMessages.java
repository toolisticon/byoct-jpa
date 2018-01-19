package io.toolisticon.byoct.jpa.persistenceunitsprocessor;

/**
 * Messages used by the {@link PersistenceUnitsProcessor}.
 */
public enum PersistenceUnitsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PersistenceUnitsProcessorMessages(final String code, final String message) {
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
        PersistenceUnitsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
