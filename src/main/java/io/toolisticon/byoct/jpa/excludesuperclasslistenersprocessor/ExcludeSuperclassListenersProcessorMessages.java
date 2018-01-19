package io.toolisticon.byoct.jpa.excludesuperclasslistenersprocessor;

/**
 * Messages used by the {@link ExcludeSuperclassListenersProcessor}.
 */
public enum ExcludeSuperclassListenersProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ExcludeSuperclassListenersProcessorMessages(final String code, final String message) {
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
        ExcludeSuperclassListenersProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
