
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

import javadb.timely.database_1.models.GroupsPerson;
import javadb.timely.database_1.iface.IGroupsPersonPersistence;

import javadb.timely.IDatabases;

public class BaseMockGroupsPersonPersistenceImpl extends AbstractMockDatabaseModel<GroupsPerson> implements IGroupsPersonPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockGroupsPersonPersistenceImpl(IDatabases databases) {
    super();
    this.databases = databases;
  }

   public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    int group_id = (Integer) fieldsMap.get(GroupsPerson._Fields.group_id);
    int person_id = (Integer) fieldsMap.get(GroupsPerson._Fields.person_id);
    return create(group_id, person_id);
  }


  public GroupsPerson create(final int group_id, final int person_id) throws IOException {
    long __id = curId.getAndIncrement();
    GroupsPerson newInst = new GroupsPerson(__id, group_id, person_id, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<GroupsPerson> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }

  public Set<GroupsPerson> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(ids, fieldsMap);
  }

  public Set<GroupsPerson> findByGroupId(final int value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(GroupsPerson._Fields.group_id, value);}});
  }

  public Set<GroupsPerson> findByPersonId(final int value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(GroupsPerson._Fields.person_id, value);}});
  }
}
