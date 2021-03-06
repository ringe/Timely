
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

public class Room extends ModelWithId {
  // Fields
  private String __code;
  private String __category;
  private Integer __capacity;
  private Integer __capacity_exam;
  private String __description;
  private Long __created_at;
  private Long __updated_at;

  // Associations
  private HasManyAssociation<Accessory> __assoc_accessories;

  public enum _Fields {
    code,
    category,
    capacity,
    capacity_exam,
    description,
    created_at,
    updated_at,
  }

  public Room(long id, final String code, final String category, final Integer capacity, final Integer capacity_exam, final String description, final Long created_at, final Long updated_at, IDatabases databases) {
    super(id);
    this.__code = code;
    this.__category = category;
    this.__capacity = capacity;
    this.__capacity_exam = capacity_exam;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
    this.__assoc_accessories = new HasManyAssociation<Accessory>(databases.getDatabase1().accessories(), "room_id", id);
  }

  public Room(long id, final String code, final String category, final Integer capacity, final Integer capacity_exam, final String description, final Long created_at, final Long updated_at) {
    super(id);
    this.__code = code;
    this.__category = category;
    this.__capacity = capacity;
    this.__capacity_exam = capacity_exam;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
  }

  public Room(long id, Map<Enum, Object> fieldsMap) {
    super(id);
    String code = (String) fieldsMap.get(Room._Fields.code);
    String category = (String) fieldsMap.get(Room._Fields.category);
    Integer capacity = (Integer) fieldsMap.get(Room._Fields.capacity);
    Integer capacity_exam = (Integer) fieldsMap.get(Room._Fields.capacity_exam);
    String description = (String) fieldsMap.get(Room._Fields.description);
    Long created_at = (Long) fieldsMap.get(Room._Fields.created_at);
    Long updated_at = (Long) fieldsMap.get(Room._Fields.updated_at);
    this.__code = code;
    this.__category = category;
    this.__capacity = capacity;
    this.__capacity_exam = capacity_exam;
    this.__description = description;
    this.__created_at = created_at;
    this.__updated_at = updated_at;
  }

  public Room (Room other) {
    super(other.getId());
    this.__code = other.getCode();
    this.__category = other.getCategory();
    this.__capacity = other.getCapacity();
    this.__capacity_exam = other.getCapacityExam();
    this.__description = other.getDescription();
    this.__created_at = other.getCreatedAt();
    this.__updated_at = other.getUpdatedAt();
  }

  public String getCode(){
    return __code;
  }

  public void setCode(String newval){
    this.__code = newval;
    cachedHashCode = 0;
  }

  public String getCategory(){
    return __category;
  }

  public void setCategory(String newval){
    this.__category = newval;
    cachedHashCode = 0;
  }

  public Integer getCapacity(){
    return __capacity;
  }

  public void setCapacity(Integer newval){
    this.__capacity = newval;
    cachedHashCode = 0;
  }

  public Integer getCapacityExam(){
    return __capacity_exam;
  }

  public void setCapacityExam(Integer newval){
    this.__capacity_exam = newval;
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
      case code:
        setCode((String) value);
        break;
      case category:
        setCategory((String) value);
        break;
      case capacity:
        setCapacity((Integer) value);
        break;
      case capacity_exam:
        setCapacityExam((Integer) value);
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
      case code:
        return String.class;
      case category:
        return String.class;
      case capacity:
        return Integer.class;
      case capacity_exam:
        return Integer.class;
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
    if (fieldName.equals("code")) {
      return String.class;
    }
    if (fieldName.equals("category")) {
      return String.class;
    }
    if (fieldName.equals("capacity")) {
      return Integer.class;
    }
    if (fieldName.equals("capacity_exam")) {
      return Integer.class;
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

  public Set<Accessory> getAccessories() throws IOException {
    return __assoc_accessories.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("code")) {
      return getCode();
    }
    if (fieldName.equals("category")) {
      return getCategory();
    }
    if (fieldName.equals("capacity")) {
      return getCapacity();
    }
    if (fieldName.equals("capacity_exam")) {
      return getCapacityExam();
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
      case code:
        return getCode();
      case category:
        return getCategory();
      case capacity:
        return getCapacity();
      case capacity_exam:
        return getCapacityExam();
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
      case code:
        return null;
      case category:
        return null;
      case capacity:
        return null;
      case capacity_exam:
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
    return new Room(this);
  }

  public String toString() {
    return "<Room"
      + " code: " + __code
      + " category: " + __category
      + " capacity: " + __capacity
      + " capacity_exam: " + __capacity_exam
      + " description: " + __description
      + " created_at: " + __created_at
      + " updated_at: " + __updated_at
      + ">";
  }
}
