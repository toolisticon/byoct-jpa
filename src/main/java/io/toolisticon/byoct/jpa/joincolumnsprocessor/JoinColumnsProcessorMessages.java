package io.toolisticon.byoct.jpa.joincolumnsprocessor;

/**
 * Messages used by the {@link JoinColumnsProcessorProcessor}.
 */
public enum JoinColumnsProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private JoinColumnsProcessorMessages(String code, String message) {
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
