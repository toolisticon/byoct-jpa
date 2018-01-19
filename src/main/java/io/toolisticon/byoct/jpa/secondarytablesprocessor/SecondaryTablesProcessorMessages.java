package io.toolisticon.byoct.jpa.secondarytablesprocessor;

/**
 * Messages used by the {@link SecondaryTablesProcessor}.
 */
public enum SecondaryTablesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SecondaryTablesProcessorMessages(final String code, final String message) {
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
        SecondaryTablesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
