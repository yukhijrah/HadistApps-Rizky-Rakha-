package com.example.admin.appshadist.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.admin.appshadist.R;

/**
 * Created by admin on 08/10/2018.
 */

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;
    public TextView txtSurah;

    //ini adalah constructor dari DoaHolder RecyclerView
    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
        txtSurah = (TextView) itemView.findViewById(R.id.txt_surah_doa)
    }
}
