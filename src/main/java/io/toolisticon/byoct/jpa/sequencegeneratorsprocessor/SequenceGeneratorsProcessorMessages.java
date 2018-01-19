package io.toolisticon.byoct.jpa.sequencegeneratorsprocessor;

/**
 * Messages used by the {@link SequenceGeneratorsProcessor}.
 */
public enum SequenceGeneratorsProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SequenceGeneratorsProcessorMessages(final String code, final String message) {
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
        SequenceGeneratorsProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
