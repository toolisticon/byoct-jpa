package io.toolisticon.byoct.jpa.sqlresultsetmappingsprocessor;

/**
 * Messages used by the {@link SqlResultSetMappingsProcessor}.
 */
public enum SqlResultSetMappingsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SqlResultSetMappingsProcessorMessages(final String code, final String message) {
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
        SqlResultSetMappingsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
