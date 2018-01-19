package io.toolisticon.byoct.jpa.discriminatorcolumnprocessor;

/**
 * Messages used by the {@link DiscriminatorColumnProcessor}.
 */
public enum DiscriminatorColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private DiscriminatorColumnProcessorMessages(final String code, final String message) {
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
        DiscriminatorColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
