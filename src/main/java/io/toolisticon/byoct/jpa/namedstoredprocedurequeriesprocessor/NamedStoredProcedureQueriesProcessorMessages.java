package io.toolisticon.byoct.jpa.namedstoredprocedurequeriesprocessor;

/**
 * Messages used by the {@link NamedStoredProcedureQueriesProcessorProcessor}.
 */
public enum NamedStoredProcedureQueriesProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private NamedStoredProcedureQueriesProcessorMessages(String code, String message) {
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
