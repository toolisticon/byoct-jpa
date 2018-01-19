package io.toolisticon.byoct.jpa.mapkeyjoincolumnsprocessor;

/**
 * Messages used by the {@link MapKeyJoinColumnsProcessor}.
 */
public enum MapKeyJoinColumnsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyJoinColumnsProcessorMessages(final String code, final String message) {
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
        MapKeyJoinColumnsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
