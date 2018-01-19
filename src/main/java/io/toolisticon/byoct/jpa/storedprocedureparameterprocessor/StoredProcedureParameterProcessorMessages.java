package io.toolisticon.byoct.jpa.storedprocedureparameterprocessor;

/**
 * Messages used by the {@link StoredProcedureParameterProcessor}.
 */
public enum StoredProcedureParameterProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private StoredProcedureParameterProcessorMessages(final String code, final String message) {
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
        StoredProcedureParameterProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
