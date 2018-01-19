package io.toolisticon.byoct.jpa.mapkeyclassprocessor;

/**
 * Messages used by the {@link MapKeyClassProcessor}.
 */
public enum MapKeyClassProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyClassProcessorMessages(final String code, final String message) {
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
        MapKeyClassProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
