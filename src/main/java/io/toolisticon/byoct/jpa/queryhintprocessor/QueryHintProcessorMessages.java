package io.toolisticon.byoct.jpa.queryhintprocessor;

/**
 * Messages used by the {@link QueryHintProcessor}.
 */
public enum QueryHintProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private QueryHintProcessorMessages(final String code, final String message) {
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
        QueryHintProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
