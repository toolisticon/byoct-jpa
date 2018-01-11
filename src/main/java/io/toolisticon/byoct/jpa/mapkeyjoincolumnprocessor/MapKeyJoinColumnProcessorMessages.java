package io.toolisticon.byoct.jpa.mapkeyjoincolumnprocessor;

/**
 * Messages used by the {@link MapKeyJoinColumnProcessorProcessor}.
 */
public enum MapKeyJoinColumnProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private MapKeyJoinColumnProcessorMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return (printMessageCodes ? "[" + this.code + "] : " : "") + this.message;
    }

    public static void setPrintMessageCodes(boolean printMessageCodes) {
        printMessageCodes = printMessageCodes;
    }

    static {
        printMessageCodes = false;
    }

}
