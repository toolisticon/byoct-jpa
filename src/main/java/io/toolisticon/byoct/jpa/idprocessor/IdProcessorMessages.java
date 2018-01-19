package io.toolisticon.byoct.jpa.idprocessor;

/**
 * Messages used by the {@link IdProcessor}.
 */
public enum IdProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private IdProcessorMessages(final String code, final String message) {
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
        IdProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
