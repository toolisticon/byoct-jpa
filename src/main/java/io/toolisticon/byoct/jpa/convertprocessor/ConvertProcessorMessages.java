package io.toolisticon.byoct.jpa.convertprocessor;

/**
 * Messages used by the {@link ConvertProcessor}.
 */
public enum ConvertProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ConvertProcessorMessages(final String code, final String message) {
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
        ConvertProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
