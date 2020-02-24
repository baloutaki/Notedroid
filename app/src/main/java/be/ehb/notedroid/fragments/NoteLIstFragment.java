package be.ehb.notedroid.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import be.ehb.notedroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoteLIstFragment extends Fragment {


    public NoteLIstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_note_list, container, false);

        RecyclerView rvNote = rootview.findViewById(R.id.rv_note);
        rvNote.setLayoutManager((new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false)));

        adapter = new NoteAdapter;
        rvNote.setAdapter(adapter);
    }

}

