
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.iface;

import javadb.timely.database_1.models.TermSetting;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.IModelPersistence;

public interface ITermSettingPersistence extends IModelPersistence<TermSetting> {
  public TermSetting create(final Integer term_id, final String name, final String value, final Long created_at, final Long updated_at) throws IOException;
  public Set<TermSetting> findByTermId(Integer value)  throws IOException;
  public Set<TermSetting> findByName(String value)  throws IOException;
  public Set<TermSetting> findByValue(String value)  throws IOException;
  public Set<TermSetting> findByCreatedAt(Long value)  throws IOException;
  public Set<TermSetting> findByUpdatedAt(Long value)  throws IOException;
}