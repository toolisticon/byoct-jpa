package io.toolisticon.byoct.jpa.mappedsuperclassprocessor;

/**
 * Messages used by the {@link MappedSuperclassProcessor}.
 */
public enum MappedSuperclassProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private MappedSuperclassProcessorMessages(final String code, final String message) {
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
        MappedSuperclassProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
