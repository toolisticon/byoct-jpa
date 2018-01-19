package io.toolisticon.byoct.jpa.entityresultprocessor;

/**
 * Messages used by the {@link EntityResultProcessor}.
 */
public enum EntityResultProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EntityResultProcessorMessages(final String code, final String message) {
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
        EntityResultProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
