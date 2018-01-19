package io.toolisticon.byoct.jpa.tableprocessor;

/**
 * Messages used by the {@link TableProcessor}.
 */
public enum TableProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private TableProcessorMessages(final String code, final String message) {
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
        TableProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
