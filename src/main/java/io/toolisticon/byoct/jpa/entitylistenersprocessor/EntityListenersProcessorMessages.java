package io.toolisticon.byoct.jpa.entitylistenersprocessor;

/**
 * Messages used by the {@link EntityListenersProcessorProcessor}.
 */
public enum EntityListenersProcessorMessages {

    ;

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private EntityListenersProcessorMessages(String code, String message) {
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
