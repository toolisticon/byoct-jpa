package io.toolisticon.byoct.jpa.namedqueryprocessor;

/**
 * Messages used by the {@link NamedQueryProcessor}.
 */
public enum NamedQueryProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedQueryProcessorMessages(final String code, final String message) {
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
        NamedQueryProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
