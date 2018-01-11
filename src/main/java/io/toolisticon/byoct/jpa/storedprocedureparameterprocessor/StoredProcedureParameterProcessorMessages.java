package io.toolisticon.byoct.jpa.storedprocedureparameterprocessor;

/**
 * Messages used by the {@link StoredProcedureParameterProcessorProcessor}.
 */
public enum StoredProcedureParameterProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private StoredProcedureParameterProcessorMessages(String code, String message) {
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
