package io.toolisticon.byoct.jpa.lobprocessor;

/**
 * Messages used by the {@link LobProcessor}.
 */
public enum LobProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private LobProcessorMessages(final String code, final String message) {
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
        LobProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
