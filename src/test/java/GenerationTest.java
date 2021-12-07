import info.dmerej.contacts.Contact;
import info.dmerej.contacts.ContactsGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class GenerationTest {


    @Test
    void contacts_generator_should_create_unique_email_for_contacts() {
        ContactsGenerator generator = new ContactsGenerator();
        Stream<Contact> contactStream = generator.generateContacts(10);
        long numberOfDistinctEmails = contactStream
                .map(Contact::getEmail)
                .distinct()
                .count();

        assertEquals(10, numberOfDistinctEmails);
    }

}
