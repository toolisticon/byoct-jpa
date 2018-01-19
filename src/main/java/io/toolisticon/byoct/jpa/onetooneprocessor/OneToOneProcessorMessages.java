package io.toolisticon.byoct.jpa.onetooneprocessor;

/**
 * Messages used by the {@link OneToOneProcessor}.
 */
public enum OneToOneProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private OneToOneProcessorMessages(final String code, final String message) {
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
        OneToOneProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
