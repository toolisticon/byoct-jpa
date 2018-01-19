package io.toolisticon.byoct.jpa.tablegeneratorsprocessor;

/**
 * Messages used by the {@link TableGeneratorsProcessor}.
 */
public enum TableGeneratorsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private TableGeneratorsProcessorMessages(final String code, final String message) {
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
        TableGeneratorsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
