
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

import javadb.timely.database_1.models.SchoolTerm;
import javadb.timely.database_1.iface.ISchoolTermPersistence;

import javadb.timely.IDatabases;

public class BaseMockSchoolTermPersistenceImpl extends AbstractMockDatabaseModel<SchoolTerm> implements ISchoolTermPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockSchoolTermPersistenceImpl(IDatabases databases) {
    super();
    this.databases = databases;
  }


  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String name = (String) fieldsMap.get(SchoolTerm._Fields.name);
    Long start = (Long) fieldsMap.get(SchoolTerm._Fields.start);
    Long end = (Long) fieldsMap.get(SchoolTerm._Fields.end);
    Long created_at = (Long) fieldsMap.get(SchoolTerm._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(SchoolTerm._Fields.updated_at);
    return create(name, start, end, created_at, updated_at);
  }


  public SchoolTerm create(final String name, final Long start, final Long end, final Long created_at, final Long updated_at) throws IOException {
    long __id = curId.getAndIncrement();
    SchoolTerm newInst = new SchoolTerm(__id, name, start, end, created_at, updated_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<SchoolTerm> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }

  public Set<SchoolTerm> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(ids, fieldsMap);
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
