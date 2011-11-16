
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20111112181520 */
package javadb.timely.database_1.iface;

import javadb.timely.database_1.models.Person;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.IModelPersistence;

public interface IPersonPersistence extends IModelPersistence<Person> {
  public Person create(final String remember_token, final Long remember_created_at, final Integer sign_in_count, final Long current_sign_in_at, final Long last_sign_in_at, final String current_sign_in_ip, final String last_sign_in_ip, final String authentication_token, final String email, final String private_email, final String phone, final String firstname, final String lastname, final String type, final Long created_at, final Long updated_at) throws IOException;
  public Set<Person> findByRememberToken(String value)  throws IOException;
  public Set<Person> findByRememberCreatedAt(Long value)  throws IOException;
  public Set<Person> findBySignInCount(Integer value)  throws IOException;
  public Set<Person> findByCurrentSignInAt(Long value)  throws IOException;
  public Set<Person> findByLastSignInAt(Long value)  throws IOException;
  public Set<Person> findByCurrentSignInIp(String value)  throws IOException;
  public Set<Person> findByLastSignInIp(String value)  throws IOException;
  public Set<Person> findByAuthenticationToken(String value)  throws IOException;
  public Set<Person> findByEmail(String value)  throws IOException;
  public Set<Person> findByPrivateEmail(String value)  throws IOException;
  public Set<Person> findByPhone(String value)  throws IOException;
  public Set<Person> findByFirstname(String value)  throws IOException;
  public Set<Person> findByLastname(String value)  throws IOException;
  public Set<Person> findByType(String value)  throws IOException;
  public Set<Person> findByCreatedAt(Long value)  throws IOException;
  public Set<Person> findByUpdatedAt(Long value)  throws IOException;
}