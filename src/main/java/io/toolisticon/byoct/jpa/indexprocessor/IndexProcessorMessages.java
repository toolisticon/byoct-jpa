package io.toolisticon.byoct.jpa.indexprocessor;

/**
 * Messages used by the {@link IndexProcessor}.
 */
public enum IndexProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private IndexProcessorMessages(final String code, final String message) {
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
        IndexProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
