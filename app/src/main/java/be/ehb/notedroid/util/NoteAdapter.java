package be.ehb.notedroid.util;

import android.content.Context;
import android.view.LayoutInflater;
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

    @Override
    public Filter getFilter() {
        return null;
    }

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

    @NonNull
    @Override
    public noteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View card = layoutInflater.inflate(R.layout.note_card, parent, false);

        return new noteViewHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull noteViewHolder holder, int position) {
        Note currentNote = items.get(position);
        holder.tvSetup.setText(currentNote.getTitle());
        holder.tvDate.setText(currentNote.getDate());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }public void addItems(ArrayList<Note> notes){
        items.addAll(notes);
    }
}