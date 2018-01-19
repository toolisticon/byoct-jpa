package io.toolisticon.byoct.jpa.jointableprocessor;

/**
 * Messages used by the {@link JoinTableProcessor}.
 */
public enum JoinTableProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private JoinTableProcessorMessages(final String code, final String message) {
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
        JoinTableProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
