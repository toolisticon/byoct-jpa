package io.toolisticon.byoct.jpa.manytomanyprocessor;

/**
 * Messages used by the {@link ManyToManyProcessor}.
 */
public enum ManyToManyProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ManyToManyProcessorMessages(final String code, final String message) {
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
        ManyToManyProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
