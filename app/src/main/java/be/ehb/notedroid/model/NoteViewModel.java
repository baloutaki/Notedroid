package be.ehb.notedroid.model;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class NoteViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Note>> notes;

    public MutableLiveData<ArrayList<Note>> getNotes(){
        if (notes == null){
            notes = new MutableLiveData<>();
            loadNotes();

        }
        return notes;
    }

    private  void loadNotes(){
        ArrayList<Note> newNotes = new ArrayList<>();

        newNotes.add(new Note("What to do today!", "Sporten", LocalDate.now()));
        newNotes.add(new Note("Diner", "Diner at 8 with friends", LocalDate.of(2020,02,25)));

        notes.setValue(newNotes);
    }


}
