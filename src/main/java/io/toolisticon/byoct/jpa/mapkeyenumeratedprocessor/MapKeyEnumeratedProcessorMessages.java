package io.toolisticon.byoct.jpa.mapkeyenumeratedprocessor;

/**
 * Messages used by the {@link MapKeyEnumeratedProcessor}.
 */
public enum MapKeyEnumeratedProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyEnumeratedProcessorMessages(final String code, final String message) {
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
        MapKeyEnumeratedProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
