package io.toolisticon.byoct.jpa.namednativequeryprocessor;

/**
 * Messages used by the {@link NamedNativeQueryProcessor}.
 */
public enum NamedNativeQueryProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedNativeQueryProcessorMessages(final String code, final String message) {
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
        NamedNativeQueryProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
