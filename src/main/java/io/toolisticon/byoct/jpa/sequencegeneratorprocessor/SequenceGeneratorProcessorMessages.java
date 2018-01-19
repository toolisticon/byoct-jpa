package io.toolisticon.byoct.jpa.sequencegeneratorprocessor;

/**
 * Messages used by the {@link SequenceGeneratorProcessor}.
 */
public enum SequenceGeneratorProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private SequenceGeneratorProcessorMessages(final String code, final String message) {
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
        SequenceGeneratorProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
