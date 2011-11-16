
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractDatabaseModel;
import com.rapleaf.jack.BaseDatabaseConnection;
import com.rapleaf.jack.ModelWithId;

import javadb.timely.database_1.models.SchoolTerm;
import javadb.timely.database_1.iface.ISchoolTermPersistence;

import javadb.timely.IDatabases;

public class BaseSchoolTermPersistenceImpl extends AbstractDatabaseModel<SchoolTerm> implements ISchoolTermPersistence {
  private final IDatabases databases;

  public BaseSchoolTermPersistenceImpl(BaseDatabaseConnection conn, IDatabases databases) {
    super(conn, "school_terms", Arrays.asList("name", "start", "end", "created_at", "updated_at"));
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String name = (String) fieldsMap.get(SchoolTerm._Fields.name);
    Long start = (Long) fieldsMap.get(SchoolTerm._Fields.start);
    Long end = (Long) fieldsMap.get(SchoolTerm._Fields.end);
    Long created_at = (Long) fieldsMap.get(SchoolTerm._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(SchoolTerm._Fields.updated_at);
    return create(name, start, end, created_at, updated_at);
  }


  public SchoolTerm create(final String name, final Long start, final Long end, final Long created_at, final Long updated_at) throws IOException {
    long __id = realCreate(new AttrSetter() {
      public void set(PreparedStatement stmt) throws SQLException {
        if (name == null) {
          stmt.setNull(1, java.sql.Types.CHAR);
        } else {
          stmt.setString(1, name);
        }
        if (start == null) {
          stmt.setNull(2, java.sql.Types.DATE);
        } else {
          stmt.setDate(2, new Date(start));
        }
        if (end == null) {
          stmt.setNull(3, java.sql.Types.DATE);
        } else {
          stmt.setDate(3, new Date(end));
        }
        if (created_at == null) {
          stmt.setNull(4, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(4, new Timestamp(created_at));
        }
        if (updated_at == null) {
          stmt.setNull(5, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(5, new Timestamp(updated_at));
        }
      }
    }, getInsertStatement(Arrays.asList("name", "start", "end", "created_at", "updated_at")));
    SchoolTerm newInst = new SchoolTerm(__id, name, start, end, created_at, updated_at, databases);
    cachedById.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<SchoolTerm> find(Map<Enum, Object> fieldsMap) throws IOException {
    return find(null, fieldsMap);
  }

  public Set<SchoolTerm> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    Set<SchoolTerm> foundSet = new HashSet<SchoolTerm>();
    
    if (fieldsMap == null || fieldsMap.isEmpty()) {
      return foundSet;
    }

    StringBuilder statementString = new StringBuilder();
    statementString.append("SELECT * FROM school_terms WHERE (");
    List<Object> nonNullValues = new ArrayList<Object>();
    List<SchoolTerm._Fields> nonNullValueFields = new ArrayList<SchoolTerm._Fields>();

    Iterator<Map.Entry<Enum, Object>> iter = fieldsMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Enum, Object> entry = iter.next();
      Enum field = entry.getKey();
      Object value = entry.getValue();
      
      String queryValue = value != null ? " = ? " : " IS NULL";
      if (value != null) {
        nonNullValueFields.add((SchoolTerm._Fields) field);
        nonNullValues.add(value);
      }

      statementString.append(field + queryValue);
      if (iter.hasNext()) {
        statementString.append(" AND ");
      }
    }
    if (ids != null) statementString.append(" AND " + getIdSetCondition(ids));
    statementString.append(")");

    PreparedStatement preparedStatement = getPreparedStatement(statementString.toString());

    for (int i = 0; i < nonNullValues.size(); i++) {
      SchoolTerm._Fields field = nonNullValueFields.get(i);
      try {
        switch (field) {
          case name:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case start:
            preparedStatement.setDate(i+1, new Date((Long) nonNullValues.get(i)));
            break;
          case end:
            preparedStatement.setDate(i+1, new Date((Long) nonNullValues.get(i)));
            break;
          case created_at:
            preparedStatement.setTimestamp(i+1, new Timestamp((Long) nonNullValues.get(i)));
            break;
          case updated_at:
            preparedStatement.setTimestamp(i+1, new Timestamp((Long) nonNullValues.get(i)));
            break;
        }
      } catch (SQLException e) {
        throw new IOException(e);
      }
    }
    executeQuery(foundSet, preparedStatement);

    return foundSet;
  }

  @Override
  protected void setAttrs(SchoolTerm model, PreparedStatement stmt) throws SQLException {
    if (model.getName() == null) {
      stmt.setNull(1, java.sql.Types.CHAR);
    } else {
      stmt.setString(1, model.getName());
    }
    if (model.getStart() == null) {
      stmt.setNull(2, java.sql.Types.DATE);
    } else {
      stmt.setDate(2, new Date(model.getStart()));
    }
    if (model.getEnd() == null) {
      stmt.setNull(3, java.sql.Types.DATE);
    } else {
      stmt.setDate(3, new Date(model.getEnd()));
    }
    if (model.getCreatedAt() == null) {
      stmt.setNull(4, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(4, new Timestamp(model.getCreatedAt()));
    }
    if (model.getUpdatedAt() == null) {
      stmt.setNull(5, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(5, new Timestamp(model.getUpdatedAt()));
    }
    stmt.setLong(6, model.getId());
  }

  @Override
  protected SchoolTerm instanceFromResultSet(ResultSet rs) throws SQLException {
    return new SchoolTerm(rs.getLong("id"),
      rs.getString("name"),
      getDateAsLong(rs, "start"),
      getDateAsLong(rs, "end"),
      getDateAsLong(rs, "created_at"),
      getDateAsLong(rs, "updated_at"),
      databases
    );
  }

  public Set<SchoolTerm> findByName(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(SchoolTerm._Fields.name, value);}});
  }

  public Set<SchoolTerm> findByStart(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(SchoolTerm._Fields.start, value);}});
  }

  public Set<SchoolTerm> findByEnd(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(SchoolTerm._Fields.end, value);}});
  }

  public Set<SchoolTerm> findByCreatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(SchoolTerm._Fields.created_at, value);}});
  }

  public Set<SchoolTerm> findByUpdatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(SchoolTerm._Fields.updated_at, value);}});
  }
}