package io.toolisticon.byoct.jpa.preupdateprocessor;

/**
 * Messages used by the {@link PreUpdateProcessor}.
 */
public enum PreUpdateProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PreUpdateProcessorMessages(final String code, final String message) {
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
        PreUpdateProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
