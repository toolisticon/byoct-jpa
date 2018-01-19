package io.toolisticon.byoct.jpa.mapkeyjoincolumnprocessor;

/**
 * Messages used by the {@link MapKeyJoinColumnProcessor}.
 */
public enum MapKeyJoinColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyJoinColumnProcessorMessages(final String code, final String message) {
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
        MapKeyJoinColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
