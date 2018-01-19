package io.toolisticon.byoct.jpa.elementcollectionprocessor;

/**
 * Messages used by the {@link ElementCollectionProcessor}.
 */
public enum ElementCollectionProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private ElementCollectionProcessorMessages(final String code, final String message) {
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
        ElementCollectionProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
