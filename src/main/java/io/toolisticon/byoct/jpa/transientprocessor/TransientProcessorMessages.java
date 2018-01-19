package io.toolisticon.byoct.jpa.transientprocessor;

/**
 * Messages used by the {@link TransientProcessor}.
 */
public enum TransientProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private TransientProcessorMessages(final String code, final String message) {
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
        TransientProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
