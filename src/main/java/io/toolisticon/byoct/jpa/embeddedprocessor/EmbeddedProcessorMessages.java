package io.toolisticon.byoct.jpa.embeddedprocessor;

/**
 * Messages used by the {@link EmbeddedProcessor}.
 */
public enum EmbeddedProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EmbeddedProcessorMessages(final String code, final String message) {
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
        EmbeddedProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
