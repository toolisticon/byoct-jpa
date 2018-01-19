package io.toolisticon.byoct.jpa.convertsprocessor;

/**
 * Messages used by the {@link ConvertsProcessor}.
 */
public enum ConvertsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ConvertsProcessorMessages(final String code, final String message) {
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
        ConvertsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
