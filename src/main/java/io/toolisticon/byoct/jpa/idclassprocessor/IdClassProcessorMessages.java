package io.toolisticon.byoct.jpa.idclassprocessor;

/**
 * Messages used by the {@link IdClassProcessor}.
 */
public enum IdClassProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private IdClassProcessorMessages(final String code, final String message) {
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
        IdClassProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
