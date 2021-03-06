package io.toolisticon.byoct.jpa.embeddedidprocessor;

/**
 * Messages used by the {@link EmbeddedIdProcessor}.
 */
public enum EmbeddedIdProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EmbeddedIdProcessorMessages(final String code, final String message) {
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
        EmbeddedIdProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
