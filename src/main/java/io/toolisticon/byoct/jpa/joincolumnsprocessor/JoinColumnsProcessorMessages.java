package io.toolisticon.byoct.jpa.joincolumnsprocessor;

/**
 * Messages used by the {@link JoinColumnsProcessor}.
 */
public enum JoinColumnsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private JoinColumnsProcessorMessages(final String code, final String message) {
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
        JoinColumnsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
