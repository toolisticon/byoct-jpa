package io.toolisticon.byoct.jpa.postremoveprocessor;

/**
 * Messages used by the {@link PostRemoveProcessor}.
 */
public enum PostRemoveProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PostRemoveProcessorMessages(final String code, final String message) {
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
        PostRemoveProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
