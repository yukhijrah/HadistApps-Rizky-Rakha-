package com.example.admin.appshadist.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.admin.appshadist.DetailActivity;
import com.example.admin.appshadist.R;
import com.example.admin.appshadist.model.Doa;
import com.example.admin.appshadist.viewholder.DoaHolder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 08/10/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {
    Context context;
    private List<Doa> doaList;

    public DoaAdapter(Context context, List<Doa> doaList){
        this.context = context;
        this.doaList = doaList;
    }


    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa,parent, false);
        final DoaHolder doaHolder = new DoaHolder(itemView);

        doaHolder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = doaHolder.getAdapterPosition();
                Intent intent;
                intent = new Intent(doaHolder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", (Serializable) doaList.get(position));

                doaHolder.itemView.getContext().startActivity(intent);
            }
        });
        return doaHolder;
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        final Doa doa = doaList.get(position);
        holder.txtNamaDoa.setText(doa.getNama());
        holder.txtArtiDoa.setText(doa.getArti());
//        holder.txtNamaDoa.setText(doaList.get(position).getNama());
//        holder.txtArtiDoa.setText(doaList.get(position).getArti());

    }

    @Override
    public int getItemCount() {
        return doaList.size();
    }
}
