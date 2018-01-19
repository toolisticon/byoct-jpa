package io.toolisticon.byoct.jpa.embeddableprocessor;

/**
 * Messages used by the {@link EmbeddableProcessor}.
 */
public enum EmbeddableProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private EmbeddableProcessorMessages(final String code, final String message) {
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
        EmbeddableProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
