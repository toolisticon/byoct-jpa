package io.toolisticon.byoct.jpa.onetomanyprocessor;

/**
 * Messages used by the {@link OneToManyProcessor}.
 */
public enum OneToManyProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private OneToManyProcessorMessages(final String code, final String message) {
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
        OneToManyProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
