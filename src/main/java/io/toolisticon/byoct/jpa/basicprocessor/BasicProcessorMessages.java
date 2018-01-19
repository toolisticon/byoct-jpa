package io.toolisticon.byoct.jpa.basicprocessor;

/**
 * Messages used by the {@link BasicProcessor}.
 */
public enum BasicProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private BasicProcessorMessages(final String code, final String message) {
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
        BasicProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
