
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

public class Subject extends ModelWithId {
  // Fields
  private Integer __term_id;
  private Integer __person_id;
  private Integer __teacher_group_id;
  private Integer __student_group_id;
  private String __name;
  private String __code;
  private String __description;
  private Long __created_at;
  private Long __updated_at;

  // Associations
  private BelongsToAssociation<Person> __assoc_person;
  private HasManyAssociation<Event> __assoc_events;

  public enum _Fields {
    term_id,
    person_id,
    teacher_group_id,
    student_group_id,
    name,
    code,
    description,
    created_at,
    updated_at,
  }

  public Subject(long id, final Integer term_id, final Integer person_id, final Integer teacher_group_id, final Integer student_group_id, final String name, final String code, final String description, final Long created_at, final Long updated_at, IDatabases databases) {
    super(id);
    this.__term_id = term_id;
    this.__person_id = person_id;
    this.__teacher_group_id = teacher_group_id;
    this.__student_group_id = student_group_id;
    this.__name = name;
    this.__code = code;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
    this.__assoc_person = new BelongsToAssociation<Person>(databases.getDatabase1().people(), person_id == null ? null : person_id.longValue());
    this.__assoc_events = new HasManyAssociation<Event>(databases.getDatabase1().events(), "subject_id", id);
  }

  public Subject(long id, final Integer term_id, final Integer person_id, final Integer teacher_group_id, final Integer student_group_id, final String name, final String code, final String description, final Long created_at, final Long updated_at) {
    super(id);
    this.__term_id = term_id;
    this.__person_id = person_id;
    this.__teacher_group_id = teacher_group_id;
    this.__student_group_id = student_group_id;
    this.__name = name;
    this.__code = code;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
  }

  public Subject(long id, Map<Enum, Object> fieldsMap) {
    super(id);
    Integer term_id = (Integer) fieldsMap.get(Subject._Fields.term_id);
    Integer person_id = (Integer) fieldsMap.get(Subject._Fields.person_id);
    Integer teacher_group_id = (Integer) fieldsMap.get(Subject._Fields.teacher_group_id);
    Integer student_group_id = (Integer) fieldsMap.get(Subject._Fields.student_group_id);
    String name = (String) fieldsMap.get(Subject._Fields.name);
    String code = (String) fieldsMap.get(Subject._Fields.code);
    String description = (String) fieldsMap.get(Subject._Fields.description);
    Long created_at = (Long) fieldsMap.get(Subject._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(Subject._Fields.updated_at);
    this.__term_id = term_id;
    this.__person_id = person_id;
    this.__teacher_group_id = teacher_group_id;
    this.__student_group_id = student_group_id;
    this.__name = name;
    this.__code = code;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
  }

  public Subject (Subject other) {
    super(other.getId());
    this.__term_id = other.getTermId();
    this.__person_id = other.getPersonId();
    this.__teacher_group_id = other.getTeacherGroupId();
    this.__student_group_id = other.getStudentGroupId();
    this.__name = other.getName();
    this.__code = other.getCode();
    this.__description = other.getDescription();
    this.__created_at = other.getCreatedAt();
    this.__updated_at = other.getUpdatedAt();
  }

  public Integer getTermId(){
    return __term_id;
  }

  public void setTermId(Integer newval){
    this.__term_id = newval;
    cachedHashCode = 0;
  }

  public Integer getPersonId(){
    return __person_id;
  }

  public void setPersonId(Integer newval){
    this.__person_id = newval;
    cachedHashCode = 0;
  }

  public Integer getTeacherGroupId(){
    return __teacher_group_id;
  }

  public void setTeacherGroupId(Integer newval){
    this.__teacher_group_id = newval;
    cachedHashCode = 0;
  }

  public Integer getStudentGroupId(){
    return __student_group_id;
  }

  public void setStudentGroupId(Integer newval){
    this.__student_group_id = newval;
    cachedHashCode = 0;
  }

  public String getName(){
    return __name;
  }

  public void setName(String newval){
    this.__name = newval;
    cachedHashCode = 0;
  }

  public String getCode(){
    return __code;
  }

  public void setCode(String newval){
    this.__code = newval;
    cachedHashCode = 0;
  }

  public String getDescription(){
    return __description;
  }

  public void setDescription(String newval){
    this.__description = newval;
    cachedHashCode = 0;
  }

  public Long getCreatedAt(){
    return __created_at;
  }

  public void setCreatedAt(Long newval){
    this.__created_at = newval;
    cachedHashCode = 0;
  }

  public Long getUpdatedAt(){
    return __updated_at;
  }

  public void setUpdatedAt(Long newval){
    this.__updated_at = newval;
    cachedHashCode = 0;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case term_id:
        setTermId((Integer) value);
        break;
      case person_id:
        setPersonId((Integer) value);
        break;
      case teacher_group_id:
        setTeacherGroupId((Integer) value);
        break;
      case student_group_id:
        setStudentGroupId((Integer) value);
        break;
      case name:
        setName((String) value);
        break;
      case code:
        setCode((String) value);
        break;
      case description:
        setDescription((String) value);
        break;
      case created_at:
        setCreatedAt((Long) value);
        break;
      case updated_at:
        setUpdatedAt((Long) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case term_id:
        return Integer.class;
      case person_id:
        return Integer.class;
      case teacher_group_id:
        return Integer.class;
      case student_group_id:
        return Integer.class;
      case name:
        return String.class;
      case code:
        return String.class;
      case description:
        return String.class;
      case created_at:
        return Long.class;
      case updated_at:
        return Long.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("term_id")) {
      return Integer.class;
    }
    if (fieldName.equals("person_id")) {
      return Integer.class;
    }
    if (fieldName.equals("teacher_group_id")) {
      return Integer.class;
    }
    if (fieldName.equals("student_group_id")) {
      return Integer.class;
    }
    if (fieldName.equals("name")) {
      return String.class;
    }
    if (fieldName.equals("code")) {
      return String.class;
    }
    if (fieldName.equals("description")) {
      return String.class;
    }
    if (fieldName.equals("created_at")) {
      return Long.class;
    }
    if (fieldName.equals("updated_at")) {
      return Long.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Person getPerson() throws IOException {
    return __assoc_person.get();
  }

  public Set<Event> getEvents() throws IOException {
    return __assoc_events.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("term_id")) {
      return getTermId();
    }
    if (fieldName.equals("person_id")) {
      return getPersonId();
    }
    if (fieldName.equals("teacher_group_id")) {
      return getTeacherGroupId();
    }
    if (fieldName.equals("student_group_id")) {
      return getStudentGroupId();
    }
    if (fieldName.equals("name")) {
      return getName();
    }
    if (fieldName.equals("code")) {
      return getCode();
    }
    if (fieldName.equals("description")) {
      return getDescription();
    }
    if (fieldName.equals("created_at")) {
      return getCreatedAt();
    }
    if (fieldName.equals("updated_at")) {
      return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case term_id:
        return getTermId();
      case person_id:
        return getPersonId();
      case teacher_group_id:
        return getTeacherGroupId();
      case student_group_id:
        return getStudentGroupId();
      case name:
        return getName();
      case code:
        return getCode();
      case description:
        return getDescription();
      case created_at:
        return getCreatedAt();
      case updated_at:
        return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case term_id:
        return null;
      case person_id:
        return null;
      case teacher_group_id:
        return null;
      case student_group_id:
        return null;
      case name:
        return null;
      case code:
        return null;
      case description:
        return null;
      case created_at:
        return null;
      case updated_at:
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
    return new Subject(this);
  }

  public String toString() {
    return "<Subject"
      + " term_id: " + __term_id
      + " person_id: " + __person_id
      + " teacher_group_id: " + __teacher_group_id
      + " student_group_id: " + __student_group_id
      + " name: " + __name
      + " code: " + __code
      + " description: " + __description
      + " created_at: " + __created_at
      + " updated_at: " + __updated_at
      + ">";
  }
}
