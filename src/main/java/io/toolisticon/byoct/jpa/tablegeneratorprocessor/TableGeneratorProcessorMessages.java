package io.toolisticon.byoct.jpa.tablegeneratorprocessor;

/**
 * Messages used by the {@link TableGeneratorProcessor}.
 */
public enum TableGeneratorProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private TableGeneratorProcessorMessages(final String code, final String message) {
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
        TableGeneratorProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
