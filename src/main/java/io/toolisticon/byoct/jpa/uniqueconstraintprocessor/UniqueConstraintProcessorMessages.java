package io.toolisticon.byoct.jpa.uniqueconstraintprocessor;

/**
 * Messages used by the {@link UniqueConstraintProcessor}.
 */
public enum UniqueConstraintProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private UniqueConstraintProcessorMessages(final String code, final String message) {
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
        UniqueConstraintProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
