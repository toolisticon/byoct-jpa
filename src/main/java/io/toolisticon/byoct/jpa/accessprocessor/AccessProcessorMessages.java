package io.toolisticon.byoct.jpa.accessprocessor;

/**
 * Messages used by the {@link AccessProcessor}.
 */
public enum AccessProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private AccessProcessorMessages(final String code, final String message) {
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
        AccessProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
