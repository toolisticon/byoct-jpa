package io.toolisticon.byoct.jpa.namedattributenodeprocessor;

/**
 * Messages used by the {@link NamedAttributeNodeProcessor}.
 */
public enum NamedAttributeNodeProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private NamedAttributeNodeProcessorMessages(final String code, final String message) {
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
        NamedAttributeNodeProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
