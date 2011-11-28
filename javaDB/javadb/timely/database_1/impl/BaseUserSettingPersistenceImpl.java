
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

import javadb.timely.database_1.models.UserSetting;
import javadb.timely.database_1.iface.IUserSettingPersistence;

import javadb.timely.IDatabases;

public class BaseUserSettingPersistenceImpl extends AbstractDatabaseModel<UserSetting> implements IUserSettingPersistence {
  private final IDatabases databases;

  public BaseUserSettingPersistenceImpl(BaseDatabaseConnection conn, IDatabases databases) {
    super(conn, "user_settings", Arrays.asList("person_id", "name", "value", "created_at", "updated_at"));
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    Integer person_id = (Integer) fieldsMap.get(UserSetting._Fields.person_id);
    String name = (String) fieldsMap.get(UserSetting._Fields.name);
    String value = (String) fieldsMap.get(UserSetting._Fields.value);
    Long created_at = (Long) fieldsMap.get(UserSetting._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(UserSetting._Fields.updated_at);
    return create(person_id, name, value, created_at, updated_at);
  }


  public UserSetting create(final Integer person_id, final String name, final String value, final Long created_at, final Long updated_at) throws IOException {
    long __id = realCreate(new AttrSetter() {
      public void set(PreparedStatement stmt) throws SQLException {
        if (person_id == null) {
          stmt.setNull(1, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(1, person_id);
        }
        if (name == null) {
          stmt.setNull(2, java.sql.Types.CHAR);
        } else {
          stmt.setString(2, name);
        }
        if (value == null) {
          stmt.setNull(3, java.sql.Types.CHAR);
        } else {
          stmt.setString(3, value);
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
    }, getInsertStatement(Arrays.asList("person_id", "name", "value", "created_at", "updated_at")));
    UserSetting newInst = new UserSetting(__id, person_id, name, value, created_at, updated_at, databases);
    cachedById.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<UserSetting> find(Map<Enum, Object> fieldsMap) throws IOException {
    return find(null, fieldsMap);
  }

  public Set<UserSetting> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    Set<UserSetting> foundSet = new HashSet<UserSetting>();
    
    if (fieldsMap == null || fieldsMap.isEmpty()) {
      return foundSet;
    }

    StringBuilder statementString = new StringBuilder();
    statementString.append("SELECT * FROM user_settings WHERE (");
    List<Object> nonNullValues = new ArrayList<Object>();
    List<UserSetting._Fields> nonNullValueFields = new ArrayList<UserSetting._Fields>();

    Iterator<Map.Entry<Enum, Object>> iter = fieldsMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Enum, Object> entry = iter.next();
      Enum field = entry.getKey();
      Object value = entry.getValue();
      
      String queryValue = value != null ? " = ? " : " IS NULL";
      if (value != null) {
        nonNullValueFields.add((UserSetting._Fields) field);
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
      UserSetting._Fields field = nonNullValueFields.get(i);
      try {
        switch (field) {
          case person_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case name:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case value:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
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
  protected void setAttrs(UserSetting model, PreparedStatement stmt) throws SQLException {
    if (model.getPersonId() == null) {
      stmt.setNull(1, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(1, model.getPersonId());
    }
    if (model.getName() == null) {
      stmt.setNull(2, java.sql.Types.CHAR);
    } else {
      stmt.setString(2, model.getName());
    }
    if (model.getValue() == null) {
      stmt.setNull(3, java.sql.Types.CHAR);
    } else {
      stmt.setString(3, model.getValue());
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
  protected UserSetting instanceFromResultSet(ResultSet rs) throws SQLException {
    return new UserSetting(rs.getLong("id"),
      getIntOrNull(rs, "person_id"),
      rs.getString("name"),
      rs.getString("value"),
      getDateAsLong(rs, "created_at"),
      getDateAsLong(rs, "updated_at"),
      databases
    );
  }

  public Set<UserSetting> findByPersonId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(UserSetting._Fields.person_id, value);}});
  }

  public Set<UserSetting> findByName(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(UserSetting._Fields.name, value);}});
  }

  public Set<UserSetting> findByValue(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(UserSetting._Fields.value, value);}});
  }

  public Set<UserSetting> findByCreatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(UserSetting._Fields.created_at, value);}});
  }

  public Set<UserSetting> findByUpdatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(UserSetting._Fields.updated_at, value);}});
  }
}