
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package javadb.timely.database_1.mock_impl;

import java.io.IOException;

import javadb.timely.database_1.IDatabase1;
import javadb.timely.database_1.iface.IAccessoryPersistence;
import javadb.timely.database_1.iface.IEventPersistence;
import javadb.timely.database_1.iface.IEventsRoomPersistence;
import javadb.timely.database_1.iface.IGroupPersistence;
import javadb.timely.database_1.iface.IGroupsPersonPersistence;
import javadb.timely.database_1.iface.IPersonPersistence;
import javadb.timely.database_1.iface.IRoomPersistence;
import javadb.timely.database_1.iface.ISchoolTermPersistence;
import javadb.timely.database_1.iface.ISubjectPersistence;
import javadb.timely.database_1.iface.ITermSettingPersistence;
import javadb.timely.database_1.iface.IUserSettingPersistence;

import javadb.timely.IDatabases;

public class MockDatabase1Impl implements IDatabase1 {
  private final IAccessoryPersistence accessories;
  private final IEventPersistence events;
  private final IEventsRoomPersistence events_rooms;
  private final IGroupPersistence groups;
  private final IGroupsPersonPersistence groups_people;
  private final IPersonPersistence people;
  private final IRoomPersistence rooms;
  private final ISchoolTermPersistence school_terms;
  private final ISubjectPersistence subjects;
  private final ITermSettingPersistence term_settings;
  private final IUserSettingPersistence user_settings;

  public MockDatabase1Impl(IDatabases databases) {
    this.accessories = new BaseMockAccessoryPersistenceImpl(databases);
    this.events = new BaseMockEventPersistenceImpl(databases);
    this.events_rooms = new BaseMockEventsRoomPersistenceImpl(databases);
    this.groups = new BaseMockGroupPersistenceImpl(databases);
    this.groups_people = new BaseMockGroupsPersonPersistenceImpl(databases);
    this.people = new BaseMockPersonPersistenceImpl(databases);
    this.rooms = new BaseMockRoomPersistenceImpl(databases);
    this.school_terms = new BaseMockSchoolTermPersistenceImpl(databases);
    this.subjects = new BaseMockSubjectPersistenceImpl(databases);
    this.term_settings = new BaseMockTermSettingPersistenceImpl(databases);
    this.user_settings = new BaseMockUserSettingPersistenceImpl(databases);
  }

  public IAccessoryPersistence accessories(){
    return accessories;
  }

  public IEventPersistence events(){
    return events;
  }

  public IEventsRoomPersistence eventsRooms(){
    return events_rooms;
  }

  public IGroupPersistence groups(){
    return groups;
  }

  public IGroupsPersonPersistence groupsPeople(){
    return groups_people;
  }

  public IPersonPersistence people(){
    return people;
  }

  public IRoomPersistence rooms(){
    return rooms;
  }

  public ISchoolTermPersistence schoolTerms(){
    return school_terms;
  }

  public ISubjectPersistence subjects(){
    return subjects;
  }

  public ITermSettingPersistence termSettings(){
    return term_settings;
  }

  public IUserSettingPersistence userSettings(){
    return user_settings;
  }

  public boolean deleteAll() throws IOException {
    boolean success = true;
    try {
      success &= accessories.deleteAll();
      success &= events.deleteAll();
      success &= events_rooms.deleteAll();
      success &= groups.deleteAll();
      success &= groups_people.deleteAll();
      success &= people.deleteAll();
      success &= rooms.deleteAll();
      success &= school_terms.deleteAll();
      success &= subjects.deleteAll();
      success &= term_settings.deleteAll();
      success &= user_settings.deleteAll();
    } catch (IOException e) {
      throw e;
    }
    return success;
  }

  public void disableCaching() {
    accessories.disableCaching();
    events.disableCaching();
    events_rooms.disableCaching();
    groups.disableCaching();
    groups_people.disableCaching();
    people.disableCaching();
    rooms.disableCaching();
    school_terms.disableCaching();
    subjects.disableCaching();
    term_settings.disableCaching();
    user_settings.disableCaching();
  }

  public void setAutoCommit(boolean autoCommit) {
    // Do nothing
  }

  public boolean getAutoCommit() {
    return true;
  }

  public void commit() {
    // Do nothing
  }

  public void rollback() {
    // Do nothing
  }
  
}
