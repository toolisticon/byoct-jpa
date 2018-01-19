package io.toolisticon.byoct.jpa.versionprocessor;

/**
 * Messages used by the {@link VersionProcessor}.
 */
public enum VersionProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private VersionProcessorMessages(final String code, final String message) {
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
        VersionProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
