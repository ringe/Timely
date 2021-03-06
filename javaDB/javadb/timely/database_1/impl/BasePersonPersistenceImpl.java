
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

import javadb.timely.database_1.models.Person;
import javadb.timely.database_1.iface.IPersonPersistence;

import javadb.timely.IDatabases;

public class BasePersonPersistenceImpl extends AbstractDatabaseModel<Person> implements IPersonPersistence {
  private final IDatabases databases;

  public BasePersonPersistenceImpl(BaseDatabaseConnection conn, IDatabases databases) {
    super(conn, "people", Arrays.asList("remember_token", "remember_created_at", "sign_in_count", "current_sign_in_at", "last_sign_in_at", "current_sign_in_ip", "last_sign_in_ip", "authentication_token", "email", "private_email", "phone", "firstname", "lastname", "type", "created_at", "updated_at"));
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String remember_token = (String) fieldsMap.get(Person._Fields.remember_token);
    Long remember_created_at = (Long) fieldsMap.get(Person._Fields.remember_created_at);
    Integer sign_in_count_tmp = (Integer) fieldsMap.get(Person._Fields.sign_in_count);
    Integer sign_in_count = sign_in_count_tmp == null ? 0 : sign_in_count_tmp;
    Long current_sign_in_at = (Long) fieldsMap.get(Person._Fields.current_sign_in_at);
    Long last_sign_in_at = (Long) fieldsMap.get(Person._Fields.last_sign_in_at);
    String current_sign_in_ip = (String) fieldsMap.get(Person._Fields.current_sign_in_ip);
    String last_sign_in_ip = (String) fieldsMap.get(Person._Fields.last_sign_in_ip);
    String authentication_token = (String) fieldsMap.get(Person._Fields.authentication_token);
    String email = (String) fieldsMap.get(Person._Fields.email);
    String private_email = (String) fieldsMap.get(Person._Fields.private_email);
    String phone = (String) fieldsMap.get(Person._Fields.phone);
    String firstname = (String) fieldsMap.get(Person._Fields.firstname);
    String lastname = (String) fieldsMap.get(Person._Fields.lastname);
    String type = (String) fieldsMap.get(Person._Fields.type);
    Long created_at = (Long) fieldsMap.get(Person._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(Person._Fields.updated_at);
    return create(remember_token, remember_created_at, sign_in_count, current_sign_in_at, last_sign_in_at, current_sign_in_ip, last_sign_in_ip, authentication_token, email, private_email, phone, firstname, lastname, type, created_at, updated_at);
  }


  public Person create(final String remember_token, final Long remember_created_at, final Integer sign_in_count, final Long current_sign_in_at, final Long last_sign_in_at, final String current_sign_in_ip, final String last_sign_in_ip, final String authentication_token, final String email, final String private_email, final String phone, final String firstname, final String lastname, final String type, final Long created_at, final Long updated_at) throws IOException {
    long __id = realCreate(new AttrSetter() {
      public void set(PreparedStatement stmt) throws SQLException {
        if (remember_token == null) {
          stmt.setNull(1, java.sql.Types.CHAR);
        } else {
          stmt.setString(1, remember_token);
        }
        if (remember_created_at == null) {
          stmt.setNull(2, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(2, new Timestamp(remember_created_at));
        }
        if (sign_in_count == null) {
          stmt.setNull(3, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(3, sign_in_count);
        }
        if (current_sign_in_at == null) {
          stmt.setNull(4, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(4, new Timestamp(current_sign_in_at));
        }
        if (last_sign_in_at == null) {
          stmt.setNull(5, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(5, new Timestamp(last_sign_in_at));
        }
        if (current_sign_in_ip == null) {
          stmt.setNull(6, java.sql.Types.CHAR);
        } else {
          stmt.setString(6, current_sign_in_ip);
        }
        if (last_sign_in_ip == null) {
          stmt.setNull(7, java.sql.Types.CHAR);
        } else {
          stmt.setString(7, last_sign_in_ip);
        }
        if (authentication_token == null) {
          stmt.setNull(8, java.sql.Types.CHAR);
        } else {
          stmt.setString(8, authentication_token);
        }
        if (email == null) {
          stmt.setNull(9, java.sql.Types.CHAR);
        } else {
          stmt.setString(9, email);
        }
        if (private_email == null) {
          stmt.setNull(10, java.sql.Types.CHAR);
        } else {
          stmt.setString(10, private_email);
        }
        if (phone == null) {
          stmt.setNull(11, java.sql.Types.CHAR);
        } else {
          stmt.setString(11, phone);
        }
        if (firstname == null) {
          stmt.setNull(12, java.sql.Types.CHAR);
        } else {
          stmt.setString(12, firstname);
        }
        if (lastname == null) {
          stmt.setNull(13, java.sql.Types.CHAR);
        } else {
          stmt.setString(13, lastname);
        }
        if (type == null) {
          stmt.setNull(14, java.sql.Types.CHAR);
        } else {
          stmt.setString(14, type);
        }
        if (created_at == null) {
          stmt.setNull(15, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(15, new Timestamp(created_at));
        }
        if (updated_at == null) {
          stmt.setNull(16, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(16, new Timestamp(updated_at));
        }
      }
    }, getInsertStatement(Arrays.asList("remember_token", "remember_created_at", "sign_in_count", "current_sign_in_at", "last_sign_in_at", "current_sign_in_ip", "last_sign_in_ip", "authentication_token", "email", "private_email", "phone", "firstname", "lastname", "type", "created_at", "updated_at")));
    Person newInst = new Person(__id, remember_token, remember_created_at, sign_in_count, current_sign_in_at, last_sign_in_at, current_sign_in_ip, last_sign_in_ip, authentication_token, email, private_email, phone, firstname, lastname, type, created_at, updated_at, databases);
    cachedById.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Person> find(Map<Enum, Object> fieldsMap) throws IOException {
    return find(null, fieldsMap);
  }

  public Set<Person> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    Set<Person> foundSet = new HashSet<Person>();
    
    if (fieldsMap == null || fieldsMap.isEmpty()) {
      return foundSet;
    }

    StringBuilder statementString = new StringBuilder();
    statementString.append("SELECT * FROM people WHERE (");
    List<Object> nonNullValues = new ArrayList<Object>();
    List<Person._Fields> nonNullValueFields = new ArrayList<Person._Fields>();

    Iterator<Map.Entry<Enum, Object>> iter = fieldsMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Enum, Object> entry = iter.next();
      Enum field = entry.getKey();
      Object value = entry.getValue();
      
      String queryValue = value != null ? " = ? " : " IS NULL";
      if (value != null) {
        nonNullValueFields.add((Person._Fields) field);
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
      Person._Fields field = nonNullValueFields.get(i);
      try {
        switch (field) {
          case remember_token:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case remember_created_at:
            preparedStatement.setTimestamp(i+1, new Timestamp((Long) nonNullValues.get(i)));
            break;
          case sign_in_count:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case current_sign_in_at:
            preparedStatement.setTimestamp(i+1, new Timestamp((Long) nonNullValues.get(i)));
            break;
          case last_sign_in_at:
            preparedStatement.setTimestamp(i+1, new Timestamp((Long) nonNullValues.get(i)));
            break;
          case current_sign_in_ip:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case last_sign_in_ip:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case authentication_token:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case email:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case private_email:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case phone:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case firstname:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case lastname:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case type:
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
  protected void setAttrs(Person model, PreparedStatement stmt) throws SQLException {
    if (model.getRememberToken() == null) {
      stmt.setNull(1, java.sql.Types.CHAR);
    } else {
      stmt.setString(1, model.getRememberToken());
    }
    if (model.getRememberCreatedAt() == null) {
      stmt.setNull(2, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(2, new Timestamp(model.getRememberCreatedAt()));
    }
    if (model.getSignInCount() == null) {
      stmt.setNull(3, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(3, model.getSignInCount());
    }
    if (model.getCurrentSignInAt() == null) {
      stmt.setNull(4, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(4, new Timestamp(model.getCurrentSignInAt()));
    }
    if (model.getLastSignInAt() == null) {
      stmt.setNull(5, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(5, new Timestamp(model.getLastSignInAt()));
    }
    if (model.getCurrentSignInIp() == null) {
      stmt.setNull(6, java.sql.Types.CHAR);
    } else {
      stmt.setString(6, model.getCurrentSignInIp());
    }
    if (model.getLastSignInIp() == null) {
      stmt.setNull(7, java.sql.Types.CHAR);
    } else {
      stmt.setString(7, model.getLastSignInIp());
    }
    if (model.getAuthenticationToken() == null) {
      stmt.setNull(8, java.sql.Types.CHAR);
    } else {
      stmt.setString(8, model.getAuthenticationToken());
    }
    if (model.getEmail() == null) {
      stmt.setNull(9, java.sql.Types.CHAR);
    } else {
      stmt.setString(9, model.getEmail());
    }
    if (model.getPrivateEmail() == null) {
      stmt.setNull(10, java.sql.Types.CHAR);
    } else {
      stmt.setString(10, model.getPrivateEmail());
    }
    if (model.getPhone() == null) {
      stmt.setNull(11, java.sql.Types.CHAR);
    } else {
      stmt.setString(11, model.getPhone());
    }
    if (model.getFirstname() == null) {
      stmt.setNull(12, java.sql.Types.CHAR);
    } else {
      stmt.setString(12, model.getFirstname());
    }
    if (model.getLastname() == null) {
      stmt.setNull(13, java.sql.Types.CHAR);
    } else {
      stmt.setString(13, model.getLastname());
    }
    if (model.getType() == null) {
      stmt.setNull(14, java.sql.Types.CHAR);
    } else {
      stmt.setString(14, model.getType());
    }
    if (model.getCreatedAt() == null) {
      stmt.setNull(15, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(15, new Timestamp(model.getCreatedAt()));
    }
    if (model.getUpdatedAt() == null) {
      stmt.setNull(16, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(16, new Timestamp(model.getUpdatedAt()));
    }
    stmt.setLong(17, model.getId());
  }

  @Override
  protected Person instanceFromResultSet(ResultSet rs) throws SQLException {
    return new Person(rs.getLong("id"),
      rs.getString("remember_token"),
      getDateAsLong(rs, "remember_created_at"),
      getIntOrNull(rs, "sign_in_count"),
      getDateAsLong(rs, "current_sign_in_at"),
      getDateAsLong(rs, "last_sign_in_at"),
      rs.getString("current_sign_in_ip"),
      rs.getString("last_sign_in_ip"),
      rs.getString("authentication_token"),
      rs.getString("email"),
      rs.getString("private_email"),
      rs.getString("phone"),
      rs.getString("firstname"),
      rs.getString("lastname"),
      rs.getString("type"),
      getDateAsLong(rs, "created_at"),
      getDateAsLong(rs, "updated_at"),
      databases
    );
  }

  public Set<Person> findByRememberToken(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.remember_token, value);}});
  }

  public Set<Person> findByRememberCreatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.remember_created_at, value);}});
  }

  public Set<Person> findBySignInCount(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.sign_in_count, value);}});
  }

  public Set<Person> findByCurrentSignInAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.current_sign_in_at, value);}});
  }

  public Set<Person> findByLastSignInAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.last_sign_in_at, value);}});
  }

  public Set<Person> findByCurrentSignInIp(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.current_sign_in_ip, value);}});
  }

  public Set<Person> findByLastSignInIp(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.last_sign_in_ip, value);}});
  }

  public Set<Person> findByAuthenticationToken(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.authentication_token, value);}});
  }

  public Set<Person> findByEmail(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.email, value);}});
  }

  public Set<Person> findByPrivateEmail(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.private_email, value);}});
  }

  public Set<Person> findByPhone(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.phone, value);}});
  }

  public Set<Person> findByFirstname(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.firstname, value);}});
  }

  public Set<Person> findByLastname(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.lastname, value);}});
  }

  public Set<Person> findByType(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.type, value);}});
  }

  public Set<Person> findByCreatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.created_at, value);}});
  }

  public Set<Person> findByUpdatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Person._Fields.updated_at, value);}});
  }
}
