package io.toolisticon.byoct.jpa.associationoverridesprocessor;

/**
 * Messages used by the {@link AssociationOverridesProcessor}.
 */
public enum AssociationOverridesProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private AssociationOverridesProcessorMessages(final String code, final String message) {
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
        AssociationOverridesProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
