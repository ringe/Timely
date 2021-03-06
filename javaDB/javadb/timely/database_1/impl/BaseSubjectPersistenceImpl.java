
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

import javadb.timely.database_1.models.Subject;
import javadb.timely.database_1.iface.ISubjectPersistence;

import javadb.timely.IDatabases;

public class BaseSubjectPersistenceImpl extends AbstractDatabaseModel<Subject> implements ISubjectPersistence {
  private final IDatabases databases;

  public BaseSubjectPersistenceImpl(BaseDatabaseConnection conn, IDatabases databases) {
    super(conn, "subjects", Arrays.asList("term_id", "person_id", "teacher_group_id", "student_group_id", "name", "code", "description", "created_at", "updated_at"));
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    Integer term_id = (Integer) fieldsMap.get(Subject._Fields.term_id);
    Integer person_id = (Integer) fieldsMap.get(Subject._Fields.person_id);
    Integer teacher_group_id = (Integer) fieldsMap.get(Subject._Fields.teacher_group_id);
    Integer student_group_id = (Integer) fieldsMap.get(Subject._Fields.student_group_id);
    String name = (String) fieldsMap.get(Subject._Fields.name);
    String code = (String) fieldsMap.get(Subject._Fields.code);
    String description = (String) fieldsMap.get(Subject._Fields.description);
    Long created_at = (Long) fieldsMap.get(Subject._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(Subject._Fields.updated_at);
    return create(term_id, person_id, teacher_group_id, student_group_id, name, code, description, created_at, updated_at);
  }


  public Subject create(final Integer term_id, final Integer person_id, final Integer teacher_group_id, final Integer student_group_id, final String name, final String code, final String description, final Long created_at, final Long updated_at) throws IOException {
    long __id = realCreate(new AttrSetter() {
      public void set(PreparedStatement stmt) throws SQLException {
        if (term_id == null) {
          stmt.setNull(1, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(1, term_id);
        }
        if (person_id == null) {
          stmt.setNull(2, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(2, person_id);
        }
        if (teacher_group_id == null) {
          stmt.setNull(3, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(3, teacher_group_id);
        }
        if (student_group_id == null) {
          stmt.setNull(4, java.sql.Types.INTEGER);
        } else {
          stmt.setInt(4, student_group_id);
        }
        if (name == null) {
          stmt.setNull(5, java.sql.Types.CHAR);
        } else {
          stmt.setString(5, name);
        }
        if (code == null) {
          stmt.setNull(6, java.sql.Types.CHAR);
        } else {
          stmt.setString(6, code);
        }
        if (description == null) {
          stmt.setNull(7, java.sql.Types.CHAR);
        } else {
          stmt.setString(7, description);
        }
        if (created_at == null) {
          stmt.setNull(8, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(8, new Timestamp(created_at));
        }
        if (updated_at == null) {
          stmt.setNull(9, java.sql.Types.DATE);
        } else {
          stmt.setTimestamp(9, new Timestamp(updated_at));
        }
      }
    }, getInsertStatement(Arrays.asList("term_id", "person_id", "teacher_group_id", "student_group_id", "name", "code", "description", "created_at", "updated_at")));
    Subject newInst = new Subject(__id, term_id, person_id, teacher_group_id, student_group_id, name, code, description, created_at, updated_at, databases);
    cachedById.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Subject> find(Map<Enum, Object> fieldsMap) throws IOException {
    return find(null, fieldsMap);
  }

  public Set<Subject> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    Set<Subject> foundSet = new HashSet<Subject>();
    
    if (fieldsMap == null || fieldsMap.isEmpty()) {
      return foundSet;
    }

    StringBuilder statementString = new StringBuilder();
    statementString.append("SELECT * FROM subjects WHERE (");
    List<Object> nonNullValues = new ArrayList<Object>();
    List<Subject._Fields> nonNullValueFields = new ArrayList<Subject._Fields>();

    Iterator<Map.Entry<Enum, Object>> iter = fieldsMap.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<Enum, Object> entry = iter.next();
      Enum field = entry.getKey();
      Object value = entry.getValue();
      
      String queryValue = value != null ? " = ? " : " IS NULL";
      if (value != null) {
        nonNullValueFields.add((Subject._Fields) field);
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
      Subject._Fields field = nonNullValueFields.get(i);
      try {
        switch (field) {
          case term_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case person_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case teacher_group_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case student_group_id:
            preparedStatement.setInt(i+1, (Integer) nonNullValues.get(i));
            break;
          case name:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case code:
            preparedStatement.setString(i+1, (String) nonNullValues.get(i));
            break;
          case description:
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
  protected void setAttrs(Subject model, PreparedStatement stmt) throws SQLException {
    if (model.getTermId() == null) {
      stmt.setNull(1, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(1, model.getTermId());
    }
    if (model.getPersonId() == null) {
      stmt.setNull(2, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(2, model.getPersonId());
    }
    if (model.getTeacherGroupId() == null) {
      stmt.setNull(3, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(3, model.getTeacherGroupId());
    }
    if (model.getStudentGroupId() == null) {
      stmt.setNull(4, java.sql.Types.INTEGER);
    } else {
      stmt.setInt(4, model.getStudentGroupId());
    }
    if (model.getName() == null) {
      stmt.setNull(5, java.sql.Types.CHAR);
    } else {
      stmt.setString(5, model.getName());
    }
    if (model.getCode() == null) {
      stmt.setNull(6, java.sql.Types.CHAR);
    } else {
      stmt.setString(6, model.getCode());
    }
    if (model.getDescription() == null) {
      stmt.setNull(7, java.sql.Types.CHAR);
    } else {
      stmt.setString(7, model.getDescription());
    }
    if (model.getCreatedAt() == null) {
      stmt.setNull(8, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(8, new Timestamp(model.getCreatedAt()));
    }
    if (model.getUpdatedAt() == null) {
      stmt.setNull(9, java.sql.Types.DATE);
    } else {
      stmt.setTimestamp(9, new Timestamp(model.getUpdatedAt()));
    }
    stmt.setLong(10, model.getId());
  }

  @Override
  protected Subject instanceFromResultSet(ResultSet rs) throws SQLException {
    return new Subject(rs.getLong("id"),
      getIntOrNull(rs, "term_id"),
      getIntOrNull(rs, "person_id"),
      getIntOrNull(rs, "teacher_group_id"),
      getIntOrNull(rs, "student_group_id"),
      rs.getString("name"),
      rs.getString("code"),
      rs.getString("description"),
      getDateAsLong(rs, "created_at"),
      getDateAsLong(rs, "updated_at"),
      databases
    );
  }

  public Set<Subject> findByTermId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.term_id, value);}});
  }

  public Set<Subject> findByPersonId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.person_id, value);}});
  }

  public Set<Subject> findByTeacherGroupId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.teacher_group_id, value);}});
  }

  public Set<Subject> findByStudentGroupId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.student_group_id, value);}});
  }

  public Set<Subject> findByName(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.name, value);}});
  }

  public Set<Subject> findByCode(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.code, value);}});
  }

  public Set<Subject> findByDescription(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.description, value);}});
  }

  public Set<Subject> findByCreatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.created_at, value);}});
  }

  public Set<Subject> findByUpdatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Subject._Fields.updated_at, value);}});
  }
}
