package io.toolisticon.byoct.jpa.converterprocessor;

/**
 * Messages used by the {@link ConverterProcessor}.
 */
public enum ConverterProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ConverterProcessorMessages(final String code, final String message) {
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
        ConverterProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
