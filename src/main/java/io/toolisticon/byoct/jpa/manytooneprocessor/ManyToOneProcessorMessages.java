package io.toolisticon.byoct.jpa.manytooneprocessor;

/**
 * Messages used by the {@link ManyToOneProcessor}.
 */
public enum ManyToOneProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ManyToOneProcessorMessages(final String code, final String message) {
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
        ManyToOneProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
