package io.toolisticon.byoct.jpa.columnprocessor;

/**
 * Messages used by the {@link ColumnProcessor}.
 */
public enum ColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ColumnProcessorMessages(final String code, final String message) {
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
        ColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
