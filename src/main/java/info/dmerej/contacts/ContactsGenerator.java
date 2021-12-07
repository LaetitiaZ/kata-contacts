package info.dmerej.contacts;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {

    // TODO: generate a *lot* of contacts instead of just 3
    Contact[] contacts = new Contact[count];
    for(int i = 1; i<=count; i++){
      Contact contact = new Contact("name-"+i, "email-"+i+"@tld");
      contacts[i-1] = contact;
    }
    return Arrays.stream(contacts);
  }
}
