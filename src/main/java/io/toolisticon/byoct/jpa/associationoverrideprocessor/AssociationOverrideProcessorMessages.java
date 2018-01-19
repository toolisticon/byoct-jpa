package io.toolisticon.byoct.jpa.associationoverrideprocessor;

/**
 * Messages used by the {@link AssociationOverrideProcessor}.
 */
public enum AssociationOverrideProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private AssociationOverrideProcessorMessages(final String code, final String message) {
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
        AssociationOverrideProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
