/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.login.tables;


import javax.annotation.Generated;

import org.graviton.database.jooq.login.Login;
import org.graviton.database.jooq.login.tables.records.ServersRecord;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Servers extends TableImpl<ServersRecord> {

    private static final long serialVersionUID = -1231797671;

    /**
     * The reference instance of <code>login.servers</code>
     */
    public static final Servers SERVERS = new Servers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServersRecord> getRecordType() {
        return ServersRecord.class;
    }

    /**
     * The column <code>login.servers.id</code>.
     */
    public final TableField<ServersRecord, Byte> ID = createField("id", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>login.servers.key</code>.
     */
    public final TableField<ServersRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>login.servers</code> table reference
     */
    public Servers() {
        this("servers", null);
    }

    /**
     * Create an aliased <code>login.servers</code> table reference
     */
    public Servers(String alias) {
        this(alias, SERVERS);
    }

    private Servers(String alias, Table<ServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Servers(String alias, Table<ServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Login.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Servers as(String alias) {
        return new Servers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Servers rename(String name) {
        return new Servers(name, null);
    }
}
