package io.toolisticon.byoct.jpa.namedentitygraphprocessor;

/**
 * Messages used by the {@link NamedEntityGraphProcessor}.
 */
public enum NamedEntityGraphProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedEntityGraphProcessorMessages(final String code, final String message) {
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
        NamedEntityGraphProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
