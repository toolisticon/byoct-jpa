package io.toolisticon.byoct.jpa.primarykeyjoincolumnsprocessor;

/**
 * Messages used by the {@link PrimaryKeyJoinColumnsProcessor}.
 */
public enum PrimaryKeyJoinColumnsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PrimaryKeyJoinColumnsProcessorMessages(final String code, final String message) {
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
        PrimaryKeyJoinColumnsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
