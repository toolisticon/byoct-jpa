package io.toolisticon.byoct.jpa.constructorresultprocessor;

/**
 * Messages used by the {@link ConstructorResultProcessor}.
 */
public enum ConstructorResultProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ConstructorResultProcessorMessages(final String code, final String message) {
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
        ConstructorResultProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
