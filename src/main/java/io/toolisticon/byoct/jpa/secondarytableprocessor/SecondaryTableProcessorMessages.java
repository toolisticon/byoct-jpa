package io.toolisticon.byoct.jpa.secondarytableprocessor;

/**
 * Messages used by the {@link SecondaryTableProcessor}.
 */
public enum SecondaryTableProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SecondaryTableProcessorMessages(final String code, final String message) {
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
        SecondaryTableProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
