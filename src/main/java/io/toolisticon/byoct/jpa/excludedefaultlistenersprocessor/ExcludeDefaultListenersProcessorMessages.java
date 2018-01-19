package io.toolisticon.byoct.jpa.excludedefaultlistenersprocessor;

/**
 * Messages used by the {@link ExcludeDefaultListenersProcessor}.
 */
public enum ExcludeDefaultListenersProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ExcludeDefaultListenersProcessorMessages(final String code, final String message) {
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
        ExcludeDefaultListenersProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
