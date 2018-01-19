package io.toolisticon.byoct.jpa.collectiontableprocessor;

/**
 * Messages used by the {@link CollectionTableProcessor}.
 */
public enum CollectionTableProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private CollectionTableProcessorMessages(final String code, final String message) {
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
        CollectionTableProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
