package com.example.tugas14_rizky.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas14_rizky.DetailContactActivity;
import com.example.tugas14_rizky.R;
import com.example.tugas14_rizky.model.ContactModel;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVHolder>{
    private Context context;
    private List<ContactModel> listContact;

    public RVAdapter(Context context, List<ContactModel> listContact) {
        this.context = context;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public RVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new RVHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolder holder, int position) {
        ContactModel contactModel = listContact.get(position);
        holder.tv_nama.setText(contactModel.getNama());
        holder.cv_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailContactActivity.class);
                intent.putExtra("nama",contactModel.getNama());
                intent.putExtra("email",contactModel.getEmail());
                intent.putExtra("telepon",contactModel.getTelepon());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class RVHolder extends RecyclerView.ViewHolder {
        TextView tv_nama;
        CardView cv_contact;
        public RVHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama);
            cv_contact = itemView.findViewById(R.id.cv_contact);

        }
    }
}
