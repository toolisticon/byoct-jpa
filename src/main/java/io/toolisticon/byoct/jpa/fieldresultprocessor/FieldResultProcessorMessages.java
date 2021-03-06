package io.toolisticon.byoct.jpa.fieldresultprocessor;

/**
 * Messages used by the {@link FieldResultProcessor}.
 */
public enum FieldResultProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private FieldResultProcessorMessages(final String code, final String message) {
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
        FieldResultProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
