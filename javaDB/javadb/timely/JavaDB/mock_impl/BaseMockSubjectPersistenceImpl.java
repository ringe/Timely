
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.mock_impl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractMockDatabaseModel;
import com.rapleaf.jack.ModelWithId;

import javadb.timely.database_1.models.Subject;
import javadb.timely.database_1.iface.ISubjectPersistence;

import javadb.timely.IDatabases;

public class BaseMockSubjectPersistenceImpl extends AbstractMockDatabaseModel<Subject> implements ISubjectPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockSubjectPersistenceImpl(IDatabases databases) {
    super();
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
    long __id = curId.getAndIncrement();
    Subject newInst = new Subject(__id, term_id, person_id, teacher_group_id, student_group_id, name, code, description, created_at, updated_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Subject> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }

  public Set<Subject> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(ids, fieldsMap);
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