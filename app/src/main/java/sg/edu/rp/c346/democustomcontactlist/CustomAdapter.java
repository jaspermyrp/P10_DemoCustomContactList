package sg.edu.rp.c346.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactsList;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvCode = rowView.findViewById(R.id.tvCountryCode);
        TextView tvNumber = rowView.findViewById(R.id.tvPhoneNum);
        ImageView ivGender = rowView.findViewById(R.id.ivGender);

        Contact currentContact = contactsList.get(position);
        tvName.setText(currentContact.getName());
        tvCode.setText("+" + currentContact.getCountryCode());
        tvNumber.setText("" + currentContact.getPhoneNum());

        if(currentContact.getGender() == 'M'){
            ivGender.setImageResource(R.drawable.male);
        }

        return rowView;
    }
}
