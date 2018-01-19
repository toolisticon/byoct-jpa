package io.toolisticon.byoct.jpa.generatedvalueprocessor;

/**
 * Messages used by the {@link GeneratedValueProcessor}.
 */
public enum GeneratedValueProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private GeneratedValueProcessorMessages(final String code, final String message) {
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
        GeneratedValueProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
