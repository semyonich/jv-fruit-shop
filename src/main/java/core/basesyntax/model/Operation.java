package core.basesyntax.model;

public enum Operation {
    BALANCE("b"),
    SUPPLY("s"),
    PURCHASE("p"),
    RETURN("r");

    private String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public static Operation fromString(String operation) {
        for (Operation item : Operation.values()) {
            if (item.operation.equalsIgnoreCase(operation)) {
                return item;
            }
        }
        throw new IllegalArgumentException("No constant with operation \""
                + operation + "\" found");
    }
}