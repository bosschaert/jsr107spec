/**
 *  Copyright (c) 2011 Terracotta, Inc.
 *  Copyright (c) 2011 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */

package javax.cache.transaction;

import static java.sql.Connection.TRANSACTION_NONE;
import static java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;
import static java.sql.Connection.TRANSACTION_READ_COMMITTED;
import static java.sql.Connection.TRANSACTION_REPEATABLE_READ;
import static java.sql.Connection.TRANSACTION_SERIALIZABLE;


/**
 * An enum for the isolation levels. The enum values used are the constants from the java.sql.Connection package.
 * @author Greg Luck
 */
public enum IsolationLevel {

    /**
     * Isolation level
     */
    NONE(TRANSACTION_NONE),

    /**
     * Isolation level
     */
    READ_UNCOMMITTED(TRANSACTION_READ_UNCOMMITTED),

    /**
     * Isolation level
     */
    READ_COMMITTED(TRANSACTION_READ_COMMITTED),

    /**
     * Isolation level
     */
    REPEATABLE_READ(TRANSACTION_REPEATABLE_READ),

    /**
     * Isolation level
     */
    SERIALIZABLE(TRANSACTION_SERIALIZABLE);

    private final int value;

    private IsolationLevel(int value) {
        this.value = value;
    }

    /**
     * Return the constant for this isolation level defined in {@link java.sql.Connection}
     * @return the java.sql.Connection value
     */
    public int getJavaSqlConstant() {
        return value;
    }

}
