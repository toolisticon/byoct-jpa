package io.toolisticon.byoct.jpa.mapkeycolumnprocessor;

/**
 * Messages used by the {@link MapKeyColumnProcessor}.
 */
public enum MapKeyColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyColumnProcessorMessages(final String code, final String message) {
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
        MapKeyColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
