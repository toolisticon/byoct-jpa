package io.toolisticon.byoct.jpa.namedsubgraphprocessor;

/**
 * Messages used by the {@link NamedSubgraphProcessor}.
 */
public enum NamedSubgraphProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedSubgraphProcessorMessages(final String code, final String message) {
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
        NamedSubgraphProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
