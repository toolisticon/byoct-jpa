package io.toolisticon.byoct.jpa.primarykeyjoincolumnprocessor;

/**
 * Messages used by the {@link PrimaryKeyJoinColumnProcessor}.
 */
public enum PrimaryKeyJoinColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PrimaryKeyJoinColumnProcessorMessages(final String code, final String message) {
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
        PrimaryKeyJoinColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
