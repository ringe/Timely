
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.models;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import javadb.timely.database_1.IDatabase1;

import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;

import javadb.timely.IDatabases;

public class GroupsPerson extends ModelWithId {
  // Fields
  private int __group_id;
  private int __person_id;

  // Associations

  public enum _Fields {
    group_id,
    person_id,
  }

  public GroupsPerson(long id, final int group_id, final int person_id, IDatabases databases) {
    super(id);
    this.__group_id = group_id;
    this.__person_id = person_id;
  }

  public GroupsPerson(long id, final int group_id, final int person_id) {
    super(id);
    this.__group_id = group_id;
    this.__person_id = person_id;
  }

  public GroupsPerson(long id, Map<Enum, Object> fieldsMap) {
    super(id);
    int group_id = (Integer) fieldsMap.get(GroupsPerson._Fields.group_id);
    int person_id = (Integer) fieldsMap.get(GroupsPerson._Fields.person_id);
    this.__group_id = group_id;
    this.__person_id = person_id;
  }

  public GroupsPerson (GroupsPerson other) {
    super(other.getId());
    this.__group_id = other.getGroupId();
    this.__person_id = other.getPersonId();
  }

  public int getGroupId(){
    return __group_id;
  }

  public void setGroupId(int newval){
    this.__group_id = newval;
    cachedHashCode = 0;
  }

  public int getPersonId(){
    return __person_id;
  }

  public void setPersonId(int newval){
    this.__person_id = newval;
    cachedHashCode = 0;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case group_id:
        setGroupId((Integer) value);
        break;
      case person_id:
        setPersonId((Integer) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case group_id:
        return int.class;
      case person_id:
        return int.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("group_id")) {
      return int.class;
    }
    if (fieldName.equals("person_id")) {
      return int.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("group_id")) {
      return getGroupId();
    }
    if (fieldName.equals("person_id")) {
      return getPersonId();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case group_id:
        return getGroupId();
      case person_id:
        return getPersonId();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case group_id:
        return null;
      case person_id:
        return null;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  @Override
  public Set<Enum> getFieldSet() {
    Set set = EnumSet.allOf(_Fields.class);
    return set;
  }

  @Override
  public ModelWithId getCopy() {
    return new GroupsPerson(this);
  }

  public String toString() {
    return "<GroupsPerson"
      + " group_id: " + __group_id
      + " person_id: " + __person_id
      + ">";
  }
}
