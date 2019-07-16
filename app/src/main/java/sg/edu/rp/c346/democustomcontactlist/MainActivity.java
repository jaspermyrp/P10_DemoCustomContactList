package sg.edu.rp.c346.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind UI //
        lvContact = findViewById(R.id.listViewContacts);

        // Init ArrayList //
        alContactList = new ArrayList<Contact>();

        // Add Contact objs to ArrayList //
        Contact contact1 = new Contact("Mary", 65, 65442334, 'F');
        Contact contact2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(contact1);
        alContactList.add(contact2);

        // Init CustomAdapter //
        caContact = new CustomAdapter(this, R.layout.row, alContactList);

        // Set Adapter to LV //
        lvContact.setAdapter(caContact);


    }
}
