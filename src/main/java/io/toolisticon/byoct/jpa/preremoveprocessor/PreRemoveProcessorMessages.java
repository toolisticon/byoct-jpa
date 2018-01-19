package io.toolisticon.byoct.jpa.preremoveprocessor;

/**
 * Messages used by the {@link PreRemoveProcessor}.
 */
public enum PreRemoveProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PreRemoveProcessorMessages(final String code, final String message) {
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
        PreRemoveProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
