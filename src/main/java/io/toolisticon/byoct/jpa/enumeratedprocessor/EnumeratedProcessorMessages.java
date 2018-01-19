package io.toolisticon.byoct.jpa.enumeratedprocessor;

/**
 * Messages used by the {@link EnumeratedProcessor}.
 */
public enum EnumeratedProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EnumeratedProcessorMessages(final String code, final String message) {
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
        EnumeratedProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
