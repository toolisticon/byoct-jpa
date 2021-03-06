package io.toolisticon.byoct.jpa.entitylistenersprocessor;

/**
 * Messages used by the {@link EntityListenersProcessor}.
 */
public enum EntityListenersProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EntityListenersProcessorMessages(final String code, final String message) {
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
        EntityListenersProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
