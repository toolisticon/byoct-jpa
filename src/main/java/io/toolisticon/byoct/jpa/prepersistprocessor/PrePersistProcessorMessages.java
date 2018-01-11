package io.toolisticon.byoct.jpa.prepersistprocessor;

/**
 * Messages used by the {@link PrePersistProcessorProcessor}.
 */
public enum PrePersistProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private PrePersistProcessorMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return (printMessageCodes ? "[" + this.code + "] : " : "") + this.message;
    }

    public static void setPrintMessageCodes(boolean printMessageCodes) {
        printMessageCodes = printMessageCodes;
    }

    static {
        printMessageCodes = false;
    }

}
