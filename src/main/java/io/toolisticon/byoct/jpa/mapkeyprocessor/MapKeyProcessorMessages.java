package io.toolisticon.byoct.jpa.mapkeyprocessor;

/**
 * Messages used by the {@link MapKeyProcessor}.
 */
public enum MapKeyProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyProcessorMessages(final String code, final String message) {
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
        MapKeyProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
