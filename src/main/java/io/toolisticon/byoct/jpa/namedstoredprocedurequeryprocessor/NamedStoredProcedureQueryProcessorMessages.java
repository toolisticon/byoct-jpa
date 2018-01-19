package io.toolisticon.byoct.jpa.namedstoredprocedurequeryprocessor;

/**
 * Messages used by the {@link NamedStoredProcedureQueryProcessor}.
 */
public enum NamedStoredProcedureQueryProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedStoredProcedureQueryProcessorMessages(final String code, final String message) {
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
        NamedStoredProcedureQueryProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
