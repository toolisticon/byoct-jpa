package io.toolisticon.byoct.jpa.joincolumnprocessor;

/**
 * Messages used by the {@link JoinColumnProcessor}.
 */
public enum JoinColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private JoinColumnProcessorMessages(final String code, final String message) {
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
        JoinColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
