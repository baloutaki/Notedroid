package be.ehb.notedroid.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import be.ehb.notedroid.R;
import be.ehb.notedroid.model.Note;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.noteViewHolder> implements Filterable {

    class noteViewHolder extends RecyclerView.ViewHolder {
        final TextView tvSetup;
        final TextView tvDate;
        final Button btnDetail;

        public noteViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSetup = itemView.findViewById(R.id.tv_setup);
            tvDate = itemView.findViewById(R.id.tv_date);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
    private ArrayList<Note> items;

    public  NoteAdapter(){
        items = new ArrayList<>();
    }
}