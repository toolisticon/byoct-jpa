package io.toolisticon.byoct.jpa.postloadprocessor;

/**
 * Messages used by the {@link PostLoadProcessor}.
 */
public enum PostLoadProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PostLoadProcessorMessages(final String code, final String message) {
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
        PostLoadProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
