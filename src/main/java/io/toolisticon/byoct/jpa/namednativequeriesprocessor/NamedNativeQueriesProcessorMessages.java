package io.toolisticon.byoct.jpa.namednativequeriesprocessor;

/**
 * Messages used by the {@link NamedNativeQueriesProcessor}.
 */
public enum NamedNativeQueriesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedNativeQueriesProcessorMessages(final String code, final String message) {
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
        NamedNativeQueriesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
