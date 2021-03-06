
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.iface;

import javadb.timely.database_1.models.Event;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.IModelPersistence;

public interface IEventPersistence extends IModelPersistence<Event> {
  public Event create(final Integer subject_id, final Integer owner_id, final String owner_type, final Boolean is_private, final Integer override_id, final Integer parent_id, final Long start, final Long end, final String name, final Long created_at, final Long updated_at) throws IOException;
  public Set<Event> findBySubjectId(Integer value)  throws IOException;
  public Set<Event> findByOwnerId(Integer value)  throws IOException;
  public Set<Event> findByOwnerType(String value)  throws IOException;
  public Set<Event> findByIsPrivate(Boolean value)  throws IOException;
  public Set<Event> findByOverrideId(Integer value)  throws IOException;
  public Set<Event> findByParentId(Integer value)  throws IOException;
  public Set<Event> findByStart(Long value)  throws IOException;
  public Set<Event> findByEnd(Long value)  throws IOException;
  public Set<Event> findByName(String value)  throws IOException;
  public Set<Event> findByCreatedAt(Long value)  throws IOException;
  public Set<Event> findByUpdatedAt(Long value)  throws IOException;
}
