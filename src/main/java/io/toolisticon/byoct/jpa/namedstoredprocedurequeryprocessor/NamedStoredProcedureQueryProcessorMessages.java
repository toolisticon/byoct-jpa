package io.toolisticon.byoct.jpa.namedstoredprocedurequeryprocessor;

/**
 * Messages used by the {@link NamedStoredProcedureQueryProcessorProcessor}.
 */
public enum NamedStoredProcedureQueryProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private NamedStoredProcedureQueryProcessorMessages(String code, String message) {
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
