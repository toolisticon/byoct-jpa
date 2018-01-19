package io.toolisticon.byoct.jpa.prepersistprocessor;

/**
 * Messages used by the {@link PrePersistProcessor}.
 */
public enum PrePersistProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private PrePersistProcessorMessages(final String code, final String message) {
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
        PrePersistProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
