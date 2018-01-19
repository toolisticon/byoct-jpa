package io.toolisticon.byoct.jpa.postpersistprocessor;

/**
 * Messages used by the {@link PostPersistProcessor}.
 */
public enum PostPersistProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PostPersistProcessorMessages(final String code, final String message) {
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
        PostPersistProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
