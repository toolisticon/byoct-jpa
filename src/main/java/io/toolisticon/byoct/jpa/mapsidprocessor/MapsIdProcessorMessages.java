package io.toolisticon.byoct.jpa.mapsidprocessor;

/**
 * Messages used by the {@link MapsIdProcessor}.
 */
public enum MapsIdProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MapsIdProcessorMessages(final String code, final String message) {
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
        MapsIdProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
