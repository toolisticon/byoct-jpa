package io.toolisticon.byoct.jpa.temporalprocessor;

/**
 * Messages used by the {@link TemporalProcessor}.
 */
public enum TemporalProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private TemporalProcessorMessages(final String code, final String message) {
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
        TemporalProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
