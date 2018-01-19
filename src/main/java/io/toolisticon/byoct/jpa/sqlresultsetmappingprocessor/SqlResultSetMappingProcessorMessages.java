package io.toolisticon.byoct.jpa.sqlresultsetmappingprocessor;

/**
 * Messages used by the {@link SqlResultSetMappingProcessor}.
 */
public enum SqlResultSetMappingProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SqlResultSetMappingProcessorMessages(final String code, final String message) {
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
        SqlResultSetMappingProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
