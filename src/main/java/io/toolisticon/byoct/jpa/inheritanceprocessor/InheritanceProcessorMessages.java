package io.toolisticon.byoct.jpa.inheritanceprocessor;

/**
 * Messages used by the {@link InheritanceProcessor}.
 */
public enum InheritanceProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private InheritanceProcessorMessages(final String code, final String message) {
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
        InheritanceProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
