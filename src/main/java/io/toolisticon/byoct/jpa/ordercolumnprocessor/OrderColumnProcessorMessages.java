package io.toolisticon.byoct.jpa.ordercolumnprocessor;

/**
 * Messages used by the {@link OrderColumnProcessor}.
 */
public enum OrderColumnProcessorMessages {

    ;

    private static boolean printMessageCodes = false;
    private final String code;
    private final String message;

    private OrderColumnProcessorMessages(final String code, final String message) {
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
        OrderColumnProcessorMessages.printMessageCodes = printMessageCodes;
    }

}
