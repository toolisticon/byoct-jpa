package io.toolisticon.byoct.jpa.attributeoverrideprocessor;

/**
 * Messages used by the {@link AttributeOverrideProcessor}.
 */
public enum AttributeOverrideProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private AttributeOverrideProcessorMessages(final String code, final String message) {
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
        AttributeOverrideProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
