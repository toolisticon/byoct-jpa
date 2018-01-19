package io.toolisticon.byoct.jpa.postupdateprocessor;

/**
 * Messages used by the {@link PostUpdateProcessor}.
 */
public enum PostUpdateProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PostUpdateProcessorMessages(final String code, final String message) {
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
        PostUpdateProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
