package io.toolisticon.byoct.jpa.mapkeytemporalprocessor;

/**
 * Messages used by the {@link MapKeyTemporalProcessor}.
 */
public enum MapKeyTemporalProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapKeyTemporalProcessorMessages(final String code, final String message) {
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
        MapKeyTemporalProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
