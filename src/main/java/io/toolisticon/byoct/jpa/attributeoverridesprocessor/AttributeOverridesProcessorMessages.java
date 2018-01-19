package io.toolisticon.byoct.jpa.attributeoverridesprocessor;

/**
 * Messages used by the {@link AttributeOverridesProcessor}.
 */
public enum AttributeOverridesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private AttributeOverridesProcessorMessages(final String code, final String message) {
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
        AttributeOverridesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
