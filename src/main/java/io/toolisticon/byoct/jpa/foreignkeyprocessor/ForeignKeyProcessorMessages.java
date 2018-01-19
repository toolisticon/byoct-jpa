package io.toolisticon.byoct.jpa.foreignkeyprocessor;

/**
 * Messages used by the {@link ForeignKeyProcessor}.
 */
public enum ForeignKeyProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ForeignKeyProcessorMessages(final String code, final String message) {
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
        ForeignKeyProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
