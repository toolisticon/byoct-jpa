package io.toolisticon.byoct.jpa.namedstoredprocedurequeriesprocessor;

/**
 * Messages used by the {@link NamedStoredProcedureQueriesProcessor}.
 */
public enum NamedStoredProcedureQueriesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedStoredProcedureQueriesProcessorMessages(final String code, final String message) {
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
        NamedStoredProcedureQueriesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
