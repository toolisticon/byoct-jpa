package io.toolisticon.byoct.jpa.discriminatorvalueprocessor;

/**
 * Messages used by the {@link DiscriminatorValueProcessor}.
 */
public enum DiscriminatorValueProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private DiscriminatorValueProcessorMessages(final String code, final String message) {
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
        DiscriminatorValueProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
