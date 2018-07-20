package io.toolisticon.byoct.jpa.entityprocessor;

/**
 * Messages used by the {@link EntityProcessor}.
 */
public enum EntityProcessorMessages {

    ERROR_NAME_MUST_NOT_BE_RESERVED_IDENTIFIER("ENTITY_ERROR_001", "Entity name attribute value (\"${0}\") must not be reserved identifier of JPQL.");

    private static boolean printMessageCodes;
    private final String code;
    private final String message;

    private EntityProcessorMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return (printMessageCodes ? "[" + this.code + "] : " : "") + this.message;
    }

    public static void setPrintMessageCodes(boolean printMessageCodes) {
        EntityProcessorMessages.printMessageCodes = printMessageCodes;
    }

    static {
        printMessageCodes = false;
    }

}
