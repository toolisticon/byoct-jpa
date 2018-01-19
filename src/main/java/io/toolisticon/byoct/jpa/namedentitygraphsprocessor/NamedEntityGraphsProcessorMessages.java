package io.toolisticon.byoct.jpa.namedentitygraphsprocessor;

/**
 * Messages used by the {@link NamedEntityGraphsProcessor}.
 */
public enum NamedEntityGraphsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedEntityGraphsProcessorMessages(final String code, final String message) {
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
        NamedEntityGraphsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
