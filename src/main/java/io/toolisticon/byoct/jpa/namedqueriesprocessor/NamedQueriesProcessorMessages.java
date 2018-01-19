package io.toolisticon.byoct.jpa.namedqueriesprocessor;

/**
 * Messages used by the {@link NamedQueriesProcessor}.
 */
public enum NamedQueriesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedQueriesProcessorMessages(final String code, final String message) {
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
        NamedQueriesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
